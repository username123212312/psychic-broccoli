package ast.assignStmt;

import ast.TemplateLiteral;
import cpython_bytecode.codegen.CodegenContext;

public class TemplateLiteralAssignmentStatement extends AssignmentStatement {
    private TemplateLiteral templateLiteral;
    public TemplateLiteralAssignmentStatement(int line_number) {
        super("TemplateLiteralAssignmentStatement", line_number);
    }

    public void setTemplateLiteral(TemplateLiteral templateLiteral) {
        this.templateLiteral = templateLiteral;
    }

    public TemplateLiteral getTemplateLiteral() {
        return templateLiteral;
    }


    @Override
    public void generateBytecode(CodegenContext ctx) {
        if (templateLiteral != null && templateLiteral.getContent() != null) {
            int strIdx = ctx.addConstant(templateLiteral.getContent());
            ctx.emitLoadConst(strIdx);
        } else {
            int noneIdx = ctx.addConstant("NONE_PLACEHOLDER");
            ctx.emitLoadConst(noneIdx);
        }
        ctx.storeVariable(ctx.extractVarName(getVar()));
    }

    @Override
    public String toString() {
        return super.toString() + templateLiteral.toString() + " ) ";
    }
}
