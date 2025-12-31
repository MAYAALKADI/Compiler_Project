package Ast_Web;

import java.util.ArrayList;
import java.util.List;

public class CssRuleNode extends AstNode {

    private CssSelectorNode selector;
    private List<CssDeclarationNode> declarations = new ArrayList<>();

    public CssRuleNode(CssSelectorNode selector, List<CssDeclarationNode> declarations) {
        this.selector = selector;
        addChild(selector);

        if (declarations != null)
            for (CssDeclarationNode d : declarations) {
                this.declarations.add(d);
                addChild(d);
            }
    }

    public CssSelectorNode getSelector() {
        return selector;
    }

    public List<CssDeclarationNode> getDeclarations() {
        return declarations;
    }

    @Override
    public void accept(AstVisitor visitor) {
        visitor.visit(this);
    }
}
