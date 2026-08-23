package cpython_bytecode.codegen;

import ast.Program;
import cpython_bytecode.PythonCodeObject;
import cpython_bytecode.PythonOpCode;

public class CPythonBytecodeGenerator {

    public PythonCodeObject generate(Object astRootNode, String filename, String moduleName) {
        if (!(astRootNode instanceof Program program)) {
            throw new IllegalArgumentException("Expected Program AST node, got: " +
                    (astRootNode == null ? "null" : astRootNode.getClass().getName()));
        }
        return generate(program, filename, moduleName);
    }

    public PythonCodeObject generate(Program program, String filename, String moduleName) {
        CodegenContext ctx = new CodegenContext();
        ctx.initModule(moduleName, filename, 1);

        program.generateBytecode(ctx);

        int noneIdx = ctx.addConstant("NONE_PLACEHOLDER");
        ctx.emitLoadConst(noneIdx);
        ctx.emitReturnValue();

        return ctx.finishModule();
    }
}
