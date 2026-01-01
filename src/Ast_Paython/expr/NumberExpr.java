package Ast_Paython.expr;

import java.util.List;

public class NumberExpr extends Expr {
    public final String value;

    public NumberExpr(String value) {
        this.value = value;
    }

    @Override
    public List<?> getChildren() {
        return List.of();
    }
}