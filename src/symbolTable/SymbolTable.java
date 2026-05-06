package symbolTable;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class SymbolTable {

    private final Deque<Scope> scopes;
    private final List<Scope> exitedScopes;

    private static final class Scope {
        private final String name;
        private final int level;
        private final HashMap<String, SymbolEntry> table = new HashMap<>();
        private final HashSet<String> globalNames = new HashSet<>();

        private Scope(String name, int level) {
            this.name = name;
            this.level = level;
        }
    }

    public SymbolTable() {
        scopes = new ArrayDeque<>();
        exitedScopes = new ArrayList<>();
        allocate();   // create empty table
    }

    // allocate: create empty table
    public void allocate() {
        scopes.clear();
        exitedScopes.clear();
        scopes.push(new Scope("global", 0));
    }

    // free: clear table
    public void free() {
        allocate();
    }

    public void enterScope(String scopeName) {
        scopes.push(new Scope(scopeName, scopes.size()));
    }

    public void enterTemporaryScope(String statementKind, Object owner) {
        enterScope(buildTemporaryScopeName(statementKind, owner));
    }

    public String buildTemporaryScopeName(String statementKind, Object owner) {
        String normalizedKind = (statementKind == null || statementKind.isBlank())
                ? "statement"
                : statementKind.trim().toLowerCase();
        return normalizedKind + " statement " + System.identityHashCode(owner);
    }

    public void exitScope() {
        if (scopes.size() <= 1) {
            return;
        }
        exitedScopes.add(scopes.pop());
    }

    public void declareGlobal(String name) {
        currentScope().globalNames.add(name);
    }

    // lookup: search for a name
    public SymbolEntry lookup(String name) {
        for (Scope scope : scopes) {
            SymbolEntry entry = scope.table.get(name);
            if (entry != null) {
                return entry;
            }
        }
        for (int i = exitedScopes.size() - 1; i >= 0; i--) {
            Scope scope = exitedScopes.get(i);
            SymbolEntry entry = scope.table.get(name);
            if (entry != null) {
                return entry;
            }
        }
        return null;
    }

    public SymbolEntry lookupInCurrentScope(String name) {
        Scope currentScope = currentScope();
        if (currentScope == null) {
            return null;
        }
        return currentScope.table.get(name);
    }

    public boolean isDefinedInCurrentScope(String name) {
        return lookupInCurrentScope(name) != null;
    }

    // insert: add new entry
    public SymbolEntry insert(String name) {
        return define(name);
    }

    public SymbolEntry define(String name) {
        Scope targetScope = resolveWriteScope(name);
        if (targetScope.table.containsKey(name)) {
            System.out.println("Error: symbol '" + name + "' already defined in scope '" + targetScope.name + "'!");
            return null;
        }

        SymbolEntry entry = new SymbolEntry(name, targetScope.name, targetScope.level);
        targetScope.table.put(name, entry);
        return entry;
    }

    // set_attribute: add/update attribute of entry
    public void setAttribute(String name, String key, Object value) {
        Scope targetScope = resolveWriteScope(name);
        SymbolEntry entry = targetScope.table.get(name);
        if (entry == null) {
            entry = new SymbolEntry(name, targetScope.name, targetScope.level);
            targetScope.table.put(name, entry);
        }
        entry.setAttribute(key, value);
    }

    // get_attribute: retrieve attribute of entry
    public Object getAttribute(String name, String key) {
        SymbolEntry entry = lookup(name);
        if (entry == null) {
            System.out.println("Error: symbol '" + name + "' not defined!");
            return null;
        }
        return entry.getAttribute(key);
    }

    private Scope currentScope() {
        return scopes.peek();
    }

    private Scope rootScope() {
        return scopes.peekLast();
    }

    private Scope resolveWriteScope(String name) {
        Scope currentScope = currentScope();
        if (currentScope.globalNames.contains(name)) {
            return rootScope();
        }
        return currentScope;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\n=================== SYMBOL TABLE ===================\n");
        stringBuilder.append(String.format("%-20s | %-20s | %-20s | %s\n", "Symbol Name", "Scope", "Type", "Attributes"));
        stringBuilder.append("----------------------------------------------------\n");

        List<Scope> scopesToPrint = new ArrayList<>(exitedScopes);
        for (java.util.Iterator<Scope> scopeIterator = scopes.descendingIterator(); scopeIterator.hasNext(); ) {
            scopesToPrint.add(scopeIterator.next());
        }

        for (Scope scope : scopesToPrint) {
            for (Map.Entry<String, SymbolEntry> entry : scope.table.entrySet()) {
                String symbolName = entry.getKey();
                SymbolEntry symbolEntry = entry.getValue();

                Object type = symbolEntry.getAttribute("Type");
                String typeStr = (type != null) ? type.toString() : "null";

                Object value = symbolEntry.getAttribute("Value");
                String valueStr = (value != null) ? value.toString() : "null";

                stringBuilder.append(String.format("%-20s | %-20s | %-20s | %s\n",
                        symbolName, symbolEntry.getScopeName(), typeStr, valueStr));
            }
        }

        return stringBuilder.toString();
    }

}
