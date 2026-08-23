package ast.condition;

import ast.Consts;
import ast.compundStmt.PythonExpression;
import cpython_bytecode.codegen.CodegenContext;

public class NotExpression extends Condition {
    private PythonExpression pythonExpression;

    public NotExpression(int line_number) {
        super("NotExpression", line_number);
    }

    public void setPythonExpression(PythonExpression pythonExpression) {
        this.pythonExpression = pythonExpression;
    }

    public PythonExpression getPythonExpression() {
        return pythonExpression;
    }



    @Override
    public void generateBytecode(CodegenContext ctx) {
        if (pythonExpression != null) pythonExpression.generateBytecode(ctx);
        ctx.emitUnaryNot();
    }

    @Override
    public String generateCode() {
        return "";
    }

    @Override
    public String symbolTablePrint() {
        return "not " + pythonExpression.symbolTablePrint();
    }

    @Override
    public String toString() {
        return super.toString() + Consts.printIndent(1) +
                pythonExpression.toString();
    }
}
