package ast.returnStmt;

import ast.atom.Atom;

public class SimpleReturnStatement extends ReturnStatement {
    private Atom atom;
    public SimpleReturnStatement(int line_number, Atom atom) {
        super("SimpleReturnStatement", line_number);
        this.atom = atom;
    }
}
