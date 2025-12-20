package ast;

public class ElIfStatement extends ASTNode{
    private final Condition condition;
    private final Statement statement;

    public ElIfStatement(String node_name, int line_number, Condition condition, Statement statement) {
        super("ElIfStatement", line_number);
        this.condition = condition;
        this.statement = statement;
    }
}
