package ast.css;

import ast.ASTNode;

import java.util.List;

public class CssDeclarationList extends ASTNode {
    private List<CssDeclaration> declarations;
    public CssDeclarationList(int line_number, List<CssDeclaration> declarations) {
        super("CssDeclarationList", line_number);
        this.declarations = declarations;
    }
}
