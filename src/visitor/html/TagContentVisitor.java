package visitor.html;

import antlr.JinjaFlaskParser;
import antlr.JinjaFlaskParserBaseVisitor;
import ast.tagContent.TagElementItem;

public class TagContentVisitor extends JinjaFlaskParserBaseVisitor<TagElementItem> {

    @Override
    public TagElementItem visitHtmlAttribute(JinjaFlaskParser.HtmlAttributeContext ctx) {
        TagElementItem tagElementItem = new TagElementItem(ctx.start.getLine());
        tagElementItem.setAttributeName(ctx.TAG_NAME().getText());
        if (ctx.ATTVALUE_VALUE() != null) {
            tagElementItem.setAttributeValue(ctx.ATTVALUE_VALUE().getText());
        }
        return tagElementItem;
    }

//    @Override
//    public TagContent visitClosingMarker(JinjaFlaskParser.ClosingMarkerContext ctx) {
//        TagContent tagContent = new TagContent(ctx.start.getLine());
//        tagContent.setAttributeName("");
//        tagContent.setAttributeValue("");
//        return tagContent;
//    }

}
