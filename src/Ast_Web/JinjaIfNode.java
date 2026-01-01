package Ast_Web;

public class JinjaIfNode extends AstNode {
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
        return this.getClass().getSimpleName() + " @" + line + ":" + column;
    }
}