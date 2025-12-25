package visitor.css;

import antlr.JinjaFlaskParser;
import antlr.JinjaFlaskParserBaseVisitor;
import ast.css.CssSelector;

public class CssSelectorVisitor extends JinjaFlaskParserBaseVisitor<CssSelector> {
    @Override
    public CssSelector visitQualifiedSelector(JinjaFlaskParser.QualifiedSelectorContext ctx) {
        CssSelector cssSelector = new CssSelector(ctx.getStart().getLine());
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(ctx.CSS_ID(0));
        for (int i = 1; i < ctx.CSS_ID().size(); i++) {
            stringBuilder.append(".").append(ctx.CSS_ID(i).getText());
        }
        cssSelector.setId(stringBuilder.toString());
        return cssSelector;
    }

    @Override
    public CssSelector visitStandaloneSimpleSelector(JinjaFlaskParser.StandaloneSimpleSelectorContext ctx) {
        CssSelector cssSelector = new CssSelector(ctx.getStart().getLine());
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < ctx.CSS_DOT().size(); i++) {
            stringBuilder.append(".").append(ctx.CSS_ID(i % 2));
            if (ctx.CSS_ID((i + 1) % 2) != null) {
                stringBuilder.append(" ").append(ctx.CSS_ID((i + 1) % 2));
            }
        }

        return super.visitStandaloneSimpleSelector(ctx);
    }

    @Override
    public CssSelector visitTypeAndIdSelector(JinjaFlaskParser.TypeAndIdSelectorContext ctx) {
        return super.visitTypeAndIdSelector(ctx);
    }

    @Override
    public CssSelector visitTypeSelector(JinjaFlaskParser.TypeSelectorContext ctx) {
        return super.visitTypeSelector(ctx);
    }
}
