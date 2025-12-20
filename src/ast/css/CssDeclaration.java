package ast.css;

import ast.ASTNode;
import ast.cssTerm.CssTerm;

import java.util.List;

public class CssDeclaration extends ASTNode {
    private List<CssTerm> cssTermList;
    public CssDeclaration(int line_number, List<CssTerm> cssTermList) {
        super("CssDeclaration", line_number);
        this.cssTermList = cssTermList;
    }
}
