package ast.condition;

import ast.atom.Bool;
import cpython_bytecode.codegen.CodegenContext;

public class BooleanCondition extends Condition {
    private Bool boolValue;
    public BooleanCondition(int line_number) {
        super("BooleanCondition", line_number);
    }

    public void setBoolValue(Bool boolValue) {
        this.boolValue = boolValue;
    }

    public Bool getBoolValue() {
        return boolValue;
    }


    @Override
    public void generateBytecode(CodegenContext ctx) {
        if (boolValue != null && "True".equals(boolValue.getValue())) {
            ctx.emitLoadConst(ctx.addConstant(Boolean.TRUE));
        } else {
            ctx.emitLoadConst(ctx.addConstant(Boolean.FALSE));
        }
    }

    @Override
    public String toString() {
        return boolValue.toString();
    }
}
