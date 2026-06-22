package ast.jinja.jinjaArg;

public class JinjaPositionalArgument extends JinjaArgument {

    public JinjaPositionalArgument(int line_number) {
        super("JinjaPositionalArgument", line_number);
    }

    @Override
    public String generateCode() {
        if (getArgument() != null) {
            return getArgument().generateCode();
        }
        return "";
    }


    @Override
    public String toString() {
        return super.toString() + " ( " + getArgument().toString() +" ) ";
    }
}
