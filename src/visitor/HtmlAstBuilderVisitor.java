package visitor;

import Ast_Web.*;
import antlr.UnifiedParser;
import antlr.UnifiedParserBaseVisitor;
import shared.SymbolTable;
import shared.Symbol;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ArrayDeque;
import java.util.Deque;

public class HtmlAstBuilderVisitor extends UnifiedParserBaseVisitor<AstNode> {

    private final Deque<String> elementStack = new ArrayDeque<>();
    private final SymbolTable symbols;
    private boolean extendsSeen = false;

    public HtmlAstBuilderVisitor(SymbolTable symbols) {
        this.symbols = symbols;
    }

    // ===== helpers =====
    private void setPos(AstNode n, org.antlr.v4.runtime.Token t) {
        if (n != null && t != null)
            n.setPosition(t.getLine(), t.getCharPositionInLine());
    }

    private void insertRelaxed(String name, String kind) {
        try {
            symbols.insert(name, kind);
        } catch (RuntimeException e) {
            // تجاهل التكرار (HTML مسموح)
        }
    }

    private void insertStrict(String name, String kind) {
        symbols.insert(name, kind);
    }

    // ===== Program =====
    @Override
    public AstNode visitProgram(UnifiedParser.ProgramContext ctx) {
        symbols.enterScope("Program");
        ProgramNode program = new ProgramNode();
        setPos(program, ctx.start);

        for (var child : ctx.children) {
            AstNode node = visit(child);
            if (node != null) program.addChild(node);
        }

        symbols.exitScope();
        return program;
    }

    // ===== HtmlDocument =====
    @Override
    public AstNode visitHtmlDocument(UnifiedParser.HtmlDocumentContext ctx) {
        extendsSeen = false;
        symbols.enterScope("HtmlDocument");

        HtmlGroupNode group = new HtmlGroupNode();
        setPos(group, ctx.start);

        for (var child : ctx.children) {
            AstNode n = visit(child);
            if (n != null) group.addChild(n);
        }

        symbols.exitScope();
        return group;
    }

    // ===== Elements =====
    @Override
    public AstNode visitNormalElement(UnifiedParser.NormalElementContext ctx) {
        String tagName = ctx.startTag().NAME().getText();
        elementStack.push(tagName);

        HtmlElementNode element = new HtmlElementNode(tagName);
        setPos(element, ctx.start);

        if ("form".equals(tagName)) {
            symbols.enterScope("<form>");
            insertStrict(tagName, "HtmlElement");
        } else {
            insertRelaxed(tagName, "HtmlElement");
        }

        for (UnifiedParser.AttributeContext attrCtx : ctx.startTag().attribute()) {
            HtmlAttributeNode attr = (HtmlAttributeNode) visit(attrCtx);
            element.addAttribute(attr);
        }

        if (ctx.content() != null) {
            for (UnifiedParser.ElementContext elCtx : ctx.content().element()) {
                AstNode child = visit(elCtx);
                if (child != null) element.addChild(child);
            }
            for (UnifiedParser.MiscContext miscCtx : ctx.content().misc()) {
                AstNode child = visit(miscCtx);
                if (child != null) element.addChild(child);
            }
        }

        if ("form".equals(tagName)) {
            symbols.exitScope();
        }

        elementStack.pop();
        return element;
    }

    @Override
    public AstNode visitSelfClosingTag(UnifiedParser.SelfClosingTagContext ctx) {
        String tagName = ctx.NAME().getText();
        elementStack.push(tagName);

        HtmlElementNode element = new HtmlElementNode(tagName);
        setPos(element, ctx.start);
        insertRelaxed(tagName, "HtmlElement");

        for (UnifiedParser.AttributeContext attrCtx : ctx.attribute()) {
            HtmlAttributeNode attr = (HtmlAttributeNode) visit(attrCtx);
            element.addAttribute(attr);
        }

        elementStack.pop();
        return element;
    }

    @Override
    public AstNode visitVoidHtmlElement(UnifiedParser.VoidHtmlElementContext ctx) {
        String tagName = ctx.voidName().getText();
        elementStack.push(tagName);

        HtmlElementNode element = new HtmlElementNode(tagName);
        setPos(element, ctx.start);
        insertRelaxed(tagName, "HtmlElement");

        for (UnifiedParser.AttributeContext attrCtx : ctx.attribute()) {
            HtmlAttributeNode attr = (HtmlAttributeNode) visit(attrCtx);
            element.addAttribute(attr);
        }

        elementStack.pop();
        return element;
    }

    // ===== Attribute (التعديل المهم هنا) =====
    @Override
    public AstNode visitAttribute(UnifiedParser.AttributeContext ctx) {

        String name = ctx.NAME().getText();
        String value = (ctx.ATTR_VALUE() != null) ? ctx.ATTR_VALUE().getText() : "";

        HtmlAttributeNode node = new HtmlAttributeNode(name, value);
        setPos(node, ctx.start);

        String currentScope = symbols.getCurrentScopeName();
        if ("JinjaBlock".equals(currentScope)) return node;
        if (isNonSemanticHtmlAttribute(name)) return node;

        String elementName =
                elementStack.isEmpty() ? "<unknown>" : elementStack.peek();
        String compositeKey = elementName + "." + name;

        // ✅ لا ندرج إذا كان موجود ضمن نفس السكوب
        if (symbols.lookupInCurrentScope(compositeKey) == null) {
            insertStrict(compositeKey, "HtmlAttribute");

            Symbol s = symbols.lookupInCurrentScope(compositeKey);
            if (s != null) {
                s.setAttribute("attr", name);
                s.setAttribute("value", value);
                s.setAttribute("element", elementName);
            }
        }

        return node;
    }

    private boolean isNonSemanticHtmlAttribute(String name) {
        return name.equals("class")
                || name.equals("required")
                || name.equals("checked")
                || name.equals("disabled")
                || name.equals("readonly")
                || name.equals("multiple");
    }

    // ===== الباقي (Jinja / CSS / JSON) بدون تغيير =====
    // لم ألمس أي منطق آخر لأنّه صحيح ومترابط مع SymbolTable








// Jinja
    @Override
    public AstNode visitJinjaIf(UnifiedParser.JinjaIfContext ctx) {
        symbols.enterScope("JinjaIf");
        JinjaIfNode ifNode = new JinjaIfNode(ctx.getText());
        setPos(ifNode, ctx.start);

        if (ctx.content() != null) {
            for (UnifiedParser.ElementContext elCtx : ctx.content().element()) {
                AstNode node = visit(elCtx);
                if (node != null) ifNode.addChild(node);
            }
            for (UnifiedParser.MiscContext miscCtx : ctx.content().misc()) {
                AstNode node = visit(miscCtx);
                if (node != null) ifNode.addChild(node);
            }
        }
        symbols.exitScope();
        return ifNode;
    }

    @Override
    public AstNode visitJinjaFor(UnifiedParser.JinjaForContext ctx) {
        symbols.enterScope("JinjaFor");
        JinjaForNode forNode = new JinjaForNode(ctx.getText());
        setPos(forNode, ctx.start);

        // content(0) للجزء الرئيسي، content(1) للـ else إن وجد
        if (ctx.content().size() > 0) {
            var c = ctx.content(0);
            for (UnifiedParser.ElementContext elCtx : c.element()) {
                AstNode node = visit(elCtx);
                if (node != null) forNode.addChild(node);
            }
            for (UnifiedParser.MiscContext miscCtx : c.misc()) {
                AstNode node = visit(miscCtx);
                if (node != null) forNode.addChild(node);
            }
        }

        if (ctx.content().size() > 1) {
            var elseCtx = ctx.content(1);
            HtmlGroupNode elseGroup = new HtmlGroupNode();
            setPos(elseGroup, elseCtx.start);
            for (UnifiedParser.ElementContext elCtx : elseCtx.element()) {
                AstNode node = visit(elCtx);
                if (node != null) elseGroup.addChild(node);
            }
            for (UnifiedParser.MiscContext miscCtx : elseCtx.misc()) {
                AstNode node = visit(miscCtx);
                if (node != null) elseGroup.addChild(node);
            }
            forNode.setElseContent(elseGroup);
        }

        symbols.exitScope();
        return forNode;
    }

    @Override
    public AstNode visitJinjaBlock(UnifiedParser.JinjaBlockContext ctx) {
        symbols.enterScope("JinjaBlock");
        JinjaBlockNode block = new JinjaBlockNode(ctx.getText());
        setPos(block, ctx.start);
        insertStrict("block", "JinjaBlock");

        if (ctx.content() != null) {
            for (UnifiedParser.ElementContext elCtx : ctx.content().element()) {
                AstNode n = visit(elCtx);
                if (n != null) block.addChild(n);
            }
            for (UnifiedParser.MiscContext miscCtx : ctx.content().misc()) {
                AstNode n = visit(miscCtx);
                if (n != null) block.addChild(n);
            }
        }

        symbols.exitScope();
        return block;
    }

    @Override
    public AstNode visitJinjaExtends(UnifiedParser.JinjaExtendsContext ctx) {
        if (extendsSeen) {
          //  System.err.println("تحذير: أكثر من extends (تم تجاهل الزائد)");
            return null;
        }
        extendsSeen = true;
        JinjaExtendsNode node = new JinjaExtendsNode(ctx.getText());
        setPos(node, ctx.start);
        insertStrict("extends", "JinjaExtends");
        return node;
    }

    // CSS
    @Override
    public AstNode visitCssStylesheet(UnifiedParser.CssStylesheetContext ctx) {
        symbols.enterScope("CssStylesheet");
        List<CssRuleNode> rules = new ArrayList<>();
        for (UnifiedParser.RuleSetContext ruleCtx : ctx.ruleSet()) {
            rules.add((CssRuleNode) visit(ruleCtx));
        }
        CssStylesheetNode sheet = new CssStylesheetNode(rules);
        setPos(sheet, ctx.start);
        symbols.exitScope();
        return sheet;
    }


    @Override
    public AstNode visitStyleBlock(UnifiedParser.StyleBlockContext ctx) {
        StyleBlockNode style = new StyleBlockNode();
        setPos(style, ctx.start);

        if (ctx.cssStylesheet() != null) {
            AstNode css = visit(ctx.cssStylesheet());
            style.addChild(css);
        }
        return style;
    }





    @Override
    public AstNode visitRuleSet(UnifiedParser.RuleSetContext ctx) {
        symbols.enterScope("CssRule");
        CssSelectorNode selector = (CssSelectorNode) visit(ctx.selector());
        List<CssDeclarationNode> declarations = new ArrayList<>();
        for (UnifiedParser.DeclarationContext declCtx : ctx.declaration()) {
            declarations.add((CssDeclarationNode) visit(declCtx));
        }
        // إدراج السيلكتور كرمز
        insertRelaxed(selector.getName(), "CssSelector");
        CssRuleNode rule = new CssRuleNode(selector, declarations);
        setPos(rule, ctx.start);
        symbols.exitScope();
        return rule;
    }

    @Override
    public AstNode visitSelector(UnifiedParser.SelectorContext ctx) {
        CssSelectorNode sel = new CssSelectorNode(Collections.singletonList(ctx.getText()));
        setPos(sel, ctx.start);
        return sel;
    }

    @Override
    public AstNode visitDeclaration(UnifiedParser.DeclarationContext ctx) {
        String property = ctx.property().getText();
        String value = ctx.valueGroup().getText();
        CssDeclarationNode d = new CssDeclarationNode(property, value);
        setPos(d, ctx.start);

        try {
            insertStrict(property, "CssProperty");
            Symbol s = symbols.lookupInCurrentScope(property);
            if (s != null) s.setAttribute("value", value);
        } catch (RuntimeException e) {
            // إن وجد نفس الخاصية داخل نفس السكوب، نتجاهل
        }
        return d;
    }

    // JSON
    @Override
    public AstNode visitJsonDocument(UnifiedParser.JsonDocumentContext ctx) {
        symbols.enterScope("JsonDocument");
        AstNode result = null;
        if (ctx.object() != null) result = visit(ctx.object());
        if (ctx.array() != null) result = visit(ctx.array());
        if (result != null) setPos(result, ctx.start);
        symbols.exitScope();
        return result;
    }


    @Override
    public AstNode visitScriptJsonBlock(UnifiedParser.ScriptJsonBlockContext ctx) {
        AstNode json = null;
        if (ctx.jsonDocument() != null) {
            json = visit(ctx.jsonDocument());
        }
        ScriptJsonNode node = new ScriptJsonNode(json);
        setPos(node, ctx.start);
        return node;
    }


    @Override
    public AstNode visitObject(UnifiedParser.ObjectContext ctx) {
        symbols.enterScope("JsonObject");
        List<JsonPairNode> pairs = new ArrayList<>();
        for (UnifiedParser.PairContext pairCtx : ctx.pair()) {
            pairs.add((JsonPairNode) visit(pairCtx));
        }
        JsonObjectNode obj = new JsonObjectNode(pairs);
        setPos(obj, ctx.start);
        symbols.exitScope();
        return obj;
    }

    @Override
    public AstNode visitPair(UnifiedParser.PairContext ctx) {
        String key = ctx.STRING().getText();
        AstNode valueNode = visit(ctx.value());
        String valueStr = (valueNode != null) ? valueNode.toString() : "null";

        JsonPairNode node = new JsonPairNode(key, valueNode);
        setPos(node, ctx.start);

    insertStrict(key, "JsonKey");
    Symbol s = symbols.lookupInCurrentScope(key);
        if (s != null) s.setAttribute("value", valueStr);

        return node;
}

@Override
public AstNode visitArray(UnifiedParser.ArrayContext ctx) {
    symbols.enterScope("JsonArray");
    List<AstNode> elements = new ArrayList<>();
    for (UnifiedParser.ValueContext v : ctx.value()) {
        AstNode valueNode = visit(v);
        if (valueNode != null) elements.add(valueNode);
    }
    JsonArrayNode arrayNode = new JsonArrayNode(elements);
    setPos(arrayNode, ctx.start);
    symbols.exitScope();
    return arrayNode;
}

@Override
public AstNode visitMisc(UnifiedParser.MiscContext ctx) {
    if (ctx.TEXT() != null) {
        String text = ctx.TEXT().getText();
        if (text.trim().isEmpty()) return null;
        HtmlTextNode t = new HtmlTextNode(text.trim());
        setPos(t, ctx.start);
        return t;
    }
    if (ctx.JINJA_EXPR() != null) {
        JinjaExpressionNode j = new JinjaExpressionNode(ctx.JINJA_EXPR().getText());
        setPos(j, ctx.start);
        return j;
    }
    return visitChildren(ctx);
}

@Override
public AstNode visitContent(UnifiedParser.ContentContext ctx) {
    // محتوى يُعالج في أماكن أخرى
    return null;
}



}