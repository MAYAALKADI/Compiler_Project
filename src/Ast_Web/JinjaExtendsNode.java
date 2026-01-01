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
}