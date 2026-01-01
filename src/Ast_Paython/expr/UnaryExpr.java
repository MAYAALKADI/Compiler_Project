package Ast_Paython.expr;

import java.util.List;

public class UnaryExpr extends Expr {
    public final String op;
    public final Expr expr;

    public UnaryExpr(String op, Expr expr) {
        this.op = op;
        this.expr = expr;
    }

    @Override
    public List<?> getChildren() {
        return expr == null ? List.of() : List.of(expr);
    }
}