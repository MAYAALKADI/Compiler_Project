package Ast_Paython.expr;

import java.util.List;

public class AttributeExpr extends Expr {

    public final Expr object;
    public final String name;

    public AttributeExpr(Expr object, String name) {
        this.object = object;
        this.name = name;
    }

    @Override
    public List<?> getChildren() {
        return List.of(object);
    }
}