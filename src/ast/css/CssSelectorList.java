package ast.css;

import ast.ASTNode;
import ast.Consts;
import ast.Statement;

import java.util.List;

public class CssSelectorList extends ASTNode {
    private List<CssSelector> selectors;
    public CssSelectorList(int line_number, List<CssSelector> selectors) {
        super("CssSelectorList", line_number);
        this.selectors = selectors;
    }
    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(super.toString());
        for(CssSelector s : this.selectors){
            stringBuilder.append(Consts.STRING_INDENT).append(s.toString());
        }
        return stringBuilder.toString();
    }
}
