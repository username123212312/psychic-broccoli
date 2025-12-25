package ast.css;

import ast.ASTNode;

import java.util.List;

public class SelectorDeclaration extends ASTNode {

    private List<CssSelectorList> selectorLists;
    public SelectorDeclaration(int line_number) {
        super("SelectorDeclaration", line_number);
    }

    public void setSelectorLists(List<CssSelectorList> selectorLists) {
        this.selectorLists = selectorLists;
    }
}
