package visitor.python;

import antlr.JinjaFlaskParser;
import antlr.JinjaFlaskParserBaseVisitor;
import ast.HtmlContent;
import ast.TemplateLiteral;
import visitor.UniversalVisitor;

public class TemplateLiteralVisitor extends JinjaFlaskParserBaseVisitor<TemplateLiteral> {

    @Override
    public TemplateLiteral visitHtmlContentDoubleTemplate(JinjaFlaskParser.HtmlContentDoubleTemplateContext ctx) {
        TemplateLiteral templateLiteral = new TemplateLiteral(ctx.getStart().getLine());
        HtmlContent htmlContent = (HtmlContent) new UniversalVisitor().visit(ctx.html_content());
        templateLiteral.setHtmlContent(htmlContent);
        return templateLiteral;
    }

    @Override
    public TemplateLiteral visitHtmlContentSingleTemplate(JinjaFlaskParser.HtmlContentSingleTemplateContext ctx) {
        TemplateLiteral templateLiteral = new TemplateLiteral(ctx.getStart().getLine());
        HtmlContent htmlContent = (HtmlContent) new UniversalVisitor().visit(ctx.html_content());
        templateLiteral.setHtmlContent(htmlContent);
        return templateLiteral;
    }
}
