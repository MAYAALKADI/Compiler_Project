package Ast_Web;

public class JinjaExpressionNode extends AstNode {
    private String expression;

    public JinjaExpressionNode(String expression) {
        this.expression = expression
                .replace("{{", "")
                .replace("}}", "")
                .trim();
    }

    public String getExpression() {
        return expression;
    }

    @Override
    public void accept(AstVisitor visitor) {
        visitor.visit(this);
    }
}