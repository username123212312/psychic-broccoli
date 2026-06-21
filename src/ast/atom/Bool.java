package ast.atom;

public class Bool extends Atom{
    public Bool(int line_number) {
        super("Boolean", line_number);
    }

    @Override
    public String generateCode() {
        return ""; // مؤقتاً نصاً فارغاً لكي يعمل المشروع
    }


}
