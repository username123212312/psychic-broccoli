package ast.atom;

public class Str extends Atom {

    public Str(int line_number) {
        super("String", line_number);
    }

    @Override
    public String generateCode() {
        return getValue().toString();
    }
}
