package ast.simpleExpr;

import ast.ASTNode;

public abstract class SimpleExpression extends ASTNode {
    public SimpleExpression(String node_name, int line_number) {
        super(node_name, line_number);
    }
}
