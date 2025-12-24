package ast.cssTerm;

import ast.Consts;
import ast.Statement;

public class ColorTerm extends CssTerm {
    private String hex;
    public ColorTerm(int line_number, String hex) {
        super("ColorTerm", line_number);
        this.hex = hex;
    }
    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(super.toString());
        if (this.hex != null) {
            stringBuilder.append(Consts.STRING_INDENT)
                    .append(this.hex);
        }
        return stringBuilder.toString();
    }
}
