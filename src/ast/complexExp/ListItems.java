package ast.complexExp;

import ast.compundStmt.PythonExpression;
import cpython_bytecode.codegen.CodegenContext;

import java.util.List;

public class ListItems extends ComplexExpression {
    private List<PythonExpression> items;

    public ListItems(int line_number) {
        super("ExpressionList", line_number);
    }

    public void setItems(List<PythonExpression> items) {
        this.items = items;
    }

    public List<PythonExpression> getItems() {
        return items;
    }

    @Override
    public void generateBytecode(CodegenContext ctx) {
        if (items != null) {
            for (PythonExpression expr : items) {
                if (expr != null) expr.generateBytecode(ctx);
            }
            ctx.emitBuildTuple(items.size());
        } else {
            ctx.emitBuildTuple(0);
        }
    }
}
