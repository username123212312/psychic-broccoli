package ast.atomExpression;

import cpython_bytecode.codegen.CodegenContext;

public class DictionaryAccess extends AtomExpression {
    private String key;

    public DictionaryAccess(int line_number) {
        super("DictionaryAccess", line_number);
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getKey() {
        return key;
    }

    @Override
    public String symbolTablePrint() {
        return super.getVarName() + "[" + key + "]";
    }


    @Override
    public void generateBytecode(CodegenContext ctx) {
        String varName = getVarName();
        if (varName != null) ctx.loadVariable(varName);
        int keyIdx = ctx.addConstant(key);
        ctx.emitLoadConst(keyIdx);
        ctx.emitBinaryOp(26);
    }


    @Override
    public String toString() {
        return super.toString() + "[" + key + "]" + " ) ";
    }
}
