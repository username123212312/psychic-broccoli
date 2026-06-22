package ast.atomExpression;

public class LiteralExpression extends AtomExpression {
    private String literalValue;

    public LiteralExpression(int line_number) {
        super("LiteralExpression", line_number);
    }

    public void setLiteralValue(String literalValue) {
        this.literalValue = literalValue;
    }

    @Override
    public String symbolTablePrint() {
        return literalValue;
    }

    @Override
    public String generateCode() {
        return ""; // مؤقتاً نعيد نصاً فارغاً لكي يعمل المشروع
    }


    @Override
    public String toString() {
        return node_name + " [Line: " + line_number + "] ( " + literalValue + " ) ";
    }
}