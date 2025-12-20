package ast.atom;

import ast.ASTNode;

public class Atom extends ASTNode {
    private String value;

    public Atom(String node_name, int line_number, String value) {
        super(node_name, line_number);
        this.value = value;
    }
}
