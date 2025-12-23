package visitor.html;

import antlr.JinjaFlaskParser;
import antlr.JinjaFlaskParserBaseVisitor;
import ast.tagContent.TagContent;
import ast.tagContent.HtmlAttribute;

public class TagContentVisitor
        extends JinjaFlaskParserBaseVisitor<TagContent> {

    private final HtmlAttributeVisitor attributeVisitor
            = new HtmlAttributeVisitor();

    @Override
    public TagContent visitHtmlAttribute(
            JinjaFlaskParser.HtmlAttributeContext ctx) {
        return attributeVisitor.visitHtmlAttribute(ctx);
    }

    @Override
    public TagContent visitClosingMarker(
            JinjaFlaskParser.ClosingMarkerContext ctx) {
        return null;
    }
}
