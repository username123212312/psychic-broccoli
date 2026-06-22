package ast.atomExpression;

import cpython_bytecode.codegen.CodegenContext;

public class LiteralExpression extends AtomExpression {
    private String literalValue;

    public LiteralExpression(int line_number) {
        super("LiteralExpression", line_number);
    }

    public void setLiteralValue(String literalValue) {
        this.literalValue = literalValue;
    }

    public String getLiteralValue() {
        return literalValue;
    }

    @Override
    public String symbolTablePrint() {
        return literalValue;
    }



    @Override
    public void generateBytecode(CodegenContext ctx) {
        Object constVal = cpython_bytecode.codegen.CodegenContext.parseLiteralValue(getLiteralValue());
        int idx = ctx.addConstant(constVal);
        ctx.emitLoadConst(idx);
    }

    @Override
    public String toString() {
        return node_name + " [Line: " + line_number + "] ( " + literalValue + " ) ";
    }
}