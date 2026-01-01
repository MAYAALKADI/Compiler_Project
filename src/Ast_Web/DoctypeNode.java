package Ast_Web;

public class DoctypeNode extends AstNode {
    private final String value;

    public DoctypeNode(String value) {
        this.value = value;
    }

    @Override
    public void accept(AstVisitor visitor) {}

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " @" + line + ":" + column;
    }
}