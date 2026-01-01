package Ast_Web;

public class JinjaIfNode extends AstNode {
<<<<<<< HEAD
=======

>>>>>>> d54e76de6f500ed28981183f66cc0addcb0448e8
    private String condition;
    private AstNode content;

    public JinjaIfNode(String condition) {
        this.condition = condition;
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

    @Override
    public String toString() {
<<<<<<< HEAD
        return this.getClass().getSimpleName() + " @" + line + ":" + column;
    }
}
=======
        return "{% if %}";
    }
}
>>>>>>> d54e76de6f500ed28981183f66cc0addcb0448e8
