package visitor.html;

import antlr.JinjaFlaskParser;
import antlr.JinjaFlaskParserBaseVisitor;
import ast.atom.Str;
import ast.css.RuleSet;
import ast.htmlElement.HtmlElementItem;
import ast.htmlElement.ScriptElement;
import ast.htmlElement.StyleSheet;
import ast.tagContent.TagContent;
import visitor.css.CssVisitor;

import java.util.List;

public class HtmlElementVisitor extends JinjaFlaskParserBaseVisitor<HtmlElementItem> {
    private final CssVisitor cssVisitor = new CssVisitor();

    @Override

    public HtmlElementItem visitTagElement(JinjaFlaskParser.TagElementContext ctx) {
        return super.visitTagElement(ctx);
    }

    @Override
    public HtmlElementItem visitScriptElement(JinjaFlaskParser.ScriptElementContext ctx) {
        String body = ctx.SCRIPT_BODY().getText();

        int line  = ctx.getStart().getLine();

        return new ScriptElement(line ,body);
    }

    @Override
    public HtmlElementItem visitStyleElement(JinjaFlaskParser.StyleElementContext ctx) {
        List<RuleSet> ruleSets = (List<RuleSet>) cssVisitor.visit(ctx.style_sheet());

        int line = ctx.getStart().getLine();

        return new StyleSheet(line,ruleSets);
    }

}
