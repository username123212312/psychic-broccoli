package ast.argsList;

import ast.atom.Atom;

import java.util.List;

public class AtomArguments extends ArgumentsList {
    private List<Atom> args;
    public AtomArguments(int line_number, List<Atom> args) {
        super("AtomArguments", line_number);
        this.args = args;
    }
}
