package Ast_Paython.expr;

import java.util.ArrayList;
import java.util.List;

public class CallExpr extends Expr {

    public final Expr callee;
    public final List<Expr> args;

    public CallExpr(Expr callee, List<Expr> args) {
        this.callee = callee;
        this.args = (args != null) ? args : new ArrayList<>();
    }

    @Override
    public List<?> getChildren() {
        List<Object> children = new ArrayList<>();
        if (callee != null) children.add(callee);
        children.addAll(args);
        return children;
    }
}