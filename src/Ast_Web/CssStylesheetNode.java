package Ast_Web;

import java.util.ArrayList;
import java.util.List;

public class CssStylesheetNode extends AstNode {
<<<<<<< HEAD
=======

>>>>>>> d54e76de6f500ed28981183f66cc0addcb0448e8
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
<<<<<<< HEAD

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " @" + line + ":" + column;
    }
}
=======
}
>>>>>>> d54e76de6f500ed28981183f66cc0addcb0448e8
