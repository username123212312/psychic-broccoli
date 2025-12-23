package visitor.html;

import antlr.JinjaFlaskParser;
import antlr.JinjaFlaskParserBaseVisitor;
import ast.htmlContentItem.HtmlContentItem;
import ast.htmlElement.HtmlBodyItem;
import ast.htmlElement.HtmlElementItem;

import java.util.ArrayList;
import java.util.List;
public class HtmlBodyItemVisitor
        extends JinjaFlaskParserBaseVisitor<HtmlBodyItem> {

    private final HtmlContentItemVisitor contentVisitor
            = new HtmlContentItemVisitor();

    @Override
    public HtmlBodyItem visitHtmlContent(
            JinjaFlaskParser.HtmlContentContext ctx) {

        List<HtmlContentItem> contents = new ArrayList<>();

        for (var item : ctx.html_content_item()) {
            contents.add(contentVisitor.visit(item));
        }

        int line = ctx.getStart().getLine();
        return new HtmlBodyItem(line, contents);
    }
}
