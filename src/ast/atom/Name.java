package ast.atom;

public class Name extends Atom {

    public Name(Str node_name, int line_number, String name) {
        super("Name", line_number, name);
    }

}
