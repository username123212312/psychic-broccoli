package ast;

public class Imported extends ASTNode {
    private String name;
    private String alias;

    public Imported(int line_number) {
        super("Imported", line_number);
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getAlias() {
        return alias;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String generateCode() {
        return ""; // مؤقتاً نعيد نصاً فارغاً لكي يعمل المشروع
    }


    @Override
    public String toString() {
        String info = name + (alias == null ? "" : " as " + alias);
        return "ImportedElement: " + info + " [Line: " + this.line_number + "]";
    }
}
