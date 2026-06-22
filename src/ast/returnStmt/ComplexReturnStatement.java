package ast.returnStmt;

import ast.ASTNode;
import ast.compundStmt.PythonExpression;
import cpython_bytecode.codegen.CodegenContext;

public class ComplexReturnStatement extends ReturnStatement {
    private ASTNode expression;

    public ComplexReturnStatement(int line_number) {
        super("ComplexReturnStatement", line_number);
    }

    public void setPythonExpression(PythonExpression pythonExpression) {
        this.expression = pythonExpression;
    }

    public PythonExpression getPythonExpression() {
        return expression instanceof PythonExpression ? (PythonExpression) expression : null;
    }

    public void setExpression(ASTNode expression) {
        this.expression = expression;
    }

    public ASTNode getExpression() {
        return expression;
    }


    @Override
    public void generateBytecode(CodegenContext ctx) {
        if (expression != null) {
            expression.generateBytecode(ctx);
        } else {
            int noneIdx = ctx.addConstant("NONE_PLACEHOLDER");
            ctx.emitLoadConst(noneIdx);
        }
        ctx.emitReturnValue();
    }

    @Override
    public String toString() {
        return super.toString() + expression.toString();
    }
}
