package ast.assignStmt;

import ast.ASTNode;
import ast.compundStmt.CompoundStatement;
import ast.compundStmt.PythonExpression;

public abstract class AssignmentStatement extends CompoundStatement {
    private PythonExpression var;
    public AssignmentStatement(String node_name, int line_number) {
        super(node_name, line_number);
    }

    public void setVar(PythonExpression var) {
        this.var = var;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AssignmentStatement [Line: ").append(this.line_number).append("] (PythonExpression:" + var + ")");
        return sb.toString();
    }
}
