package Ast_Web;

public class JinjaForNode extends AstNode {
<<<<<<< HEAD
=======

>>>>>>> d54e76de6f500ed28981183f66cc0addcb0448e8
    private String expression;
    private AstNode content;
    private AstNode elseContent;

    public JinjaForNode(String expression) {
        this.expression = expression;
    }

    public void setContent(AstNode content) {
        this.content = content;
        addChild(content);
    }

    public void setElseContent(AstNode elseContent) {
        this.elseContent = elseContent;
        addChild(elseContent);
    }

    public AstNode getContent() {
        return content;
    }

    public AstNode getElseContent() {
        return elseContent;
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
        return "{% for %}";
    }
}
>>>>>>> d54e76de6f500ed28981183f66cc0addcb0448e8
