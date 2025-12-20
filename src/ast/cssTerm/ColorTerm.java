package ast.cssTerm;

public class ColorTerm extends CssTerm {
    private String hex;
    public ColorTerm(int line_number, String hex) {
        super("ColorTerm", line_number);
        this.hex = hex;
    }
}
