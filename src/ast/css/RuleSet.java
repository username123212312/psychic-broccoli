package ast.css;

import ast.ASTNode;

public class RuleSet extends ASTNode {
    private SelectorDeclaration selectorDeclaration;
    private CssDeclarationList declarationList;
    public RuleSet(int line_number, SelectorDeclaration selectorDeclaration, CssDeclarationList declarationList) {
        super("RuleSet", line_number);
        this.selectorDeclaration = selectorDeclaration;
        this.declarationList = declarationList;
    }
}
