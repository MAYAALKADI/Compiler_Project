package Ast_Paython.expr;

import java.util.List;

public class SubscriptExpr extends Expr {

    public final Expr target;
    public final Expr index;

    public SubscriptExpr(Expr target, Expr index) {
        this.target = target;
        this.index = index;
    }

    @Override
    public List<?> getChildren() {
        return List.of(target, index);
    }
}