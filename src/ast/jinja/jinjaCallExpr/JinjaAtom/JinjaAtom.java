package ast.jinja.jinjaCallExpr.JinjaAtom;

import ast.ASTNode;

public abstract class JinjaAtom extends ASTNode {

    public JinjaAtom(String node_name, int line_number) {
        super(node_name, line_number);
    }
}
