package ast.cssTerm;

import ast.ASTNode;

import java.util.List;

public class CssFunctionArguments extends ASTNode {
    private List<CssTerm> cssTerms;

    public CssFunctionArguments(int line_number, List<CssTerm> cssTerms) {
        super("CssFunctionArguments", line_number);
        this.cssTerms = cssTerms;
    }
}
