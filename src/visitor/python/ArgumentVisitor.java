package visitor.python;

import antlr.JinjaFlaskParser;
import antlr.JinjaFlaskParserBaseVisitor;
import ast.argument.Argument;

public class ArgumentVisitor extends JinjaFlaskParserBaseVisitor<Argument> {
    @Override
    public Argument visitPositionalArgument(JinjaFlaskParser.PositionalArgumentContext ctx) {
        return super.visitPositionalArgument(ctx);
    }

    @Override
    public Argument visitKeywordArgument(JinjaFlaskParser.KeywordArgumentContext ctx) {
        return super.visitKeywordArgument(ctx);
    }

}
