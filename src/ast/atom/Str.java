package ast.atom;

public class Str extends Atom {

    public Str(int line_number, String str) {
        super("String", line_number, str);
    }
}
