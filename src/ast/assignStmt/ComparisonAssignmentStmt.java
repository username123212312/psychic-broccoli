package ast.assignStmt;

import ast.Condition;
import ast.compundStmt.PythonExpression;

public class ComparisonAssignmentStmt extends AssignmentStatement {
    private Condition value;

    public ComparisonAssignmentStmt(int line_number, PythonExpression var) {
        super("ComparisonAssignStmt", line_number, var);
    }
}
