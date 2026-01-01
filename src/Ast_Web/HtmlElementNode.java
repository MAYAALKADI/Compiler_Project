package Ast_Web;

import java.util.ArrayList;
import java.util.List;

public class HtmlElementNode extends AstNode {
    private final String tagName;
    private final List<HtmlAttributeNode> attributes = new ArrayList<>();

    public HtmlElementNode(String tagName) {
        this.tagName = tagName;
    }

    public void addAttribute(HtmlAttributeNode attr) {
        attributes.add(attr);
        addChild(attr);
    }

    public String getTagName() {
        return tagName;
    }

    @Override
    public void accept(AstVisitor visitor) {
        visitor.visit(this);
    }
<<<<<<< HEAD
}
=======

    @Override
    public String toString() {
        return "<" + tagName + ">";
    }
}
>>>>>>> d54e76de6f500ed28981183f66cc0addcb0448e8
