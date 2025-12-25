package ast.complexExp;

import ast.atom.Atom;

public class KeyAccess extends ComplexExpression{
    private Atom var;
    private String key;

    public KeyAccess( int line_number) {
        super("KeyAccess", line_number);
    }

    public void setVar(Atom var) {
        this.var = var;
    }

    public void setKey(String key) {
        this.key = key;
    }

    @Override
    public String toString() {
        return var.toString() + "[ " + key + " ]";
    }
}
