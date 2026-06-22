package ast.compundStmt;

import ast.Consts;
import ast.condition.Condition;
import ast.ElIfStatement;
import ast.Statement;
import cpython_bytecode.codegen.CodegenContext;

import java.util.List;

public class IfStatement extends CompoundStatement {
    private Condition condition;
    private Statement statement;
    private List<ElIfStatement> elifStatements;
    private Statement elseStatement;

    public IfStatement(int line_number) {
        super("IfStatement", line_number);
    }

    public void setElseStatement(Statement elseStatement) {
        this.elseStatement = elseStatement;
    }

    public Statement getElseStatement() {
        return elseStatement;
    }

    public void setElifStatements(List<ElIfStatement> elifStatements) {
        this.elifStatements = elifStatements;
    }

    public List<ElIfStatement> getElifStatements() {
        return elifStatements;
    }

    public void setCondition(Condition condition) {
        this.condition = condition;
    }

    public Condition getCondition() {
        return condition;
    }

    public void setStatement(Statement statement) {
        this.statement = statement;
    }

    public Statement getStatement() {
        return statement;
    }



    @Override
    public void generateBytecode(CodegenContext ctx) {
        String elseLabel = ctx.newLabel();
        String endLabel = ctx.newLabel();
        String currentElse = elseLabel;

        condition.generateBytecode(ctx);
        ctx.emitPopJumpIfFalse(currentElse);

        if (statement != null) statement.generateBytecode(ctx);

        if ((elifStatements != null && !elifStatements.isEmpty()) || elseStatement != null) {
            ctx.emitJumpForward(endLabel);
        }

        ctx.markLabel(currentElse);

        if (elifStatements != null) {
            for (ElIfStatement elif : elifStatements) {
                String nextElse = ctx.newLabel();
                elif.getCondition().generateBytecode(ctx);
                ctx.emitPopJumpIfFalse(nextElse);
                if (elif.getStatement() != null) elif.getStatement().generateBytecode(ctx);
                if (elifStatements.indexOf(elif) < elifStatements.size() - 1 || elseStatement != null) {
                    ctx.emitJumpForward(endLabel);
                }
                ctx.markLabel(nextElse);
            }
        }

        if (elseStatement != null) elseStatement.generateBytecode(ctx);

        ctx.markLabel(endLabel);
    }


    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(super.toString()).append(", ( ")
                .append(condition == null ? "Null" : condition.toString()).append(" )")
                .append(Consts.printIndent(2)).append(statement == null ? "Null"
                        : statement.toString());
        if (elifStatements != null) {
            for (ElIfStatement elIfStatement : elifStatements) {
                stringBuilder.append(Consts.printIndent(1)).append(elIfStatement.toString());
            }
        }
        if (elseStatement != null) {
            elseStatement.setNode_name("ElseStatement");
            stringBuilder.append(Consts.printIndent(1)).append(elseStatement.toString());
        }
        return stringBuilder.toString();
    }
}
