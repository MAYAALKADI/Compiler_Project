package Ast_Web;

public class JsonPairNode extends AstNode {
<<<<<<< HEAD
=======

>>>>>>> d54e76de6f500ed28981183f66cc0addcb0448e8
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
<<<<<<< HEAD
        return this.getClass().getSimpleName() + " @" + line + ":" + column;
    }
}
=======
        return key;
    }
}
>>>>>>> d54e76de6f500ed28981183f66cc0addcb0448e8
