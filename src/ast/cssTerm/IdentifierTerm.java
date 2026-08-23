package ast.cssTerm;

public class IdentifierTerm extends CssTerm {
    public IdentifierTerm(int line_number) {
        super("Identifier", line_number);
    }

    @Override
    public String generateCode() {
        return getValue() != null ? getValue() : "";
    }

}
