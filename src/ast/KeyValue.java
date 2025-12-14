package ast;

import ast.atom.Atom;
import ast.simpleExpr.SimpleExpression;

public class KeyValue extends ASTNode {
    private Atom key;
    private SimpleExpression value;

    public KeyValue(int line_number, Atom key, SimpleExpression value) {
        super("KeyValue", line_number);
        this.key = key;
        this.value = value;
    }
}
