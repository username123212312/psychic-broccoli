package visitor.html;

import antlr.JinjaFlaskParser;
import antlr.JinjaFlaskParserBaseVisitor;
import ast.htmlElement.HtmlElementItem;
import ast.htmlElement.ScriptElement;
import ast.htmlElement.StyleSheet;
import ast.htmlElement.TagElement;
import ast.tagContent.TagContent;
import visitor.css.StyleSheetVisitor;

import java.util.ArrayList;
import java.util.List;

public class HtmlElementVisitor extends JinjaFlaskParserBaseVisitor<HtmlElementItem> {

    @Override
    public HtmlElementItem visitTagElement(JinjaFlaskParser.TagElementContext ctx) {
        TagElement tagElement = new TagElement(ctx.getStart().getLine());
        TagContentVisitor tagContentVisitor = new TagContentVisitor();
        if (ctx.tag_content() != null) {
            List<TagContent> tagContentList = new ArrayList<>();
            for (int i = 0; i < ctx.tag_content().size(); i++) {
                TagContent tagContent = tagContentVisitor.visit(ctx.tag_content(i));
                tagContentList.add(tagContent);
            }
            tagElement.setTags(tagContentList);
        }
        return tagElement;
    }

    @Override
    public HtmlElementItem visitScriptElement(JinjaFlaskParser.ScriptElementContext ctx) {
        ScriptElement scriptElement = new ScriptElement(ctx.getStart().getLine());
        scriptElement.setScriptBody(ctx.SCRIPT_BODY().getText());

        return scriptElement;
    }

    @Override
    public HtmlElementItem visitStyleElement(JinjaFlaskParser.StyleElementContext ctx) {
        return (StyleSheet) new StyleSheetVisitor().visit(ctx.style_sheet());
    }
}
