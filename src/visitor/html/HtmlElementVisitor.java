package visitor.html;

import antlr.JinjaFlaskParser;
import antlr.JinjaFlaskParserBaseVisitor;
import ast.htmlElement.HtmlElementItem;

public class HtmlElementVisitor extends JinjaFlaskParserBaseVisitor<HtmlElementItem> {
    @Override
<<<<<<<HEAD

    public HtmlElementItem visitHtmlElementItem(JinjaFlaskParser.HtmlElementItemContext ctx) {
        return super.visitHtmlElementItem(ctx);
    }

    @Override
=======
        >>>>>>>main

    public HtmlElementItem visitTagElement(JinjaFlaskParser.TagElementContext ctx) {
        return super.visitTagElement(ctx);
    }

    @Override
    public HtmlElementItem visitScriptElement(JinjaFlaskParser.ScriptElementContext ctx) {
        return super.visitScriptElement(ctx);
    }

    @Override
    public HtmlElementItem visitStyleElement(JinjaFlaskParser.StyleElementContext ctx) {
        return super.visitStyleElement(ctx);
    }

}
