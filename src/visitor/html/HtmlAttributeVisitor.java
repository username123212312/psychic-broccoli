package visitor.html;

import antlr.JinjaFlaskParser;
import antlr.JinjaFlaskParserBaseVisitor;
import ast.tagContent.HtmlAttribute;

public class HtmlAttributeVisitor extends JinjaFlaskParserBaseVisitor<HtmlAttribute> {
    @Override
    public HtmlAttribute visitHtmlAttribute(JinjaFlaskParser.HtmlAttributeContext ctx) {
        return super.visitHtmlAttribute(ctx);
    }

    @Override
    public HtmlAttribute visitClosingMarker(JinjaFlaskParser.ClosingMarkerContext ctx) {
        return super.visitClosingMarker(ctx);
    }

}
