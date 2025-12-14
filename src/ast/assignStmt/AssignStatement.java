package ast.assignStmt;

import ast.ASTNode;

public abstract class AssignStatement extends ASTNode {
    public AssignStatement(String node_name, int line_number) {
        super(node_name, line_number);
    }
}
