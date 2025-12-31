package Ast_Web;

/**
 * يمثل تعبير Jinja:
 * {{ expression }}
 * مثل: {{ product.name }} أو {{ url_for('index') }}
 */
public class JinjaExpressionNode extends AstNode {
    private String expression; // النص داخل {{ ... }}

    public JinjaExpressionNode(String expression) {
        // ننظف الأقواس للعرض
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

    @Override
    public String toString() {
        return "{{ " + expression + " }}";
    }
}
