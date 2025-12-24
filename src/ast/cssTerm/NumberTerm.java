package ast.cssTerm;

import ast.Consts;

public class NumberTerm extends CssTerm{
    private double number;
    public NumberTerm(int line_number, double number) {
        super("NumberTerm", line_number);
        this.number = number;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(super.toString());
        if (this.number != 0) {
            stringBuilder.append(Consts.STRING_INDENT)
                    .append(this.number);
        }
        return stringBuilder.toString();
    }
}
