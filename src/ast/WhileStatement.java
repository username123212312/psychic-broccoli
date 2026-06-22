package ast;

import ast.compundStmt.CompoundStatement;
import ast.condition.Condition;

public class WhileStatement extends CompoundStatement {
    Condition condition;
    Statement statement;

    public WhileStatement(int line_number) {
        super("WhileStatement", line_number);
    }

    public Condition getCondition() {
        return condition;
    }

    public void setCondition(Condition condition) {
        this.condition = condition;
    }

    public Statement getStatement() {
        return statement;
    }

    public void setStatement(Statement statement) {
        this.statement = statement;
    }

    @Override
    public String symbolTablePrint() {
        return super.symbolTablePrint() + " ( " + (condition == null ? "" : condition.symbolTablePrint()) + " ) "
                + Consts.printIndent(2) + (statement == null ? "" : statement.symbolTablePrint());
    }

    @Override
    public String generateCode() {
        return ""; // مؤقتاً نعيد نصاً فارغاً لكي يعمل المشروع
    }


    @Override
    public String toString() {
        return super.toString() + " ( " + (condition == null ? "" : condition.toString()) + " ) "
                + Consts.printIndent(2) + (statement == null ? "" : statement.toString()) ;
    }
}
