package ast.keyValue;

import ast.ASTNode;
import ast.atom.Atom;

public abstract class KeyValue extends ASTNode {
    private Atom key;

    public KeyValue(String node_name, int line_number, Atom key) {
        super(node_name, line_number);
        this.key = key;
    }
}
