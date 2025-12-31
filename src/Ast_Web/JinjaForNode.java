package Ast_Web;

public class JinjaForNode extends AstNode {

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

    @Override
    public String toString() {
        return "{% for %}";
    }
}
