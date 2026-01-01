package Ast_Web;

import java.util.ArrayList;
import java.util.List;

public class JsonArrayNode extends AstNode {
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

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " @" + line + ":" + column;
    }
}