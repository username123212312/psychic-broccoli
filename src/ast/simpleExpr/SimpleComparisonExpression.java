package ast.simpleExpr;

import ast.condition.Condition;
import cpython_bytecode.codegen.CodegenContext;

public class SimpleComparisonExpression extends SimpleExpression {
    private Condition condition;

    public SimpleComparisonExpression(int line_number) {
        super("SimpleComparisonExpression", line_number);
    }

    public void setCondition(Condition condition) {
        this.condition = condition;
    }

    public Condition getCondition() {
        return condition;
    }

    @Override
    public String symbolTablePrint() {
        return condition.symbolTablePrint();
    }


    @Override
    public void generateBytecode(CodegenContext ctx) {
        if (condition != null) condition.generateBytecode(ctx);
        else {
            int noneIdx = ctx.addConstant("NONE_PLACEHOLDER");
            ctx.emitLoadConst(noneIdx);
        }
    }

    @Override
    public String toString() {
        return condition.toString();
    }
}
