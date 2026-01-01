package Ast_Paython.expr;

// expr/AndExpr.java
public class AndExpr extends Expr {
    public final Expr left, right;
    public AndExpr(Expr l, Expr r) { left = l; right = r; }
}