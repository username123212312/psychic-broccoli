package ast.css;

import ast.ASTNode;

public class CssDeclaration extends ASTNode {
    public CssDeclaration(int line_number) {
        super("CssDeclaration", line_number);
    }
}
