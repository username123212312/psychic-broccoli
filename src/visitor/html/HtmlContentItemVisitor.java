package visitor.html;

import antlr.JinjaFlaskParser;
import antlr.JinjaFlaskParserBaseVisitor;
import ast.htmlContentItem.HtmlContentItem;
import visitor.jinja.JinjaVisitor;

public class HtmlContentItemVisitor extends JinjaFlaskParserBaseVisitor<HtmlContentItem> {
    private JinjaVisitor jinjaVisitor = new JinjaVisitor();

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
        return jinjaVisitor.visitJinjaStmt((JinjaFlaskParser.JinjaStmtContext) ctx.jinjaStatementBlock());
    }

    @Override
    public HtmlContentItem visitJinjaExprItem(JinjaFlaskParser.JinjaExprItemContext ctx) {
        return jinjaVisitor.visitJinjaExpr((JinjaFlaskParser.JinjaExprContext) ctx.jinjaExpressionBlock());
    }

}
