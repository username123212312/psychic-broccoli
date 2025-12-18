package ast.complexExp;

import ast.atom.Atom;

import java.util.List;

public class ExpressionList extends ComplexExpression {
    private List<Atom> expressions;

    public ExpressionList(int line_number, List<Atom> expressions) {
        super("ExpressionList", line_number);
        this.expressions = expressions;
    }
}
