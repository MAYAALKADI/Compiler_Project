package Ast_Web;

public class StyleBlockNode extends AstNode {

    @Override
    public void accept(AstVisitor visitor) {}

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " @" + line + ":" + column;
    }
}