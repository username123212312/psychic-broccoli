package ast.cssTerm;

public class NumberTerm extends CssTerm{
    public NumberTerm(int line_number) {
        super("Number", line_number);
    }
    @Override
    public String generateCode() {
        return getValue() != null ? getValue() : "";
    }

}
