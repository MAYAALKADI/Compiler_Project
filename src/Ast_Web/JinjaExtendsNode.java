package Ast_Web;

public class JinjaExtendsNode extends AstNode {
    private String template;

    public JinjaExtendsNode(String template) {
        this.template = template;
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
        return "{% extends " + template + " %}";
    }
}
>>>>>>> d54e76de6f500ed28981183f66cc0addcb0448e8
