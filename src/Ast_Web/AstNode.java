package Ast_Web;

import java.util.ArrayList;
import java.util.List;

public abstract class AstNode {
    protected final List<AstNode> children = new ArrayList<>();
    public int line = -1;
    public int column = -1;

    public void addChild(AstNode child) {
        if (child != null) children.add(child);
    }

    public List<AstNode> getChildren() { return children; }

    public void setPosition(int line, int column) {
        this.line = line;
        this.column = column;
    }

    public abstract void accept(AstVisitor visitor);
}