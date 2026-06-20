package ast.atom;

public class Number extends Atom{

    public Number(int line_number) {
        super("Number", line_number);
    }

    @Override
    public String generateCode() {
        return ""; // مؤقتاً نعيد نصاً فارغاً لكي يعمل المشروع
    }

}
