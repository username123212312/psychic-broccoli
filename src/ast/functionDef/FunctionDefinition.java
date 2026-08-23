package ast.functionDef;

import ast.Consts;
import ast.Statement;
import ast.compundStmt.CompoundStatement;
import cpython_bytecode.codegen.CodegenContext;

public class FunctionDefinition extends CompoundStatement {
    private Decorator decorator;
    private String functionName;
    private FunctionParameters functionParameters;
    private Statement functionBody;

    public FunctionDefinition(int line_number) {
        super("FunctionDefinition", line_number);
    }

    public void setDecorator(Decorator decorator) {
        this.decorator = decorator;
    }

    public Decorator getDecorator() {
        return decorator;
    }

    public void setFunctionParameters(FunctionParameters functionParameters) {
        this.functionParameters = functionParameters;
    }

    public FunctionParameters getFunctionParameters() {
        return functionParameters;
    }

    public void setFunctionName(String functionName) {
        this.functionName = functionName;
    }

    public String getFunctionName() {
        return functionName;
    }

    public void setFunctionBody(Statement functionBody) {
        this.functionBody = functionBody;
    }

    public Statement getFunctionBody() {
        return functionBody;
    }

    @Override
    public String toString() {
        return super.toString() + "( " + (decorator == null ? "" : decorator.toString())
                + functionName + "(" + functionParameters.toString() + ") ) "
                + Consts.printIndent(2) + functionBody.toString()
                ;
    }


    @Override
    public void generateBytecode(CodegenContext ctx) {
        String funcName = functionName;
        boolean hasDecorator = (decorator != null);

        // Evaluate decorator expression at MODULE level so its bytecode
        // ends up in the module instruction stream, not inside the function.
        // loadVariableForCall inside decorator handles PUSH_NULL placement.
        if (hasDecorator) {
            decorator.generateBytecode(ctx);
        }

        ctx.pushFunctionScope(funcName, ctx.getFilename(), line_number);

        int argCount = 0;
        if (functionParameters != null && functionParameters.getParameters() != null) {
            for (FunctionParameter fp : functionParameters.getParameters()) {
                if (fp != null && fp.getId() != null) {
                    ctx.addVarName(fp.getId());
                    ctx.addAssignedLocal(fp.getId());
                    argCount++;
                }
            }
        }
        ctx.getCodeObject().co_argcount = argCount;

        if (functionBody != null) {
            ctx.collectGlobals(functionBody);
            ctx.collectLocals(functionBody);
        }

        if (functionBody != null) functionBody.generateBytecode(ctx);

        int noneIdx = ctx.addConstant("NONE_PLACEHOLDER");
        ctx.emitLoadConst(noneIdx);
        ctx.emitReturnValue();

        ctx.saveFunctionAndEmit(hasDecorator);
        ctx.storeVariable(funcName);
    }
}
