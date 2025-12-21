package ast.functionDef;

import ast.ASTNode;
import ast.atom.Atom;

public class FunctionParameter extends ASTNode {
    private String id;
    private Atom value;
    public FunctionParameter(int line_number, String id) {
        super("FunctionParameter", line_number);
        this.id = id;
    }

    public void setValue(Atom value) {
        this.value = value;
    }
}
