package Ast_Web;

public interface AstVisitor {
    void visit(ProgramNode node);
    void visit(HtmlElementNode node);
    void visit(HtmlAttributeNode node);
    void visit(HtmlTextNode node);
    void visit(JinjaBlockNode node);
    void visit(JinjaExpressionNode node);
    void visit(JinjaIfNode node);
    void visit(JinjaForNode node);
    void visit(JinjaExtendsNode node);
    void visit(CssStylesheetNode node);
    void visit(CssRuleNode node);
    void visit(CssSelectorNode node);
    void visit(CssDeclarationNode node);
    void visit(JsonObjectNode node);
    void visit(JsonArrayNode node);
    void visit(JsonPairNode node);
    void visit(JsonValueNode node);
}
