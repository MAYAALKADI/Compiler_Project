package Ast_Web;

public class CssDeclarationNode extends AstNode {
    private final String property;
    private final String value;

    public CssDeclarationNode(String property, String value) {
        this.property = property;
        this.value = value;
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
        return property + ": " + value;
    }
}
>>>>>>> d54e76de6f500ed28981183f66cc0addcb0448e8
