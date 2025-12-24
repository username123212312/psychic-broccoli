package ast.cssTerm;

import ast.Consts;

public class UnitNumberTerm extends CssTerm {

    private double number;
    private String unit;

    public UnitNumberTerm(int line_number, double number, String unit ) {
        super("UnitNumberTerm", line_number);
        this.number = number ;
        this.unit = unit;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(super.toString());
        if (this.number != 0) {
            stringBuilder.append(Consts.STRING_INDENT)
                    .append(this.number);
        }
        if (this.unit != null) {
            stringBuilder.append(Consts.STRING_INDENT)
                    .append(this.unit);
        }
        return stringBuilder.toString();
    }
}
