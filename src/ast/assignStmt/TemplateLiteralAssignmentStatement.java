package ast.assignStmt;

import ast.compundStmt.PythonExpression;

public class TemplateLiteralAssignmentStatement extends AssignmentStatement {

    public TemplateLiteralAssignmentStatement(int line_number) {
        super("TemplateLiteralAssignmentStatement", line_number);
    }
}
