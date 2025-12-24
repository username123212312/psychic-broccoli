package ast.css;

import ast.ASTNode;
import ast.Consts;
import ast.Statement;

import java.util.List;

public class SelectorDeclaration extends ASTNode {

    private List<CssSelectorList> selectorLists;
    public SelectorDeclaration(int line_number, List<CssSelectorList> selectorLists) {
        super("SelectorDeclaration", line_number);
        this.selectorLists = selectorLists;
    }
    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(super.toString());
        for(CssSelectorList s : this.selectorLists){
            stringBuilder.append(Consts.STRING_INDENT).append(s.toString());
        }
        return stringBuilder.toString();
    }

}
