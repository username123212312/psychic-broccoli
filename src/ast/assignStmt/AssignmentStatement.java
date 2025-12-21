package ast.assignStmt;

import ast.ASTNode;
import ast.compundStmt.PythonExpression;

public abstract class AssignmentStatement extends ASTNode {
    private PythonExpression var;
    public AssignmentStatement(String node_name, int line_number, PythonExpression var) {
        super(node_name, line_number);
        this.var = var;
    }
}
