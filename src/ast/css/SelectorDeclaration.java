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

    public List<CssSelectorList> getSelectorLists() {
        return selectorLists;
    }

    @Override
    public String generateCode() {
        if (selectorLists == null || selectorLists.isEmpty()) {
            return "";
        }

        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < selectorLists.size(); i++) {
            builder.append(selectorLists.get(i).generateCode());
            if (i < selectorLists.size() - 1) {
                builder.append(", ");
            }
        }
        return builder.toString();
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(super.toString()).append(" ( [ ");
        if (selectorLists != null) {
            for (CssSelectorList cssSelectorList : selectorLists) {
                stringBuilder.append(cssSelectorList.toString())
                        .append(selectorLists.indexOf(cssSelectorList)
                                == selectorLists.size() - 1 ? "" : ", ");
            }
        }
        return stringBuilder.toString();
    }
}
