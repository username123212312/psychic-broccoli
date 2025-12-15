package ast.assignStmt;

import ast.compundStmt.PythonExpression;

public class TemplateLiteralAssignStatement extends AssignStatement{

    public TemplateLiteralAssignStatement(String node_name, int line_number, PythonExpression var) {
        super(node_name, line_number, var);
    }
}
