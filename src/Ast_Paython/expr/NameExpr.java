package Ast_Paython.expr;

import java.util.List;

public class NameExpr extends Expr {
    public final String name;

    public NameExpr(String name) {
        this.name = name;
    }

    @Override
    public List<?> getChildren() {
        return List.of();
    }
}