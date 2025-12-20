package ast.jinja.jinjaCallExpr;

import ast.ASTNode;

public class JinjaVariableAccess extends ASTNode {
    private String dottedName;
    public JinjaVariableAccess(int line_number, String dottedName) {
        super("JinjaVariableAccess", line_number);
        this.dottedName = dottedName;
    }
}
