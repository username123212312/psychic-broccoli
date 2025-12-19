package visitor.html;

import antlr.JinjaFlaskParser;
import antlr.JinjaFlaskParserBaseVisitor;
import ast.htmlContentItem.HtmlContentItem;

public class HtmlContentItemVisitor extends JinjaFlaskParserBaseVisitor<HtmlContentItem> {
    @Override
    public HtmlContentItem visitHtmlElementItem(JinjaFlaskParser.HtmlElementItemContext ctx) {
        return super.visitHtmlElementItem(ctx);
    }

    @Override
    public HtmlContentItem visitHtmlTextItem(JinjaFlaskParser.HtmlTextItemContext ctx) {
        return super.visitHtmlTextItem(ctx);
    }

    @Override
    public HtmlContentItem visitJinjaStmtItem(JinjaFlaskParser.JinjaStmtItemContext ctx) {
        return super.visitJinjaStmtItem(ctx);
    }

    @Override
    public HtmlContentItem visitJinjaExprItem(JinjaFlaskParser.JinjaExprItemContext ctx) {
        return super.visitJinjaExprItem(ctx);
    }

}
