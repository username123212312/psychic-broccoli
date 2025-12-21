package ast.keyValue;

import ast.atom.Atom;

public class SimpleKeyValue extends KeyValue {
    public SimpleKeyValue(int line_number, Atom key) {
        super("SimpleKeyValue", line_number, key);
    }
}
