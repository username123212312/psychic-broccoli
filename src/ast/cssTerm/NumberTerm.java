package ast.cssTerm;

public class NumberTerm extends CssTerm{
    private double number;
    public NumberTerm(int line_number, double number) {
        super("NumberTerm", line_number);
        this.number = number;
    }
}
