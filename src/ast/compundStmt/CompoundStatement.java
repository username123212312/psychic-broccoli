package ast.compundStmt;

import ast.ASTNode;
import ast.Statement;

public abstract class CompoundStatement extends ASTNode {
    public CompoundStatement(String node_name, int line_number) {
        super(node_name, line_number);
    }

}
