package visitor.python;

import antlr.JinjaFlaskParser;
import antlr.JinjaFlaskParserBaseVisitor;
import ast.complexExp.ComplexExpression;
import ast.complexExp.Generator;
import ast.compundStmt.ForLoop;

public class ComplexExpressionVisitor extends JinjaFlaskParserBaseVisitor<ComplexExpression> {
    @Override
    public ComplexExpression visitGenerator(JinjaFlaskParser.GeneratorContext ctx) {
        Generator generator = new Generator(ctx.getStart().getLine());
        ForLoopVisitor forLoopVisitor = new ForLoopVisitor();
        ForLoop forLoop = forLoopVisitor.visit(ctx.for_loop());
        generator.setForLoop(forLoop);
        return generator;
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
