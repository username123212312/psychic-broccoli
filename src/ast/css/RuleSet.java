package ast.css;

import ast.ASTNode;
import ast.Consts;
import ast.Statement;

public class RuleSet extends ASTNode {
    private SelectorDeclaration selectorDeclaration;
    private CssDeclarationList declarationList;
    public RuleSet(int line_number, SelectorDeclaration selectorDeclaration, CssDeclarationList declarationList) {
        super("RuleSet", line_number);
        this.selectorDeclaration = selectorDeclaration;
        this.declarationList = declarationList;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(super.toString());
        if (this.selectorDeclaration != null) {
            stringBuilder.append(Consts.STRING_INDENT)
                    .append(this.selectorDeclaration.toString());
        }
        if (this.declarationList != null) {
            stringBuilder.append(Consts.STRING_INDENT)
                    .append(this.declarationList.toString());
        }
        return stringBuilder.toString();
    }

}
