package ast.assignStmt;

import ast.Consts;
import ast.arithmeticExpr.ArithmeticExpression;
import ast.compundStmt.PythonExpression;

public class ArithmeticAssignStatement extends AssignmentStatement {
    private ArithmeticExpression arithmeticExpression;
    public ArithmeticAssignStatement(int line_number) {
        super("ArithmeticAssignStatement", line_number);
    }

    public void setArithmeticExpression(ArithmeticExpression arithmeticExpression) {
        this.arithmeticExpression = arithmeticExpression;
    }

    @Override
    public String toString() {
        return super.toString() + arithmeticExpression.toString() + " ) ";
    }
}
