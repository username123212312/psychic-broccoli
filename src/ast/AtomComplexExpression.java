package ast;

import ast.atom.Atom;
import ast.complexExp.ComplexExpression;
import ast.compundStmt.PythonExpression;

import java.util.List;

public class AtomComplexExpression extends PythonExpression {
    private Atom atom;
    private List<ComplexExpression> complexExpressionList;

    public AtomComplexExpression(int line_number) {
        super("AtomComplexExpression", line_number);
    }

    public void setAtom(Atom atom) {
        this.atom = atom;
    }

    public void setComplexExpressionList(List<ComplexExpression> complexExpressionList) {
        this.complexExpressionList = complexExpressionList;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append(atom.toString());
        if (complexExpressionList != null) {
            for (ComplexExpression complexExpression : complexExpressionList) {
                stringBuilder.append(complexExpression.toString());
            }
        }
        return stringBuilder.toString();
    }
}
