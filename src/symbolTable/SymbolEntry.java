package symbolTable;

import java.util.HashMap;

public class SymbolEntry {
    private final String name;
    private final String scopeName;
    private final int scopeLevel;
    private final HashMap<String, Object> attributes = new HashMap<>();

    public SymbolEntry(String name) {
        this(name, "global", 0);
    }

    public SymbolEntry(String name, String scopeName, int scopeLevel) {
        this.name = name;
        this.scopeName = scopeName;
        this.scopeLevel = scopeLevel;
    }

    public void setAttribute(String key, Object value) {
        attributes.put(key, value);
    }

    public Object getAttribute(String key) {
        return attributes.get(key);
    }

    public String getName() {
        return name;
    }

    public String getScopeName() {
        return scopeName;
    }

    public int getScopeLevel() {
        return scopeLevel;
    }
}
