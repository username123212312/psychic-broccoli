package ast.condition;

import ast.Consts;
import ast.comparisonOp.ComparisonOperator;
import ast.compundStmt.CompoundStatement;
import ast.compundStmt.PythonExpression;

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

    public void setOperatorPythonExpressionMap(Map<ComparisonOperator,
            PythonExpression> operatorPythonExpressionMap) {
        this.operatorPythonExpressionMap = operatorPythonExpressionMap;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("ComparisonExpression [Line: ").append(this.line_number).append("]\n");
        if (baseExpr != null) {
            sb.append("         "+ baseExpr + " : ");
        }

        if (operatorPythonExpressionMap != null) {
            for (ComparisonOperator op : operatorPythonExpressionMap.keySet()) {
                PythonExpression val = operatorPythonExpressionMap.get(op);

                String opStr = (op == null) ? "Null" : op.toString();
                String valStr = (val == null) ? "Null" : val.toString();
                String combined = opStr + " " + valStr;

                combined = combined.replace("\n", "\n  ");
                sb.append("\n      ").append(combined);
            }
        }
        return sb.toString();
    }
//        StringBuilder stringBuilder = new StringBuilder();
//        stringBuilder.append(super.toString()).append(Consts.printIndent(1))
//                .append(baseExpr == null ? "Null" : baseExpr.toString());
//        if(operatorPythonExpressionMap != null){
//            for (ComparisonOperator comparisonOperator : operatorPythonExpressionMap.keySet()) {
//                PythonExpression compExpr = operatorPythonExpressionMap.get(comparisonOperator);
//                stringBuilder.append(Consts.printIndent(1)).append(comparisonOperator == null ? "Null" : comparisonOperator.toString()).append(" ")
//                        .append(compExpr == null ? "Null" : compExpr.toString());
//            }
//        }
//        return stringBuilder.toString();
//    }
}
