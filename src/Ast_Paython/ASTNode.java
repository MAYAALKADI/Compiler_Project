package Ast_Paython;

import java.util.List;

public abstract class ASTNode {

    public int line = -1;
    public int column = -1;

    public List<?> getChildren() {
        return List.of();
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " @" + line + ":" + column;
    }
}