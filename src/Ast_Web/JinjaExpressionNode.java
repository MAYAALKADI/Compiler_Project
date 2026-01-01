package Ast_Web;

<<<<<<< HEAD
public class JinjaExpressionNode extends AstNode {
    private String expression;

    public JinjaExpressionNode(String expression) {
=======
/**
 * يمثل تعبير Jinja:
 * {{ expression }}
 * مثل: {{ product.name }} أو {{ url_for('index') }}
 */
public class JinjaExpressionNode extends AstNode {
    private String expression; // النص داخل {{ ... }}

    public JinjaExpressionNode(String expression) {
        // ننظف الأقواس للعرض
>>>>>>> d54e76de6f500ed28981183f66cc0addcb0448e8
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
<<<<<<< HEAD
}
=======

    @Override
    public String toString() {
        return "{{ " + expression + " }}";
    }
}
>>>>>>> d54e76de6f500ed28981183f66cc0addcb0448e8
