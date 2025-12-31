package Ast_Web;

public class ProgramNode extends AstNode {

    @Override
    public void accept(AstVisitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String toString() {
        return "Program";
    }
}
