package ast.cssTerm;

import ast.ASTNode;
import ast.Consts;
import ast.Statement;

import java.util.List;

public class CssFunctionArguments extends ASTNode {
    private List<CssTerm> cssTerms;

    public CssFunctionArguments(int line_number, List<CssTerm> cssTerms) {
        super("CssFunctionArguments", line_number);
        this.cssTerms = cssTerms;
    }
    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(super.toString());
        for(CssTerm s : this.cssTerms){
            stringBuilder.append(Consts.STRING_INDENT).append(s.toString());
        }
        return stringBuilder.toString();
    }

}
