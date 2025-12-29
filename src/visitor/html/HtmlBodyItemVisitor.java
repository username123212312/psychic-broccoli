package visitor.html;

import antlr.JinjaFlaskParser;
import antlr.JinjaFlaskParserBaseVisitor;
import ast.htmlElement.HtmlBody;

public class HtmlBodyItemVisitor extends JinjaFlaskParserBaseVisitor<HtmlBody> {

    @Override
    public HtmlBody visitHtmlContent(JinjaFlaskParser.HtmlContentContext ctx) {
        return super.visitHtmlContent(ctx);
    }
}
