package ast.assignStmt;

import ast.Condition;
import ast.compundStmt.PythonExpression;

public class ComparisonAssignStmt extends AssignStatement {
    private Condition value;

    public ComparisonAssignStmt(int line_number, PythonExpression var) {
        super("ComparisonAssignStmt", line_number, var);
    }
}
