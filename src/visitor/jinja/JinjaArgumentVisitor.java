package visitor.jinja;

import antlr.JinjaFlaskParser;
import antlr.JinjaFlaskParserBaseVisitor;
import ast.jinja.jinjaArg.JinjaArgument;
import ast.jinja.jinjaArg.JinjaKeywordArgument;
import ast.jinja.jinjaArg.JinjaPositionalArgument;
import ast.jinja.jinjaExpression.JinjaExpression;

public class JinjaArgumentVisitor extends JinjaFlaskParserBaseVisitor<JinjaArgument> {
    JinjaExpressionVisitor jinjaExpressionVisitor = new JinjaExpressionVisitor();

    @Override
    public JinjaArgument visitJinjaPosArg(JinjaFlaskParser.JinjaPosArgContext ctx) {
        JinjaPositionalArgument jinjaPositionalArgument = new JinjaPositionalArgument(ctx.start.getLine());
        JinjaExpression jinjaExpression = jinjaExpressionVisitor.visit(ctx.j_expression());
        jinjaPositionalArgument.setArgument(jinjaExpression);
        return jinjaPositionalArgument;
    }

    @Override
    public JinjaArgument visitJinjaKwArg(JinjaFlaskParser.JinjaKwArgContext ctx) {
        JinjaKeywordArgument jinjaKeywordArgument = new JinjaKeywordArgument(ctx.start.getLine());
        jinjaKeywordArgument.setId(ctx.J_NAME().getText());
        JinjaExpression jinjaExpression = jinjaExpressionVisitor.visit(ctx.j_expression());
        jinjaKeywordArgument.setArgument(jinjaExpression);


        return jinjaKeywordArgument;
    }

}
