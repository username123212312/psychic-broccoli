package ast.assignStmt;

import ast.Imported;
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
        StringBuilder sb = new StringBuilder();
        sb.append("complexExpression [Line: ").append(this.line_number).append("] (complexExpression:" + complexExpression + ")");
        return sb.toString();
    }
}
