package ast.argument;

import ast.ASTNode;
import ast.compundStmt.PythonExpression;

public abstract class Argument extends ASTNode {
    private PythonExpression arg;

    public Argument(String node_name, int line_number, PythonExpression arg) {
        super(node_name, line_number);
        this.arg = arg;
    }
}
