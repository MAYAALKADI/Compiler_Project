package Ast_Paython.stmt;

import java.util.List;
import Ast_Paython.expr.Expr;

public class ReturnStmt extends Statement {
    public final Expr value;

    public ReturnStmt(Expr value) {
        this.value = value;
    }

    @Override
    public List<?> getChildren() {
        return value == null ? List.of() : List.of(value);
    }
}