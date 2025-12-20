package ast.returnStmt;

import ast.ASTNode;

public abstract class ReturnStatement extends ASTNode {
    public ReturnStatement(String node_name, int line_number) {
        super(node_name, line_number);
    }
}
