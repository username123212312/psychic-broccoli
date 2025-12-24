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

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        String info = name + (alias == null ? "" : " as " + alias);
        return "ImportedElement: " + info + " [Line: " + this.line_number + "]";
    }
}
