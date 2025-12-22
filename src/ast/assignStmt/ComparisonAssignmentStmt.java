package ast.assignStmt;

import ast.condition.Condition;
import ast.compundStmt.PythonExpression;

public class ComparisonAssignmentStmt extends AssignmentStatement {
    private Condition value;

    public ComparisonAssignmentStmt(int line_number) {
        super("ComparisonAssignStmt", line_number);
    }
}
