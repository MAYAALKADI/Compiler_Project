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
}