package Ast_Web;

public class DoctypeNode extends AstNode {
    private final String value;

    public DoctypeNode(String value) {
        this.value = value;
    }

    @Override
    public void accept(AstVisitor visitor) {}

    @Override
    public String toString() {
<<<<<<< HEAD
        return this.getClass().getSimpleName() + " @" + line + ":" + column;
    }
}
=======
        return "<!DOCTYPE html>";
    }
}
>>>>>>> d54e76de6f500ed28981183f66cc0addcb0448e8
