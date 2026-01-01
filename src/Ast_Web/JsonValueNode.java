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
<<<<<<< HEAD
        return this.getClass().getSimpleName() + " @" + line + ":" + column;
    }
}
=======
        return type + "=" + val;
    }
}
>>>>>>> d54e76de6f500ed28981183f66cc0addcb0448e8
