package Ast_Web;

public class HtmlAttributeNode extends AstNode {
    private String name;
    private String value;

    public HtmlAttributeNode(String name, String value) {
        this.name = name;
        this.value = value;
    }

    @Override
    public void accept(AstVisitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String toString() {
        return name + "=" + value;
    }
}
