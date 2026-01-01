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
<<<<<<< HEAD
        return this.getClass().getSimpleName() + " @" + line + ":" + column;
    }
}
=======
        return "ScriptJson";
    }
}
>>>>>>> d54e76de6f500ed28981183f66cc0addcb0448e8
