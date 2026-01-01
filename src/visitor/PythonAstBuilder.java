package visitor;

import Ast_Paython.Program;
import Ast_Paython.stmt.*;
import Ast_Paython.expr.*;
import antlr.PythonParser;
import antlr.PythonParserBaseVisitor;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;
import shared.SymbolTable;

import java.util.ArrayList;
import java.util.List;

public class PythonAstBuilder extends PythonParserBaseVisitor<Object> {

    private final SymbolTable symbols;

    public PythonAstBuilder(SymbolTable symbols) {
        this.symbols = symbols;
    }

    private void setPos(Ast_Paython.ASTNode n, org.antlr.v4.runtime.Token t) {
        if (n != null && t != null) {
            n.line = t.getLine();
            n.column = t.getCharPositionInLine();
        }
    }

    // ========== Program ==========
    @Override
    public Object visitFile_input(PythonParser.File_inputContext ctx) {
        symbols.enterScope("PythonFile");

        List<Statement> stmts = new ArrayList<>();
        // نزور كل الأطفال ونأخذ أي شيء يرجع Statement
        for (int i = 0; i < ctx.getChildCount(); i++) {
            ParseTree ch = ctx.getChild(i);
            Object v = visit(ch);
            if (v instanceof Statement s) {
                stmts.add(s);
            }
        }

        Program p = new Program(stmts);
        setPos(p, ctx.getStart());
        symbols.exitScope();
        return p;
    }

    // ========== Simple statements ==========
    @Override
    public Object visitSimpleStatement(PythonParser.SimpleStatementContext ctx) {
        return visit(ctx.simple_stmt());
    }

    @Override
    public Object visitSimpleStmtLine(PythonParser.SimpleStmtLineContext ctx) {
        // لو small_stmt موجود، نزوره
        return (ctx.small_stmt() != null && !ctx.small_stmt().isEmpty())
                ? visit(ctx.small_stmt(0))
                : null;
    }

    // ========== Assign ==========
    @Override
    public Object visitAssignStmt(PythonParser.AssignStmtContext ctx) {
        // اسم المتغير
        String name = (ctx.NAME() != null) ? ctx.NAME().getText() : "<anonymous>";
        // قيمة التعبير
        Expr value = (ctx.expr() != null) ? (Expr) visit(ctx.expr()) : null;

        AssignStmt a = new AssignStmt(name, value);
        setPos(a, ctx.getStart());

        // رموز
        symbols.insert(name, "variable");
        return a;
    }

    // ========== Expression-only stmt ==========
    @Override
    public Object visitExprOnlyStmt(PythonParser.ExprOnlyStmtContext ctx) {
        // إن أردت تحويله إلى Statement لاحقًا، الآن نرجع null
        return null;
    }

    // ========== Function def ==========
    @Override
    public Object visitFuncDef(PythonParser.FuncDefContext ctx) {
        String name = (ctx.NAME() != null) ? ctx.NAME().getText() : "<anonymous>";

        // استخراج أسماء الباراميترات بدون الاعتماد على NAME() داخل param_list
        List<String> params = new ArrayList<>();
        if (ctx.param_list() != null) {
            params.addAll(extractParamNames(ctx.param_list()));
        }

        symbols.insert(name, "function");
        symbols.enterScope("function " + name);
        for (String p : params) symbols.insert(p, "parameter");

        // جسم الدالة: نزور suite بشكل عام
        List<Statement> body = collectSuite(ctx.suite());

        FunctionDef f = new FunctionDef(name, params, body);
        setPos(f, ctx.getStart());

        symbols.exitScope();
        return f;
    }

    // ========== Return ==========
    @Override
    public Object visitReturnStmt(PythonParser.ReturnStmtContext ctx) {
        Expr e = (ctx.expr() != null) ? (Expr) visit(ctx.expr()) : null;
        ReturnStmt r = new ReturnStmt(e);
        setPos(r, ctx.getStart());
        return r;
    }

    // ========== If ==========
    @Override
    public Object visitIfStmt(PythonParser.IfStmtContext ctx) {
        // الشرط (استخدم القاعدة المتاحة لديك؛ هنا افترضنا comparison)
        Expr cond = (ctx.comparison() != null) ? (Expr) visit(ctx.comparison()) : null;
        // then/else عبر suite عامة
        List<Statement> thenBlock = new ArrayList<>();
        List<Statement> elseBlock = null;

        if (ctx.suite() != null && !ctx.suite().isEmpty()) {
            thenBlock = collectSuite(ctx.suite(0));
            if (ctx.suite().size() > 1) {
                elseBlock = collectSuite(ctx.suite(1));
            }
        }

        IfStmt i = new IfStmt(cond, thenBlock, elseBlock);
        setPos(i, ctx.getStart());

        // سكوبات للـ then/else
        symbols.enterScope("if");
        // الرموز تُدرج داخل البناء بالفعل
        symbols.exitScope();

        if (elseBlock != null) {
            symbols.enterScope("else");
            symbols.exitScope();
        }

        return i;
    }




    // ========== Utilities ==========
    // استخراج أسماء الباراميترات من أي شكل للـ param_list عبر الأطفال
    private List<String> extractParamNames(PythonParser.Param_listContext paramsCtx) {
        List<String> names = new ArrayList<>();
        if (paramsCtx == null) return names;

        for (int i = 0; i < paramsCtx.getChildCount(); i++) {
            ParseTree ch = paramsCtx.getChild(i);
            if (ch instanceof TerminalNode tn) {
                // نلتقط أي NAME يظهر ضمن param_list
                if (tn.getSymbol() != null && tn.getSymbol().getType() == PythonParser.NAME) {
                    names.add(tn.getText());
                }
            }
        }
        return names;
    }

    // نجمع الـ statements من أي SuiteContext عبر زيارة الأطفال وإرجاع ما هو Statement
    private List<Statement> collectSuite(PythonParser.SuiteContext suite) {
        List<Statement> list = new ArrayList<>();
        if (suite == null) return list;

        for (int i = 0; i < suite.getChildCount(); i++) {
            ParseTree ch = suite.getChild(i);
            Object v = visit(ch);
            if (v instanceof Statement s) {
                list.add(s);
            }
        }
        return list;
    }


    private List<Expr> extractArgs(PythonParser.Arg_listContext ctx) {
        List<Expr> args = new ArrayList<>();
        if (ctx == null) return args;

        for (int i = 0; i < ctx.getChildCount(); i++) {
            ParseTree ch = ctx.getChild(i);
            if (ch instanceof PythonParser.ArgumentContext) {
                Object v = visit(ch);
                if (v instanceof Expr e) {
                    args.add(e);
                }
            }
        }
        return args;
    }





    // ========== Expressions ==========
    @Override
    public Object visitAtomNumber(PythonParser.AtomNumberContext ctx) {
        NumberExpr n = new NumberExpr(ctx.NUMBER().getText());
        setPos(n, ctx.getStart());
        return n;
    }

    @Override
    public Object visitAtomString(PythonParser.AtomStringContext ctx) {
        StringExpr s = new StringExpr(ctx.STRING().getText());
        setPos(s, ctx.getStart());
        return s;
    }

    @Override
    public Object visitAtomName(PythonParser.AtomNameContext ctx) {
        NameExpr n = new NameExpr(ctx.NAME().getText());
        setPos(n, ctx.getStart());
        return n;
    }

    // بقية التعابير (binary/unary) حسب الحاجة…

    @Override
    public Object visitAttrTrailer(PythonParser.AttrTrailerContext ctx) {
        String attrName = ctx.NAME().getText();

        // التعبير الأساسي هو نتيجة ما قبله
        Expr base = (Expr) visit(ctx.getParent());

        AttributeExpr a = new AttributeExpr(base, attrName);
        setPos(a, ctx.getStart());
        return a;
    }



    @Override
    public Object visitIndexTrailer(PythonParser.IndexTrailerContext ctx) {
        Expr target = (Expr) visit(ctx.getParent());
        Expr index  = (Expr) visit(ctx.expr());

        SubscriptExpr s = new SubscriptExpr(target, index);
        setPos(s, ctx.getStart());
        return s;
    }



    @Override
    public Object visitAtomExprPrimary(PythonParser.AtomExprPrimaryContext ctx) {

        Expr expr = (Expr) visit(ctx.primary());

        for (PythonParser.TrailerContext t : ctx.trailer()) {

            if (t instanceof PythonParser.CallTrailerContext call) {
                expr = new CallExpr(expr, extractArgs(call.arg_list()));
                setPos(expr, call.getStart());
            }

            else if (t instanceof PythonParser.AttrTrailerContext attr) {
                expr = new AttributeExpr(expr, attr.NAME().getText());
                setPos(expr, attr.getStart());
            }

            else if (t instanceof PythonParser.IndexTrailerContext idx) {
                expr = new SubscriptExpr(expr, (Expr) visit(idx.expr()));
                setPos(expr, idx.getStart());
            }
        }

        return expr;
    }




    @Override
    public Object visitComp_arison(PythonParser.Comp_arisonContext ctx) {
        Expr left = (Expr) visit(ctx.or_expr(0));

        for (int i = 1; i < ctx.or_expr().size(); i++) {
            String op = ctx.getChild(2 * i - 1).getText(); // ==, <, >, ...
            Expr right = (Expr) visit(ctx.or_expr(i));
            left = new CompareExpr(left, op, right);
            setPos(left, ctx.getStart());
        }

        return left;
    }




    @Override
    public Object visitOrExpr(PythonParser.OrExprContext ctx) {
        Expr expr = (Expr) visit(ctx.and_expr(0));

        for (int i = 1; i < ctx.and_expr().size(); i++) {
            expr = new OrExpr(expr, (Expr) visit(ctx.and_expr(i)));
            setPos(expr, ctx.getStart());
        }

        return expr;
    }



    @Override
    public Object visitAndExpr(PythonParser.AndExprContext ctx) {
        Expr expr = (Expr) visit(ctx.not_expr(0));

        for (int i = 1; i < ctx.not_expr().size(); i++) {
            expr = new AndExpr(expr, (Expr) visit(ctx.not_expr(i)));
            setPos(expr, ctx.getStart());
        }

        return expr;
    }



    @Override
    public Object visitNotExpr(PythonParser.NotExprContext ctx) {
        Expr inner = (Expr) visit(ctx.not_expr());
        NotExpr n = new NotExpr(inner);
        setPos(n, ctx.getStart());
        return n;
    }



}