package symbolTable;

import java.util.HashMap;
import java.util.Map;

public class SymbolTable {

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

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\n=================== SYMBOL TABLE ===================\n");
        stringBuilder.append(String.format("%-20s | %s\n", "Symbol Name", "Attributes"));
        stringBuilder.append("----------------------------------------------------\n");

        for (Map.Entry<String, SymbolEntry> entry : table.entrySet()) {
            String symbolName = entry.getKey();
            SymbolEntry symbolEntry = entry.getValue();

            Object value = symbolEntry.getAttribute("Value");
            String valueStr = (value != null) ? value.toString() : "null";

            stringBuilder.append(String.format("%-20s | %s\n",
                    symbolName, valueStr));
        }

        stringBuilder.append("=========================<I HATE COMPILER!>=========================\n");
        return stringBuilder.toString();
    }

}
