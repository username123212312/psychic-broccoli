package visitor.html;

import antlr.html.HtmlParser;
import antlr.html.HtmlParserBaseVisitor;
import ast.tagContent.TagElementItem;

public class TagContentVisitor extends HtmlParserBaseVisitor<TagElementItem> {

    @Override
    public TagElementItem visitHtmlAttribute(HtmlParser.HtmlAttributeContext ctx) {
        TagElementItem tagElementItem = new TagElementItem(ctx.start.getLine());
        tagElementItem.setAttributeName(ctx.TAG_NAME().getText());
        if (ctx.ATTVALUE_VALUE() != null) {
            String raw = ctx.ATTVALUE_VALUE().getText();
            if (raw.length() >= 2) {
                tagElementItem.setAttributeValue(raw.substring(1, raw.length() - 1));
            } else {
                tagElementItem.setAttributeValue(raw);
            }
        }
        return tagElementItem;
    }

    @Override
    public TagElementItem visitClosingMarker(HtmlParser.ClosingMarkerContext ctx) {
        // closing marker carries no attribute info; return null
        return null;
    }


//    @Override
//    public TagContent visitClosingMarker(HtmlParser.ClosingMarkerContext ctx) {
//        TagContent tagContent = new TagContent(ctx.start.getLine());
//        tagContent.setAttributeName("");
//        tagContent.setAttributeValue("");
//        return tagContent;
//    }

}

