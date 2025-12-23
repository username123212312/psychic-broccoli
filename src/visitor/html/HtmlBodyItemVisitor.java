package visitor.html;

import antlr.JinjaFlaskParser;
import antlr.JinjaFlaskParserBaseVisitor;
import ast.htmlElement.HtmlBodyItem;

public class HtmlBodyItemVisitor extends JinjaFlaskParserBaseVisitor<HtmlBodyItem> {

    @Override
    public HtmlBodyItem visitHtmlContent(JinjaFlaskParser.HtmlContentContext ctx) {
        return super.visitHtmlContent(ctx);
    }
}
