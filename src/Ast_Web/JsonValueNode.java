package Ast_Web;

public class JsonValueNode extends AstNode {
    private String type;
    private String val;

    public JsonValueNode(String type, String val) {
        this.type = type;
        this.val = val;
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