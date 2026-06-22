package ast.atom;

public class Name extends Atom {

    public Name(int line_number) {
        super("Name", line_number);
    }

    @Override
    public String generateCode() {
        return getValue().toString();
    }

}
