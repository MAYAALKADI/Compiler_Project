package Ast_Web;

public class CssDeclarationNode extends AstNode {
    private final String property;
    private final String value;

    public CssDeclarationNode(String property, String value) {
        this.property = property;
        this.value = value;
    }

    @Override
    public void accept(AstVisitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " @" + line + ":" + column;
    }
}