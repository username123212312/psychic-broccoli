package ast.jinja.jinjaExpression;

import ast.ASTNode;

public abstract class JinjaExpression extends ASTNode {
    public JinjaExpression(String node_name, int line_number) {
        super(node_name, line_number);
    }
}
