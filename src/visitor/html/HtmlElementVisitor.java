package visitor.html;

import antlr.html.HtmlParser;
import antlr.html.HtmlParserBaseVisitor;
import ast.htmlElement.HtmlElement;
import ast.htmlElement.StyleSheet;
import ast.htmlElement.TagElement;
import ast.tagContent.TagElementItem;
import visitor.css.StyleSheetVisitor;

import java.util.ArrayList;
import java.util.List;

public class HtmlElementVisitor extends HtmlParserBaseVisitor<HtmlElement> {

    @Override
    public HtmlElement visitTagElement(HtmlParser.TagElementContext ctx) {
        TagElement tagElement = new TagElement(ctx.getStart().getLine());
        TagContentVisitor tagContentVisitor = new TagContentVisitor();

        boolean isClosing = false;
        String tagName = null;
        List<TagElementItem> attributes = new ArrayList<>();

        // بنمر على كل محتويات الوسم
        for (HtmlParser.Tag_contentContext tCtx : ctx.tag_content()) {
            if (tCtx instanceof HtmlParser.ClosingMarkerContext) {
                // إذا لقينا علامة / يعني هذا وسم إغلاق
                isClosing = true;
            } else if (tCtx instanceof HtmlParser.HtmlAttributeContext) {
                HtmlParser.HtmlAttributeContext attrCtx = (HtmlParser.HtmlAttributeContext) tCtx;
                if (tagName == null) {
                    // أول اسم بنلاقيه هو اسم الوسم
                    tagName = attrCtx.TAG_NAME().getText();
                } else {
                    // الأسماء اللي بعد هيك هي خصائص (Attributes)
                    attributes.add(tagContentVisitor.visit(attrCtx));
                }
            }
        }

        tagElement.setTagName(tagName);
        tagElement.setClosingTag(isClosing);
        tagElement.setTags(attributes);
        tagElement.setSelfClosing(ctx.TAG_SLASH_CLOSE() != null);

        return tagElement;
    }

    @Override
    public HtmlElement visitStyleElement(HtmlParser.StyleElementContext ctx) {
        return (StyleSheet) new StyleSheetVisitor().visit(ctx.style_sheet());
    }
}
