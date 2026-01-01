package Ast_Web;

import java.util.ArrayList;
import java.util.List;

public class ContentNode extends AstNode {
    private List<AstNode> children = new ArrayList<>();

    public void add(AstNode node) {
        children.add(node);
    }

    @Override
    public List<AstNode> getChildren() {
        return children;
    }

    @Override
    public void accept(AstVisitor visitor) { }
<<<<<<< HEAD

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " @" + line + ":" + column;
    }
}
=======
}
>>>>>>> d54e76de6f500ed28981183f66cc0addcb0448e8
