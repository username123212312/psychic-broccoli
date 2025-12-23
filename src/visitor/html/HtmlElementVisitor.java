package visitor.html;

import antlr.JinjaFlaskParser;
import antlr.JinjaFlaskParserBaseVisitor;
import ast.atom.Str;
import ast.css.RuleSet;
import ast.htmlContentItem.HtmlContentItem;
import ast.htmlElement.HtmlElementItem;
import ast.htmlElement.ScriptElement;
import ast.htmlElement.StyleSheet;
import ast.htmlElement.TagElement;
import ast.tagContent.HtmlAttribute;
import ast.tagContent.TagContent;
import visitor.css.CssVisitor;

import java.util.ArrayList;
import java.util.List;

public class HtmlElementVisitor extends JinjaFlaskParserBaseVisitor<HtmlElementItem> {
    private final CssVisitor cssVisitor = new CssVisitor();
    private final TagContentVisitor tagContentVisitor
            = new TagContentVisitor();
    private final HtmlContentItemVisitor htmlContentItemVisitor = new HtmlContentItemVisitor();

    @Override
    public HtmlElementItem visitTagElement(JinjaFlaskParser.TagElementContext ctx) {
        List<TagContent> tagContents = new ArrayList<>();
        for (var attr : ctx.tag_content()) {
            TagContent tc = tagContentVisitor.visit(attr);
            if (tc != null) tagContents.add(tc);
        }

        List<HtmlContentItem> body = new ArrayList<>();
        for (int i = 0; i < ctx.getChildCount(); i++) {
            var child = ctx.getChild(i);
            if (child instanceof JinjaFlaskParser.HtmlContentContext) {
                JinjaFlaskParser.HtmlContentContext contentCtx = (JinjaFlaskParser.HtmlContentContext) child;
                for (var item : contentCtx.html_content_item()) {
                    HtmlContentItem contentItem = htmlContentItemVisitor.visit(item);
                    if (contentItem != null) body.add(contentItem);
                }
            }
        }

        int line = ctx.getStart().getLine();
        return new TagElement(line, tagContents, body);
    }



    @Override
    public HtmlElementItem visitScriptElement(JinjaFlaskParser.ScriptElementContext ctx) {
        String body = ctx.SCRIPT_BODY().getText();

        int line = ctx.getStart().getLine();

        return new ScriptElement(line, body);
    }

    @Override
    public HtmlElementItem visitStyleElement(JinjaFlaskParser.StyleElementContext ctx) {
        List<RuleSet> ruleSets = cssVisitor.visit(ctx.style_sheet());

        int line = ctx.getStart().getLine();

        return new StyleSheet(line, ruleSets);
    }


}
