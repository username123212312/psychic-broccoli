package ast.cssTerm;

import ast.Consts;

public class IdentifierTerm extends CssTerm {
    private String id;
    public IdentifierTerm(int line_number ,String id ) {
        super("IdentifierTerm", line_number);
        this.id = id;
    }
    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(super.toString());
        if (this.id != null) {
            stringBuilder.append(Consts.STRING_INDENT)
                    .append(this.id);
        }
        return stringBuilder.toString();
    }

}
