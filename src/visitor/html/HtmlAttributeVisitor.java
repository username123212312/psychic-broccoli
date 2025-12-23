package visitor.html;

import antlr.JinjaFlaskParser;
import antlr.JinjaFlaskParserBaseVisitor;
import ast.tagContent.HtmlAttribute;

public class HtmlAttributeVisitor extends JinjaFlaskParserBaseVisitor<HtmlAttribute> {
    @Override
    public HtmlAttribute visitHtmlAttribute(JinjaFlaskParser.HtmlAttributeContext ctx) {
        String name = ctx.TAG_NAME().getText();

        String value = null;
        if(ctx.ATTVALUE_VALUE() != null){
            value = ctx.ATTVALUE_VALUE().getText();
        }

        int line = ctx.getStart().getLine();

        return new HtmlAttribute(line ,name,value);
    }

    @Override
    public HtmlAttribute visitClosingMarker(JinjaFlaskParser.ClosingMarkerContext ctx) {
       return null;
    }

}
