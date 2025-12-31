package Ast_Web;

public class JinjaBlockNode extends AstNode {

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

    @Override
    public String toString() {
        return "{% block %}";
    }
}
