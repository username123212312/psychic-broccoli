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

    public List<CssSelector> getSelectors() {
        return selectors;
    }

    @Override
    public String generateCode() {
        if (selectors == null || selectors.isEmpty()) {
            return "";
        }
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < selectors.size(); i++) {
            builder.append(selectors.get(i).generateCode());
            if (i < selectors.size() - 1) {
                builder.append(" ");
            }
        }
        return builder.toString();
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(super.toString()).append(" ( [ ");
        if (selectors != null) {
            for (CssSelector cssSelector : selectors) {
                stringBuilder.append(cssSelector.toString())
                        .append(selectors.indexOf(cssSelector)
                                == selectors.size() - 1 ? "" : ", ");
            }
        }
        stringBuilder.append(" ] ) ");
        return stringBuilder.toString();
    }
}
