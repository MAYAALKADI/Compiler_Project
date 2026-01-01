package Ast_Paython.expr;

// expr/CompareExpr.java
public class CompareExpr extends Expr {
    public final Expr left, right;
    public final String op;
    public CompareExpr(Expr l, String op, Expr r) {
        this.left = l;
        this.op = op;
        this.right = r;
    }}