package ast.atomExpression;

import cpython_bytecode.codegen.CodegenContext;

public class SimpleVariable extends AtomExpression {
    public SimpleVariable(int line_number) {
        super("SimpleVariable", line_number);
    }

    @Override
    public String symbolTablePrint() {
        return super.getVarName();
    }


    @Override
    public void generateBytecode(CodegenContext ctx) {
        ctx.loadVariable(getVarName());
    }

    @Override
    public String toString() {
        return super.toString() + " ) ";
    }

}
