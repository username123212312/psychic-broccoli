package visitor.html;

import antlr.JinjaFlaskParser;
import antlr.JinjaFlaskParserBaseVisitor;
import ast.tagContent.TagContent;

public class TagContentVisitor extends JinjaFlaskParserBaseVisitor<TagContent> {
    @Override
    public TagContent visitHtmlAttribute(JinjaFlaskParser.HtmlAttributeContext ctx) {
        return super.visitHtmlAttribute(ctx);
    }

    @Override
    public TagContent visitClosingMarker(JinjaFlaskParser.ClosingMarkerContext ctx) {
        return super.visitClosingMarker(ctx);
    }

}
