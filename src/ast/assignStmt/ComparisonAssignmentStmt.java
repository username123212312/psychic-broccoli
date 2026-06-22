package ast.assignStmt;

import ast.condition.Condition;
import cpython_bytecode.codegen.CodegenContext;

public class ComparisonAssignmentStmt extends AssignmentStatement {
    private Condition value;

    public ComparisonAssignmentStmt(int line_number) {
        super("ComparisonAssignStmt", line_number);
    }

    public void setValue(Condition value) {
        this.value = value;
    }

    public Condition getValue() {
        return value;
    }

    @Override
    public void generateBytecode(CodegenContext ctx) {
        if (value != null) value.generateBytecode(ctx);
        else {
            int noneIdx = ctx.addConstant("NONE_PLACEHOLDER");
            ctx.emitLoadConst(noneIdx);
        }
        ctx.storeVariable(ctx.extractVarName(getVar()));
    }

    @Override
    public String toString() {
        return super.toString() + value.toString() + " ) ";
    }
}
