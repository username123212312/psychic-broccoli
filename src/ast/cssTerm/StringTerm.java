package ast.cssTerm;

public class StringTerm extends CssTerm{
    public StringTerm(int line_number) {
        super("String", line_number);
    }

    @Override
    public String generateCode() {
        return ""; // مؤقتاً نعيد نصاً فارغاً لكي يعمل المشروع
    }

}
