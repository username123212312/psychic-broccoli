package ast.assignStmt;

import ast.compundStmt.PythonExpression;
import cpython_bytecode.codegen.CodegenContext;

public class PythonExpressionAssignStatement extends AssignmentStatement {
    private PythonExpression value;

    public PythonExpressionAssignStatement(int line_number) {
        super("PythonExpressionAssignStatement", line_number);
    }

    public void setValue(PythonExpression value) {
        this.value = value;
    }

    public PythonExpression getValue() {
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
    public String generateCode() {
        return ""; // مؤقتاً نعيد نصاً فارغاً لكي يعمل المشروع
    }


    @Override
    public String toString() {
        return super.toString() + (value == null ? "" : value.toString());
    }
}
