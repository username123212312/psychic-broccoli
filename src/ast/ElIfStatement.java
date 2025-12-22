package ast;

import ast.condition.Condition;

public class ElIfStatement extends ASTNode{
    private Condition condition;
    private Statement statement;

    public ElIfStatement(int line_number) {
        super("ElIfStatement", line_number);
    }

    public void setCondition(Condition condition) {
        this.condition = condition;
    }

    public void setStatement(Statement statement) {
        this.statement = statement;
    }
}
