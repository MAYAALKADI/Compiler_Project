package Ast_Web;

import java.util.ArrayList;
import java.util.List;

public class JsonObjectNode extends AstNode {

    private List<JsonPairNode> pairs = new ArrayList<>();

    public JsonObjectNode(List<JsonPairNode> pairs) {
        if (pairs != null)
            for (JsonPairNode p : pairs) {
                this.pairs.add(p);
                addChild(p);
            }
    }

    public List<JsonPairNode> getPairs() {
        return pairs;
    }

    @Override
    public void accept(AstVisitor visitor) {
        visitor.visit(this);
    }
}
