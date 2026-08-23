package ast.arithmeticExpr;

import ast.compundStmt.PythonExpression;
import ast.simpleExpr.SimpleExpression;
import cpython_bytecode.codegen.CodegenContext;

import java.util.List;

public class ArithmeticExpression extends SimpleExpression {
    private PythonExpression left;
    private List<PythonExpression> right;
    private String operator;

    public ArithmeticExpression(String node_name, int line_number) {
        super(node_name, line_number);
    }

    public void setLeft(PythonExpression left) {
        this.left = left;
    }

    public PythonExpression getLeft() {
        return left;
    }

    public void setRight(List<PythonExpression> right) {
        this.right = right;
    }

    public List<PythonExpression> getRight() {
        return right;
    }

    public void setOperator(Operator operator) {
        switch (operator){
            case Addition -> this.operator = "+";
            case Multiplication -> this.operator = "*";
            case Division -> this.operator = "/";
            case Subtraction -> this.operator = "-";
        }
    }

    public String getOperator() {
        return operator;
    }

    @Override
    public String symbolTablePrint() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(left.symbolTablePrint());
        if(right != null){
            for(PythonExpression pythonExpression : right){
                stringBuilder.append(operator).append(" ").append(pythonExpression.symbolTablePrint());
            }
        }
        return stringBuilder.toString();
    }


    @Override
    public void generateBytecode(CodegenContext ctx) {
        if (left != null) left.generateBytecode(ctx);
        if (right != null) {
            for (PythonExpression r : right) {
                r.generateBytecode(ctx);
                int oparg = switch (operator) {
                    case "+" -> cpython_bytecode.codegen.CodegenContext.BINARY_ADD;
                    case "-" -> cpython_bytecode.codegen.CodegenContext.BINARY_SUBTRACT;
                    case "*" -> cpython_bytecode.codegen.CodegenContext.BINARY_MULTIPLY;
                    case "/" -> cpython_bytecode.codegen.CodegenContext.BINARY_TRUE_DIVIDE;
                    default -> cpython_bytecode.codegen.CodegenContext.BINARY_ADD;
                };
                ctx.emitBinaryOp(oparg);
            }
        }
    }

    @Override
    public String generateCode() {
        return ""; // مؤقتاً نعيد نصاً فارغاً لكي يعمل المشروع
    }


    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(left.toString());
        if(right != null){
            for(PythonExpression pythonExpression : right){
                stringBuilder.append(operator).append(pythonExpression.toString());
            }
        }
        return stringBuilder.toString();
    }
}
