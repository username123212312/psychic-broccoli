package ast.condition;

import ast.Consts;
import ast.comparisonOp.ComparisonOperator;
import ast.compundStmt.PythonExpression;
import cpython_bytecode.codegen.CodegenContext;

import java.util.Map;

public class ComparisonExpression extends Condition {
    private PythonExpression baseExpr;
    private Map<ComparisonOperator, PythonExpression> operatorPythonExpressionMap;

    public ComparisonExpression(int line_number) {
        super("ComparisonExpression", line_number);
    }

    public void setBaseExpr(PythonExpression baseExpr) {
        this.baseExpr = baseExpr;
    }

    public PythonExpression getBaseExpr() {
        return baseExpr;
    }

    public void setOperatorPythonExpressionMap(Map<ComparisonOperator,
            PythonExpression> operatorPythonExpressionMap) {
        this.operatorPythonExpressionMap = operatorPythonExpressionMap;
    }

    public Map<ComparisonOperator, PythonExpression> getOperatorPythonExpressionMap() {
        return operatorPythonExpressionMap;
    }

    @Override
    public void generateBytecode(CodegenContext ctx) {
        if (baseExpr != null) baseExpr.generateBytecode(ctx);
        if (operatorPythonExpressionMap != null) {
            for (java.util.Map.Entry<ast.comparisonOp.ComparisonOperator, PythonExpression> entry : operatorPythonExpressionMap.entrySet()) {
                ast.comparisonOp.ComparisonOperator compOp = entry.getKey();
                PythonExpression compExpr = entry.getValue();
                if (compExpr != null) compExpr.generateBytecode(ctx);
                int oparg = mapCompareOp(compOp, ctx);
                if (oparg >= 0) {
                    ctx.emitCompareOp(oparg);
                }
            }
        }
    }

    private int mapCompareOp(ast.comparisonOp.ComparisonOperator compOp, cpython_bytecode.codegen.CodegenContext ctx) {
        if (compOp == null) return cpython_bytecode.codegen.CodegenContext.CMP_EQ;
        String op = compOp.getOperator();
        return switch (op) {
            case "<" -> cpython_bytecode.codegen.CodegenContext.CMP_LT;
            case "<=" -> cpython_bytecode.codegen.CodegenContext.CMP_LE;
            case "==" -> cpython_bytecode.codegen.CodegenContext.CMP_EQ;
            case "!=" -> cpython_bytecode.codegen.CodegenContext.CMP_NE;
            case ">" -> cpython_bytecode.codegen.CodegenContext.CMP_GT;
            case ">=" -> cpython_bytecode.codegen.CodegenContext.CMP_GE;
            case "in" -> { ctx.emitContainsOp(0); yield -1; }
            case "not in" -> { ctx.emitContainsOp(1); yield -1; }
            case "is" -> { ctx.emitIsOp(0); yield -1; }
            case "is not" -> { ctx.emitIsOp(1); yield -1; }
            default -> cpython_bytecode.codegen.CodegenContext.CMP_EQ;
        };
    }

    @Override
    public String symbolTablePrint() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(baseExpr == null ? "Null" : baseExpr.symbolTablePrint());
        if(operatorPythonExpressionMap != null){
            for (ComparisonOperator comparisonOperator : operatorPythonExpressionMap.keySet()) {
                PythonExpression compExpr = operatorPythonExpressionMap.get(comparisonOperator);
                stringBuilder.append(" ").append(comparisonOperator == null ? "Null" : comparisonOperator.toString()).append(" ")
                        .append(compExpr == null ? "Null" : compExpr.symbolTablePrint());
            }
        }
        return stringBuilder.toString();
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(super.toString()).append(Consts.printIndent(3))
                .append(baseExpr == null ? "Null" : baseExpr.toString());
        if(operatorPythonExpressionMap != null){
            for (ComparisonOperator comparisonOperator : operatorPythonExpressionMap.keySet()) {
                PythonExpression compExpr = operatorPythonExpressionMap.get(comparisonOperator);
                stringBuilder.append(Consts.printIndent(3)).append(comparisonOperator == null ? "Null" : comparisonOperator.toString()).append(" ")
                        .append(compExpr == null ? "Null" : compExpr.toString());
            }
        }
        return stringBuilder.toString();
    }
}
