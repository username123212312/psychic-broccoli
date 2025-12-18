package ast.css;

import ast.ASTNode;

import java.util.List;

public class SelectorDeclaration extends ASTNode {

    private List<CssSelectorList> selectorLists;
    public SelectorDeclaration(int line_number, List<CssSelectorList> selectorLists) {
        super("SelectorDeclaration", line_number);
        this.selectorLists = selectorLists;
    }
}
