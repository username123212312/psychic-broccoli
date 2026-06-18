package ast.jinja.jinjaArg;

public class JinjaPositionalArgument extends JinjaArgument {

    public JinjaPositionalArgument(int line_number) {
        super("JinjaPositionalArgument", line_number);
    }

    @Override
    public String generateCode() {
        return ""; // مؤقتاً نعيد نصاً فارغاً لكي يعمل المشروع
    }


    @Override
    public String toString() {
        return super.toString() + " ( " + getArgument().toString() +" ) ";
    }
}
