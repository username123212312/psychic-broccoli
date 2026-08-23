package ast.cssTerm;

import ast.ASTNode;

import java.util.List;

public class CssFunctionArguments extends ASTNode {
    private List<CssTerm> cssTerms;

    public CssFunctionArguments(int line_number) {
        super("CssFunctionArguments", line_number);
    }

    public void setCssTerms(List<CssTerm> cssTerms) {
        this.cssTerms = cssTerms;
    }

    public List<CssTerm> getCssTerms() {
        return cssTerms;
    }

    @Override
    public String generateCode() {
        if (cssTerms == null || cssTerms.isEmpty()) {
            return "";
        }
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < cssTerms.size(); i++) {
            builder.append(cssTerms.get(i).generateCode());
            if (i < cssTerms.size() - 1) {
                builder.append(", ");
            }
        }
        return builder.toString();
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        if(cssTerms != null){
            for(CssTerm cssTerm : cssTerms){
                stringBuilder.append(cssTerm)
                        .append(cssTerms.indexOf(cssTerm) == cssTerms.size() - 1 ? "" : ", ");
            }
        }
        return stringBuilder.toString();
    }
}
