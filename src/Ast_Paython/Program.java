package Ast_Paython;

import java.util.List;
import Ast_Paython.stmt.Statement;

public class Program extends ASTNode {

    private final List<Statement> statements;

    public Program(List<Statement> statements) {
        this.statements = statements;
    }

    @Override
    public List<Statement> getChildren() {
        return statements;
    }
}