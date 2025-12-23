package ast.cssTerm;

public class StringTerm extends CssTerm{
    private String text;
    public StringTerm(int line_number, String text) {
        super("StringTerm", line_number);
        this.text = text;
    }
}
