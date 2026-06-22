package ast.assignStmt;

import ast.arithmeticExpr.ArithmeticExpression;
import cpython_bytecode.codegen.CodegenContext;

public class ArithmeticAssignStatement extends AssignmentStatement {
    private ArithmeticExpression value;
    public ArithmeticAssignStatement(int line_number) {
        super("ArithmeticAssignStatement", line_number);
    }

    public void setValue(ArithmeticExpression value) {
        this.value = value;
    }

    public ArithmeticExpression getValue() {
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
