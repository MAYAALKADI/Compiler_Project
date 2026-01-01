package Ast_Paython.stmt;

import java.util.List;
import Ast_Paython.expr.Expr;

public class AssignStmt extends Statement {

    public final String name;
    public final Expr value;

    public AssignStmt(String name, Expr value) {
        this.name = name;
        this.value = value;
    }

    @Override
    public List<?> getChildren() {
        return value == null ? List.of() : List.of(value);
    }
}