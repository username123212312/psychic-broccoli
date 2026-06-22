package cpython_bytecode.codegen;

import java.util.ArrayList;
import java.util.List;

/**
 * Manages various name tuples (co_names, co_varnames, etc.) for a PythonCodeObject.
 */
public class NameManager {
    private final List<String> names = new ArrayList<>();
    private final List<String> varNames = new ArrayList<>();
    private final List<String> freeVars = new ArrayList<>();
    private final List<String> cellVars = new ArrayList<>();

    public int addName(String name) {
        return addToList(names, name);
    }

    public int addVarName(String name) {
        return addToList(varNames, name);
    }

    public int addFreeVar(String name) {
        return addToList(freeVars, name);
    }

    public int addCellVar(String name) {
        return addToList(cellVars, name);
    }

    private int addToList(List<String> list, String value) {
        int index = list.indexOf(value);
        if (index == -1) {
            index = list.size();
            list.add(value);
        }
        return index;
    }

    public List<String> getNames() { return new ArrayList<>(names); }
    public List<String> getVarNames() { return new ArrayList<>(varNames); }
    public List<String> getFreeVars() { return new ArrayList<>(freeVars); }
    public List<String> getCellVars() { return new ArrayList<>(cellVars); }

    public void clear() {
        names.clear();
        varNames.clear();
        freeVars.clear();
        cellVars.clear();
    }
}
