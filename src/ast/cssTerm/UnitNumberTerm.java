package ast.cssTerm;

public class UnitNumberTerm extends CssTerm {
    private String unitNumber;

    public UnitNumberTerm(int line_number, String unitNumber) {
        super("UnitNumberTerm", line_number);
        this.unitNumber = unitNumber;
    }
}
