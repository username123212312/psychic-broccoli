package symbolTable;

import java.util.HashMap;

public class SymbolTable {

    // ------------------- Entry class -------------------
    public static class SymbolEntry {
        private final String name;
        private final HashMap<String, Object> attributes = new HashMap<>();

        public SymbolEntry(String name) {
            this.name = name;
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
    }

    // ------------------- SymbolTable core -------------------
    private HashMap<String, SymbolEntry> table;

    public SymbolTable() {
        allocate();   // create empty table
    }

    // allocate: create empty table
    public void allocate() {
        table = new HashMap<>();
    }

    // free: clear table
    public void free() {
        table.clear();
    }

    // lookup: search for a name
    public SymbolEntry lookup(String name) {
        return table.get(name);
    }

    // insert: add new entry
    public SymbolEntry insert(String name) {
        if (table.containsKey(name)) {
            System.out.println("Error: symbol '" + name + "' already defined!");
            return null;
        }

        SymbolEntry entry = new SymbolEntry(name);
        table.put(name, entry);
        return entry;
    }

    // set_attribute: add/update attribute of entry
    public void setAttribute(String name, String key, Object value) {
        SymbolEntry entry = lookup(name);
        if (entry == null) {
            System.out.println("Error: symbol '" + name + "' not defined!");
            return;
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
}
