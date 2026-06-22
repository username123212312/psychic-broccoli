package ast;

import ast.compundStmt.CompoundStatement;
import ast.condition.Condition;
import cpython_bytecode.codegen.CodegenContext;

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
    public void generateBytecode(CodegenContext ctx) {
        String startLabel = ctx.newLabel();
        String endLabel = ctx.newLabel();

        ctx.markLabel(startLabel);
        condition.generateBytecode(ctx);
        ctx.emitPopJumpIfFalse(endLabel);
        if (statement != null) statement.generateBytecode(ctx);
        ctx.emitJumpBackward(startLabel);

        ctx.markLabel(endLabel);
    }

    @Override
    public String toString() {
        return super.toString() + " ( " + (condition == null ? "" : condition.toString()) + " ) "
                + Consts.printIndent(2) + (statement == null ? "" : statement.toString()) ;
    }
}
