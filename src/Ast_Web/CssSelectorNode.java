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
        return this.getClass().getSimpleName() + " @" + line + ":" + column;
    }
}