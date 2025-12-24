package ast.css;

import ast.ASTNode;
import ast.Consts;
import ast.cssTerm.CssTerm;

import java.util.List;

public class CssDeclarationList extends ASTNode {
    private List<CssDeclaration> declarations;
    public CssDeclarationList(int line_number, List<CssDeclaration> declarations) {
        super("CssDeclarationList", line_number);
        this.declarations = declarations;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(super.toString());
        for(CssDeclaration s : this.declarations){
            stringBuilder.append(Consts.STRING_INDENT).append(s.toString());
        }
        return stringBuilder.toString();
    }
}
