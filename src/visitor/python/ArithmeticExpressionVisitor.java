package visitor.python;

import antlr.JinjaFlaskParser;
import antlr.JinjaFlaskParserBaseVisitor;
import ast.arithmeticExpr.ArithmeticExpression;

public class ArithmeticExpressionVisitor extends JinjaFlaskParserBaseVisitor<ArithmeticExpression> {
    @Override
    public ArithmeticExpression visitAddition(JinjaFlaskParser.AdditionContext ctx) {
        return super.visitAddition(ctx);
    }

    @Override
    public ArithmeticExpression visitSubtraction(JinjaFlaskParser.SubtractionContext ctx) {
        return super.visitSubtraction(ctx);
    }

    @Override
    public ArithmeticExpression visitDivision(JinjaFlaskParser.DivisionContext ctx) {
        return super.visitDivision(ctx);
    }

    @Override
    public ArithmeticExpression visitMultiplication(JinjaFlaskParser.MultiplicationContext ctx) {
        return super.visitMultiplication(ctx);
    }

}
