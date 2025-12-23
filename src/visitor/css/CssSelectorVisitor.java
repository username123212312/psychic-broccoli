package visitor.css;

import antlr.JinjaFlaskParser;
import antlr.JinjaFlaskParserBaseVisitor;
import ast.css.CssSelector;

public class CssSelectorVisitor extends JinjaFlaskParserBaseVisitor<CssSelector> {
    @Override
    public CssSelector visitQualifiedSelector(JinjaFlaskParser.QualifiedSelectorContext ctx) {
        return super.visitQualifiedSelector(ctx);
    }

    @Override
    public CssSelector visitStandaloneSimpleSelector(JinjaFlaskParser.StandaloneSimpleSelectorContext ctx) {
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
