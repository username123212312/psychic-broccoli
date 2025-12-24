package ast.cssTerm;

import ast.Consts;

public class StringTerm extends CssTerm{
    private String text;
    public StringTerm(int line_number, String text) {
        super("StringTerm", line_number);
        this.text = text;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(super.toString());
        if (this.text != null) {
            stringBuilder.append(Consts.STRING_INDENT)
                    .append(this.text);
        }
        return stringBuilder.toString();
    }
}
