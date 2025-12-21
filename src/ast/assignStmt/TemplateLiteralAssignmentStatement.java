package ast.assignStmt;

import ast.compundStmt.PythonExpression;

public class TemplateLiteralAssignmentStatement extends AssignmentStatement {

    public TemplateLiteralAssignmentStatement(String node_name, int line_number, PythonExpression var) {
        super(node_name, line_number, var);
    }
}
