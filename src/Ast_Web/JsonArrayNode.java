package Ast_Web;

import java.util.ArrayList;
import java.util.List;

public class JsonArrayNode extends AstNode {
<<<<<<< HEAD
=======

>>>>>>> d54e76de6f500ed28981183f66cc0addcb0448e8
    private List<AstNode> elements = new ArrayList<>();

    public JsonArrayNode(List<AstNode> elements) {
        if (elements != null)
            for (AstNode e : elements) {
                this.elements.add(e);
                addChild(e);
            }
    }

    public List<AstNode> getElements() {
        return elements;
    }

    @Override
    public void accept(AstVisitor visitor) {
        visitor.visit(this);
    }
<<<<<<< HEAD

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " @" + line + ":" + column;
    }
}
=======
}
>>>>>>> d54e76de6f500ed28981183f66cc0addcb0448e8
