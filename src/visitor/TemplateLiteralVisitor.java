package visitor;

import antlr.JinjaFlaskParser;
import antlr.JinjaFlaskParserBaseVisitor;
import ast.TemplateLiteral;

public class TemplateLiteralVisitor extends JinjaFlaskParserBaseVisitor<TemplateLiteral> {
    @Override
    public TemplateLiteral visitHtmlContentDoubleTemplate(JinjaFlaskParser.HtmlContentDoubleTemplateContext ctx) {
        return super.visitHtmlContentDoubleTemplate(ctx);
    }

    @Override
    public TemplateLiteral visitHtmlContentSingleTemplate(JinjaFlaskParser.HtmlContentSingleTemplateContext ctx) {
        return super.visitHtmlContentSingleTemplate(ctx);
    }
}
