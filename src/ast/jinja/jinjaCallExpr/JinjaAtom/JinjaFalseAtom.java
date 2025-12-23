package ast.jinja.jinjaCallExpr.JinjaAtom;

public class JinjaFalseAtom extends JinjaAtom{
    private final boolean value = false;

    public JinjaFalseAtom( int line_number , boolean value) {
        super("JinjaFalseAtom node ", line_number);
    }

    public boolean getValue() {
        return value;
    }

}
