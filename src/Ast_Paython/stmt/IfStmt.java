package Ast_Paython.stmt;

import Ast_Paython.expr.Expr;
import java.util.ArrayList;
import java.util.List;

public class IfStmt extends Statement {

    public final Expr condition;
    public final List<Statement> thenBlock;
    public final List<Statement> elseBlock;

    public IfStmt(Expr condition, List<Statement> thenBlock, List<Statement> elseBlock) {
        this.condition = condition;
        this.thenBlock = thenBlock;
        this.elseBlock = elseBlock;
    }

    @Override
    public List<?> getChildren() {
        List<Object> children = new ArrayList<>();
        if (condition != null) children.add(condition);
        if (thenBlock != null) children.addAll(thenBlock);
        if (elseBlock != null) children.addAll(elseBlock);
        return children;
    }
}