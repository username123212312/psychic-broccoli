package visitor.python;

import antlr.JinjaFlaskParser;
import antlr.JinjaFlaskParserBaseVisitor;
import ast.argument.Argument;
import ast.argument.KeywordArgument;
import ast.argument.PositionalArgument;
import ast.compundStmt.PythonExpression;

public class ArgumentVisitor extends JinjaFlaskParserBaseVisitor<Argument> {
    private final PythonExpressionVisitor pythonExpressionVisitor = new PythonExpressionVisitor();

    @Override
    public Argument visitPositionalArgument(JinjaFlaskParser.PositionalArgumentContext ctx) {
        PositionalArgument positionalArgument = new PositionalArgument(ctx.getStart().getLine());
        PythonExpression pythonExpression = pythonExpressionVisitor.visit(ctx.python_expr());
        positionalArgument.setArg(pythonExpression);
        return positionalArgument;
    }

    @Override
    public Argument visitKeywordArgument(JinjaFlaskParser.KeywordArgumentContext ctx) {
        KeywordArgument keywordArgument = new KeywordArgument(ctx.getStart().getLine());
        PythonExpression pythonExpression = pythonExpressionVisitor.visit(ctx.python_expr());
        keywordArgument.setArg(pythonExpression);
        keywordArgument.setArgName(ctx.NAME().getText());
        return keywordArgument;
    }

}
