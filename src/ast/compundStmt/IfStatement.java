package ast.compundStmt;

import ast.Condition;
import ast.ElIfStatement;
import ast.Statement;

import java.util.List;

public class IfStatement extends CompoundStatement {
    private final Condition condition;
    private final Statement statement;
    private List<ElIfStatement> elifStatements;
    private Statement elseStatement;

    public IfStatement(String node_name, int line_number, Condition condition, Statement statement) {
        super("IfStatement", line_number);
        this.condition = condition;
        this.statement = statement;
    }

    public void setElseStatement(Statement elseStatement) {
        this.elseStatement = elseStatement;
    }

    public void setElifStatements(List<ElIfStatement> elifStatements) {
        this.elifStatements = elifStatements;
    }
}
