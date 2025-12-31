package shared;

import java.util.LinkedHashMap;
import java.util.Map;

public class Symbol {
    private final String name;
    private final String kind;   // HtmlElement, HtmlAttribute, JinjaBlock, CssProperty, JsonKey, function, variable, parameter ...
    private final String scope;  // اسم السكوب الحالي عند الإدراج
    private final Map<String, Object> attributes = new LinkedHashMap<>();

    public Symbol(String name, String kind, String scope) {
        this.name = name;
        this.kind = kind;
        this.scope = scope;
    }

    public String getName() { return name; }
    public String getKind() { return kind; }
    public String getScope() { return scope; }

    public void setAttribute(String key, Object value) { attributes.put(key, value); }
    public Map<String, Object> getAttributes() { return attributes; }

    @Override
    public String toString() {
        return name + " : " + kind + " @" + scope + " " + attributes;
    }
}