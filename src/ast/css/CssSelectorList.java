package ast.css;

import ast.ASTNode;

import java.util.List;

public class CssSelectorList extends ASTNode {
    private List<CssSelector> selectors;
    public CssSelectorList(int line_number) {
        super("CssSelectorList", line_number);
    }

    public void setSelectors(List<CssSelector> selectors) {
        this.selectors = selectors;
    }
}
