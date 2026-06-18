package visitor.html;

import antlr.html.HtmlParser;
import antlr.html.HtmlParserBaseVisitor;
import ast.HtmlContent;
import ast.htmlContentItem.HtmlContentItem;
import ast.htmlElement.HtmlElement;
import ast.htmlElement.TagElement;
import ast.tagContent.TagElementItem;
import java.util.ArrayList;
import java.util.List;

public class HtmlElementVisitor extends HtmlParserBaseVisitor<HtmlElement> {

    @Override
    public HtmlElement visitTagElement(HtmlParser.TagElementContext ctx) {
        TagElement tagElement = new TagElement(ctx.getStart().getLine());

        // استخراج اسم الوسم من أول TOKEN TAG_NAME
        String tagName = null;
        if (ctx.TAG_NAME() != null && ctx.TAG_NAME().size() > 0) {
            tagName = ctx.TAG_NAME(0).getText();
        }
        tagElement.setTagName(tagName);

        // detect self-closing tag
        tagElement.setSelfClosing(ctx.TAG_SLASH_CLOSE() != null);

        // معالجة الخصائص
        if (ctx.tag_attribute() != null) {
            List<TagElementItem> tagElementItemList = new ArrayList<>();
            TagContentVisitor tagContentVisitor = new TagContentVisitor();

            for (HtmlParser.Tag_attributeContext attrCtx : ctx.tag_attribute()) {
                TagElementItem item = attrCtx.accept(tagContentVisitor);
                if (item != null) tagElementItemList.add(item);
            }
            tagElement.setTags(tagElementItemList);
        }

        // م[عالجة الأطفال (المحتوى الداخلي)
        // في الـ Grammar الخاص بك، الـ html_content يظهر فقط إذا لم يكن الوسم ذاتي الإغلاق
        if (ctx.html_content() != null) {
            HtmlContent htmlContent = new HtmlContentVisitor().visit(ctx.html_content());
            if (htmlContent != null && htmlContent.getItems() != null) {
                for (HtmlContentItem item : htmlContent.getItems()) {
                    tagElement.addChild(item);
                }
            }
        }

        return tagElement;
    }
}
