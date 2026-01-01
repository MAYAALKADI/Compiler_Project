package Ast_Web;

import java.util.List;

public class CssSelectorNode extends AstNode {
    private List<String> selectors;

    public CssSelectorNode(List<String> selectors) {
        this.selectors = selectors;
    }

    public String getName() {
        return selectors.get(0);
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
        return String.join(" ", selectors);
    }
}
>>>>>>> d54e76de6f500ed28981183f66cc0addcb0448e8
