package ast.atom;

public class Number extends Atom{

    public Number(Str node_name, int line_number, Double number) {
        super("Number", line_number, String.valueOf(number));
    }
}
