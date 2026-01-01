package Ast_Paython.expr;

// expr/OrExpr.java
public class OrExpr extends Expr {
    public final Expr left, right;
    public OrExpr(Expr l, Expr r) { left = l; right = r; }
}
