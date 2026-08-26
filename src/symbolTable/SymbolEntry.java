package symbolTable;

import java.util.HashMap;

public class SymbolEntry {
    public static final String SCOPE_GLOBAL = "global";
    public static final String SCOPE_FUNCTION = "function";
    public static final String SCOPE_BLOCK = "block";

    private final String name;
    private final String scopeName;
    private final int scopeLevel;
    private final String scopeKind;
    private final HashMap<String, Object> attributes = new HashMap<>();

    public SymbolEntry(String name) {
        this(name, "global", 0, SCOPE_GLOBAL);
    }

    public SymbolEntry(String name, String scopeName, int scopeLevel) {
        this(name, scopeName, scopeLevel, SCOPE_BLOCK);
    }

    public SymbolEntry(String name, String scopeName, int scopeLevel, String scopeKind) {
        this.name = name;
        this.scopeName = scopeName;
        this.scopeLevel = scopeLevel;
        this.scopeKind = (scopeKind == null || scopeKind.isBlank()) ? SCOPE_BLOCK : scopeKind;
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

    public String getScopeKind() {
        return scopeKind;
    }
}
