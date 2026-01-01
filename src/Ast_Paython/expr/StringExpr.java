package Ast_Paython.expr;

import java.util.List;

public class StringExpr extends Expr {
    public final String value;

    public StringExpr(String value) {
        this.value = value;
    }

    @Override
    public List<?> getChildren() {
        return List.of();
    }
}