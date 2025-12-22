package ast.assignStmt;

import ast.ASTNode;
import ast.compundStmt.PythonExpression;

public abstract class AssignmentStatement extends ASTNode {
    private PythonExpression var;
    public AssignmentStatement(String node_name, int line_number) {
        super(node_name, line_number);
    }

    public void setVar(PythonExpression var) {
        this.var = var;
    }
}
