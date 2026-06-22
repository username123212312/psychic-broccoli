package cpython_bytecode.codegen;

import java.util.ArrayList;
import java.util.List;

/**
 * Manages the constant pool (co_consts) for a PythonCodeObject.
 */
public class ConstantPoolManager {
    private final List<Object> constants = new ArrayList<>();

    /**
     * Adds a constant to the pool and returns its index.
     * If the constant already exists, its existing index is returned.
     */
    public int addConstant(Object value) {
        int index = constants.indexOf(value);
        if (index == -1) {
            index = constants.size();
            constants.add(value);
        }
        return index;
    }

    public List<Object> getConstants() {
        return new ArrayList<>(constants);
    }

    public void clear() {
        constants.clear();
    }
}
