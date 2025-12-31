package Ast_Web;

public class JsonPairNode extends AstNode {

    private String key;
    private AstNode value;

    public JsonPairNode(String key, AstNode value) {
        this.key = key;
        this.value = value;
        addChild(value);
    }

    public String getKey() {
        return key;
    }

    public AstNode getValue() {
        return value;
    }

    @Override
    public void accept(AstVisitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String toString() {
        return key;
    }
}
