package visitor.html;

import antlr.JinjaFlaskParser;
import antlr.JinjaFlaskParserBaseVisitor;
import ast.tagContent.TagContent;

public class TagContentVisitor extends JinjaFlaskParserBaseVisitor<TagContent> {

    @Override
    public TagContent visitHtmlAttribute(JinjaFlaskParser.HtmlAttributeContext ctx) {
        TagContent tagContent = new TagContent(ctx.start.getLine());
        tagContent.setAttributeName(ctx.TAG_NAME().getText());
        if (ctx.ATTVALUE_VALUE() != null) {
            tagContent.setAttributeValue(ctx.ATTVALUE_VALUE().getText());
        }
        return tagContent;
    }

//    @Override
//    public TagContent visitClosingMarker(JinjaFlaskParser.ClosingMarkerContext ctx) {
//        TagContent tagContent = new TagContent(ctx.start.getLine());
//        tagContent.setAttributeName("");
//        tagContent.setAttributeValue("");
//        return tagContent;
//    }

}
