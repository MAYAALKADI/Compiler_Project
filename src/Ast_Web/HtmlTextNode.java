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
<<<<<<< HEAD
}
=======

    @Override
    public String toString() {
        return "\"" + text + "\"";
    }
}
>>>>>>> d54e76de6f500ed28981183f66cc0addcb0448e8
