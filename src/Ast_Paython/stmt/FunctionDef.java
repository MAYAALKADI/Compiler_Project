package Ast_Paython.stmt;

import java.util.List;

public class FunctionDef extends Statement {
    public final String name;
    public final List<String> params;
    public final List<Statement> body;

    public FunctionDef(String name, List<String> params, List<Statement> body) {
        this.name = name;
        this.params = params;
        this.body = body;
    }

    @Override
    public List<?> getChildren() {
        return body;
    }
}