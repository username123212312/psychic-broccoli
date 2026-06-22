package ast.atomExpression;

import ast.argsList.ArgumentsList;
import ast.compundStmt.PythonExpression;
import cpython_bytecode.codegen.CodegenContext;

public class FunctionCall extends AtomExpression {

    private ArgumentsList argumentsList;

    public FunctionCall(int line_number) {
        super("FunctionCall", line_number);
    }

    public void setArgumentsList(ArgumentsList argumentsList) {
        this.argumentsList = argumentsList;
    }

    public ArgumentsList getArgumentsList() {
        return argumentsList;
    }

    @Override
    public String symbolTablePrint() {
        return super.getVarName() + " ( " + argumentsList.symbolTablePrint() + " ) ";
    }


    @Override
    public void generateBytecode(CodegenContext ctx) {
        if (!ctx.loadVariableForCall(getVarName())) {
            ctx.emitPushNull();
        }

        java.util.List<Object> argList = ctx.collectArguments(argumentsList);
        int positionalCount = 0;
        int keywordCount = 0;
        for (Object arg : argList) {
            if (arg instanceof cpython_bytecode.codegen.CodegenContext.KeywordArgPlaceholder) {
                keywordCount++;
            } else {
                positionalCount++;
            }
        }
        java.util.List<String> keywordNames = new java.util.ArrayList<>();
        for (Object arg : argList) {
            if (arg instanceof cpython_bytecode.codegen.CodegenContext.KeywordArgPlaceholder kw) {
                keywordNames.add(kw.keywordName());
                kw.value().generateBytecode(ctx);
            } else if (arg instanceof PythonExpression pe) {
                pe.generateBytecode(ctx);
            } else if (arg instanceof ast.atom.Atom a) {
                ctx.emitAtom(a);
            }
        }
        if (keywordCount > 0) {
            int tupleIdx = ctx.addConstant(keywordNames);
            ctx.emitLoadConst(tupleIdx);
            ctx.emitCallKw(positionalCount + keywordCount);
        } else {
            ctx.emitCall(positionalCount);
        }
    }

    @Override
    public String toString() {
        return super.toString() + "( " + argumentsList.toString() + " ) )";
    }
}
