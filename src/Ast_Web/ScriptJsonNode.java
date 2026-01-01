package Ast_Web;

public class ScriptJsonNode extends AstNode {
    private AstNode json;

    public ScriptJsonNode(AstNode json) {
        this.json = json;
        addChild(json);
    }

    @Override
    public void accept(AstVisitor visitor) {
        // اختياري
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " @" + line + ":" + column;
    }
}