package Ast_Web;

import java.util.ArrayList;
import java.util.List;

public class CssStylesheetNode extends AstNode {
    private List<CssRuleNode> rules = new ArrayList<>();

    public CssStylesheetNode(List<CssRuleNode> rules) {
        if (rules != null)
            for (CssRuleNode r : rules) {
                this.rules.add(r);
                addChild(r);
            }
    }

    public List<CssRuleNode> getRules() {
        return rules;
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