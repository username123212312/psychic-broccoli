package ast.keyValue;

import ast.atom.Atom;

public class AtomKeyValue extends KeyValue{
    private Atom value;
    public AtomKeyValue(int line_number, Atom key, Atom value) {
        super("AtomKeyValue", line_number, key);
        this.value = value;
    }
}
