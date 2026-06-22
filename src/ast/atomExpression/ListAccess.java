package ast.atomExpression;

import cpython_bytecode.codegen.CodegenContext;

public class ListAccess extends AtomExpression {
    private String index;

    public ListAccess(int line_number) {
        super("ListAccess", line_number);
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public String getIndex() {
        return index;
    }



    @Override
    public void generateBytecode(CodegenContext ctx) {
        String varName = getVarName();
        if (varName != null) ctx.loadVariable(varName);
        try {
            int idx = Integer.parseInt(index);
            int constIdx = ctx.addConstant(java.math.BigInteger.valueOf(idx));
            ctx.emitLoadConst(constIdx);
        } catch (NumberFormatException e) {
            int strIdx = ctx.addConstant(index);
            ctx.emitLoadConst(strIdx);
        }
        ctx.emitBinaryOp(26);
    }

    @Override
    public String toString() {
        return super.toString() + "[" + index + "]" + " ) ";
    }
}
