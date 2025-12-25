package visitor.html;

import antlr.JinjaFlaskParser;
import antlr.JinjaFlaskParserBaseVisitor;
import ast.htmlContentItem.HtmlContentItem;
import ast.htmlContentItem.HtmlTextItem;
import ast.htmlElement.HtmlElementItem;
import ast.jinja.jinjaStatment.JinjaStatement;
import visitor.jinja.JinjaExpressionVisitor;
import visitor.jinja.JinjaStatementVisitor;
import visitor.jinja.JinjaVisitor;

public class HtmlContentItemVisitor extends JinjaFlaskParserBaseVisitor<HtmlContentItem> {
    private final JinjaVisitor jinjaVisitor = new JinjaVisitor();

    @Override
    public HtmlContentItem visitHtmlElementItem(JinjaFlaskParser.HtmlElementItemContext ctx) {
        return new HtmlElementVisitor().visit(ctx.htmlElement());
    }

    @Override
    public HtmlContentItem visitHtmlTextItem(JinjaFlaskParser.HtmlTextItemContext ctx) {
        HtmlTextItem htmlTextItem = new HtmlTextItem(ctx.getStart().getLine());
        htmlTextItem.setText(ctx.HTML_TEXT().getText());
        return htmlTextItem;
    }

    @Override
    public HtmlContentItem visitJinjaStmtItem(JinjaFlaskParser.JinjaStmtItemContext ctx) {
        return visit(ctx.jinjaStatementBlock());
    }

    @Override
    public HtmlContentItem visitJinjaStmtBlock(JinjaFlaskParser.JinjaStmtBlockContext ctx) {
        return new JinjaStatementVisitor().visit(ctx.jStatement());
    }

    @Override
    public HtmlContentItem visitJinjaExprItem(JinjaFlaskParser.JinjaExprItemContext ctx) {
        return visit(ctx.jinjaExpressionBlock());
    }

    @Override
    public HtmlContentItem visitJinjaExprBlock(JinjaFlaskParser.JinjaExprBlockContext ctx) {
        return new JinjaExpressionVisitor().visit(ctx.j_expression());
    }
}
