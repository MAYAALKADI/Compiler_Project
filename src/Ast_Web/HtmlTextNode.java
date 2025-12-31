package Ast_Web;

public class HtmlTextNode extends AstNode {
    private String text;

    public HtmlTextNode(String text) {
        this.text = text;
    }

    @Override
    public void accept(AstVisitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String toString() {
        return "\"" + text + "\"";
    }
}
