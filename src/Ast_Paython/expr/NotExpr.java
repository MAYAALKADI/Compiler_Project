package Ast_Paython.expr;

// expr/NotExpr.java
public class NotExpr extends Expr {
    public final Expr expr;
    public NotExpr(Expr e) { expr = e; }
}