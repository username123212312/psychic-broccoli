package ast;

public class Imported extends ASTNode{
    private String name;
    private String alias;

    public Imported(int line_number, String name) {
        super("Imported", line_number);
        this.name = name;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }
}
