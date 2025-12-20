package ast.jinja.jinjaArg;

import ast.ASTNode;

public abstract class JinjaArgument extends ASTNode {

    public JinjaArgument(String node_name, int line_number) {
        super(node_name, line_number);
    }
}
