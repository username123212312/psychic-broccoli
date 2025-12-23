package visitor.html;

import antlr.JinjaFlaskParser;
import antlr.JinjaFlaskParserBaseVisitor;
import ast.htmlContentItem.HtmlContentItem;
import ast.htmlContentItem.HtmlTextItem;
import visitor.jinja.JinjaVisitor;

public class HtmlContentItemVisitor extends JinjaFlaskParserBaseVisitor<HtmlContentItem> {
    private JinjaVisitor jinjaVisitor = new JinjaVisitor();

    @Override
    public HtmlContentItem visitHtmlElementItem(JinjaFlaskParser.HtmlElementItemContext ctx) {
        return (HtmlContentItem) visit(ctx.htmlElement());
    }

    @Override
    public HtmlContentItem visitJinjaStmtItem(JinjaFlaskParser.JinjaStmtItemContext ctx) {
        return (HtmlContentItem) jinjaVisitor.visit(ctx.jinjaStatementBlock());
    }

    @Override
    public HtmlContentItem visitJinjaExprItem(JinjaFlaskParser.JinjaExprItemContext ctx) {
       return (HtmlContentItem) jinjaVisitor.visit(ctx.jinjaExpressionBlock());
    }

    @Override
    public HtmlContentItem visitHtmlTextItem(JinjaFlaskParser.HtmlTextItemContext ctx) {

     String text = ctx.HTML_TEXT().getText();
     int line = ctx.getStart().getLine();

     return new HtmlTextItem(text,line);
    }
}
