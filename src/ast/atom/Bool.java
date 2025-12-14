package ast.atom;

public class Bool extends Atom{
    public Bool(String node_name, int line_number, String value, boolean bool) {
        super("Boolean", line_number, String.valueOf(bool));
    }
}
