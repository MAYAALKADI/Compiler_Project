package shared;

import java.util.ArrayList;
import java.util.List;

public class SymbolTable {
    private final List<Scope> allScopes = new ArrayList<>();
    private Scope current;

    public SymbolTable() {
        current = new Scope(null, "Global");
        allScopes.add(current);
    }

    // سكوبات
    public void enterScope(String name) {
        current = new Scope(current, name);
        allScopes.add(current);
    }
    public void exitScope() { current = (current.getParent() != null) ? current.getParent() : current; }
    public Scope currentScope() { return current; }
    public String getCurrentScopeName() { return (current != null) ? current.getName() : "Global"; }
    public List<Scope> getAllScopes() { return allScopes; }

    // إدراج
    public void insert(String name, String kind) {
        // منع التكرار داخل السكوب نفسه
        if (current.getSymbols().containsKey(name)) {
            throw new RuntimeException("رمز '" + name + "' معرف مسبقاً داخل السكوب " + current.getName());
        }
        current.define(new Symbol(name, kind, current.getName()));
    }

    public Symbol lookup(String name) {
        return (current != null) ? current.resolve(name) : null;
    }

    public Symbol lookupInCurrentScope(String name) {
        return current.getSymbols().get(name);
    }

    // طباعة
    public void print() {
        System.out.println("\n================ SYMBOL TABLE (Shared) ================\n");
        int level = 0;
        for (Scope scope : allScopes) {
            System.out.println("🔹 Scope Level " + level + " (" + scope.getName() + ")");
            System.out.printf("%-20s %-18s %-16s %-30s%n", "Name", "Kind", "Scope", "Attributes");
            System.out.println("--------------------------------------------------------------------------");
            for (Symbol s : scope.getSymbols().values()) {
                System.out.printf("%-20s %-18s %-16s %-30s%n",
                        s.getName(), s.getKind(), s.getScope(), s.getAttributes().toString());
            }
            System.out.println();
            level++;
        }
    }
}