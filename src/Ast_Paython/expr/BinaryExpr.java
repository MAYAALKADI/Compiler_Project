package Ast_Paython.expr;

import java.util.List;

public class BinaryExpr extends Expr {
    public final Expr left;
    public final String op;
    public final Expr right;

    public BinaryExpr(Expr left, String op, Expr right) {
        this.left = left;
        this.op = op;
        this.right = right;
    }

    @Override
    public List<?> getChildren() {
        return List.of(left, right);
    }
}