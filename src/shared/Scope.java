package shared;

import java.util.LinkedHashMap;
import java.util.Map;

public class Scope {
    private final Scope parent;
    private final String name;
    private final Map<String, Symbol> symbols = new LinkedHashMap<>();

    public Scope(Scope parent, String name) {
        this.parent = parent;
        this.name = name;
    }

    public Scope getParent() { return parent; }
    public String getName() { return name; }
    public Map<String, Symbol> getSymbols() { return symbols; }

    public void define(Symbol symbol) { symbols.put(symbol.getName(), symbol); }
    public Symbol resolve(String name) {
        if (symbols.containsKey(name)) return symbols.get(name);
        return (parent != null) ? parent.resolve(name) : null;
    }
}