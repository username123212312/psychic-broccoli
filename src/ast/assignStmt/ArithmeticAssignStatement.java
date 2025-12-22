package ast.assignStmt;

import ast.arithmeticExpr.ArithmeticExpression;
import ast.compundStmt.PythonExpression;

public class ArithmeticAssignStatement extends AssignmentStatement {
    private ArithmeticExpression arithmeticExpression;
    public ArithmeticAssignStatement(int line_number) {
        super("ArithmeticAssignStatement", line_number);
    }


}
