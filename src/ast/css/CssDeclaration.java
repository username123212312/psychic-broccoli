package ast.css;

import ast.ASTNode;
import ast.Consts;
import ast.cssTerm.CssTerm;
import java.util.List;

public class CssDeclaration extends ASTNode {
    private List<CssTerm> cssTermList;
    public CssDeclaration(int line_number, List<CssTerm> cssTermList) {
        super("CssDeclaration", line_number);
        this.cssTermList = cssTermList;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(super.toString());
        for(CssTerm s : this.cssTermList){
            stringBuilder.append(Consts.STRING_INDENT).append(s.toString());
        }
        return stringBuilder.toString();
    }


}
