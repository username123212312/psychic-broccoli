package visitor.python;

import antlr.JinjaFlaskParser;
import antlr.JinjaFlaskParserBaseVisitor;
import ast.complexExp.ComplexExpression;

public class ComplexExpressionVisitor extends JinjaFlaskParserBaseVisitor<ComplexExpression> {
    @Override
    public ComplexExpression visitGenerator(JinjaFlaskParser.GeneratorContext ctx) {
        return super.visitGenerator(ctx);
    }

    @Override
    public ComplexExpression visitFunctionCall(JinjaFlaskParser.FunctionCallContext ctx) {
        return super.visitFunctionCall(ctx);
    }

    @Override
    public ComplexExpression visitListComprehension(JinjaFlaskParser.ListComprehensionContext ctx) {
        return super.visitListComprehension(ctx);
    }

    @Override
    public ComplexExpression visitDictionaryLiteral(JinjaFlaskParser.DictionaryLiteralContext ctx) {
        return super.visitDictionaryLiteral(ctx);
    }

    @Override
    public ComplexExpression visitListLiteral(JinjaFlaskParser.ListLiteralContext ctx) {
        return super.visitListLiteral(ctx);
    }

    @Override
    public ComplexExpression visitAttributeAccess(JinjaFlaskParser.AttributeAccessContext ctx) {
        return super.visitAttributeAccess(ctx);
    }

}
