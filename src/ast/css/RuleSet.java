package ast.css;

import ast.ASTNode;

public class RuleSet extends ASTNode {
    private SelectorDeclaration selectorDeclaration;
    private CssDeclarationList declarationList;
    public RuleSet(int line_number) {
        super("RuleSet", line_number);
    }

    public void setSelectorDeclaration(SelectorDeclaration selectorDeclaration) {
        this.selectorDeclaration = selectorDeclaration;
    }

    public void setDeclarationList(CssDeclarationList declarationList) {
        this.declarationList = declarationList;
    }
}
