package ast.argument;

public class PositionalArgument extends Argument {

    public PositionalArgument(int line_number) {
        super("PositionalArgument", line_number);
    }

    @Override
    public String generateCode() {
        return ""; // مؤقتاً نعيد نصاً فارغاً لكي يعمل المشروع
    }

}
