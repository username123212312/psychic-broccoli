package visitor.jinja;

import antlr.JinjaFlaskParser;
import antlr.JinjaFlaskParserBaseVisitor;
import ast.jinjaArg.JinjaArgument;

public class JinjaArgumentVisitor extends JinjaFlaskParserBaseVisitor<JinjaArgument> {
    @Override
    public JinjaArgument visitJinjaPosArg(JinjaFlaskParser.JinjaPosArgContext ctx) {
        return super.visitJinjaPosArg(ctx);
    }

    @Override
    public JinjaArgument visitJinjaKwArg(JinjaFlaskParser.JinjaKwArgContext ctx) {
        return super.visitJinjaKwArg(ctx);
    }

}
