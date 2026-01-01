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
<<<<<<< HEAD
}
=======

    @Override
    public String toString() {
        return name + "=" + value;
    }
}
>>>>>>> d54e76de6f500ed28981183f66cc0addcb0448e8
