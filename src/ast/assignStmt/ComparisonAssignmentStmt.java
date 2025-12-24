package ast.assignStmt;

import ast.condition.Condition;
import ast.compundStmt.PythonExpression;

public class ComparisonAssignmentStmt extends AssignmentStatement {
    private Condition value;

    public ComparisonAssignmentStmt(int line_number) {
        super("ComparisonAssignStmt", line_number);
    }

    public void setValue(Condition value) {
        this.value = value;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ComparisonAssignStmt [Line: ").append(this.line_number).append("] (Condition:" + value + ")");
        return sb.toString();
    }
}
