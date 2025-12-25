package ast.assignStmt;

import ast.complexExp.ComplexExpression;

public class ComplexExpressionAssignStatement extends AssignmentStatement {
    private ComplexExpression complexExpression;

    public ComplexExpressionAssignStatement(int line_number) {
        super("ComplexExpressionAssignStatement", line_number);
    }

    public void setComplexExpression(ComplexExpression complexExpression) {
        this.complexExpression = complexExpression;
    }

    @Override
    public String toString() {
        return super.toString() + complexExpression.toString() + " ) ";
    }
}
