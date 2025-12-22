package ast.atom;

import ast.ASTNode;

public class Atom extends ASTNode {
    private Object value;

    public Atom(String node_name, int line_number) {
        super(node_name, line_number);
    }

    public void setValue(Object value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value.toString();
    }
}
