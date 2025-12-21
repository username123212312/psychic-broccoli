package ast.css;

import ast.ASTNode;

import java.util.List;

public class CssSelectorList extends ASTNode {
    private List<CssSelector> selectors;
    public CssSelectorList(int line_number, List<CssSelector> selectors) {
        super("CssSelectorList", line_number);
        this.selectors = selectors;
    }
}
