package ast.css;

import ast.ASTNode;
import ast.Consts;

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

    public SelectorDeclaration getSelectorDeclaration() {
        return selectorDeclaration;
    }

    public CssDeclarationList getDeclarationList() {
        return declarationList;
    }

    @Override
    public String generateCode() {
        String selector = selectorDeclaration != null ? selectorDeclaration.generateCode() : "";
        String declarations = declarationList != null ? declarationList.generateCode() : "";
        if (selector.isBlank() || declarations.isBlank()) {
            return "";
        }

        String indentedDeclarations = declarations.replaceAll("(?m)^", "    ");

        return selector + " {\n" + indentedDeclarations + "\n}";
    }

    @Override
    public String toString() {
        return super.toString() + " ( "
                + selectorDeclaration.toString()
                + Consts.printIndent(6) + declarationList.toString();
    }
}
