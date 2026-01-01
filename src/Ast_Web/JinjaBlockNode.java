package Ast_Web;

public class JinjaBlockNode extends AstNode {
<<<<<<< HEAD
=======

>>>>>>> d54e76de6f500ed28981183f66cc0addcb0448e8
    private String name;
    private AstNode content;

    public JinjaBlockNode(String name) {
        this.name = name;
    }

    public void setContent(AstNode content) {
        this.content = content;
        addChild(content);
    }

    public AstNode getContent() {
        return content;
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
        return "{% block %}";
    }
}
>>>>>>> d54e76de6f500ed28981183f66cc0addcb0448e8
