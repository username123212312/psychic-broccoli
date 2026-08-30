package visitor.css;

import antlr.css.CssParser;
import antlr.css.CssParserBaseVisitor;
import ast.css.CssSelector;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;
import java.util.List;

public class CssSelectorVisitor extends CssParserBaseVisitor<CssSelector> {
    @Override
    public CssSelector visitQualifiedSelector(CssParser.QualifiedSelectorContext ctx) {

        CssSelector cssSelector = new CssSelector(ctx.getStart().getLine());
        List<String> classes = new ArrayList<>();
        cssSelector.setElementName(ctx.CSS_ID(0).getText());
        for (int i = 1; i < ctx.CSS_ID().size(); i++) {
            classes.add(ctx.CSS_ID(i).getText());
        }
        cssSelector.setClasses(classes);
        return cssSelector;
    }

//    @Override
//    public CssSelector visitStandaloneSimpleSelector(CssParser.StandaloneSimpleSelectorContext ctx) {
//        CssSelector cssSelector = new CssSelector(ctx.getStart().getLine());
//        List<String> classes = new ArrayList<>();
//        for (int i = 0; i < ctx.CSS_ID().size(); i++) {
//            classes.add(ctx.CSS_ID(i).getText());
//        }
//        cssSelector.setClasses(classes);
//
//        return cssSelector;
//    }

    @Override
    public CssSelector visitTypeAndIdSelector(CssParser.TypeAndIdSelectorContext ctx) {
        CssSelector cssSelector = new CssSelector(ctx.start.getLine());

        cssSelector.setElementName(ctx.CSS_ID(0).getText());

        boolean hasHash = false;
        for (int i = 0; i < ctx.getChildCount(); i++) {
            if (ctx.getChild(i) instanceof TerminalNode) {
                TerminalNode node = (TerminalNode) ctx.getChild(i);
                if (node.getSymbol().getType() == CssParser.CSS_HASH) {
                    hasHash = true;
                    break;
                }
            }
        }

        if (hasHash && ctx.CSS_ID().size() > 1) {
            cssSelector.setId(ctx.CSS_ID(1).getText());
        }

        return cssSelector;
    }

    @Override
    public CssSelector visitTypeSelector(CssParser.TypeSelectorContext ctx) {
        CssSelector cssSelector = new CssSelector(ctx.start.getLine());

        String text = ctx.CSS_ID().getText();

        cssSelector.setElementName(text);

        return cssSelector;
    }

    @Override
    public CssSelector visitClassOnlySelector(CssParser.ClassOnlySelectorContext ctx) {
        CssSelector cssSelector = new CssSelector(ctx.getStart().getLine());
        List<String> classes = new ArrayList<>();
        for (int i = 0; i < ctx.CSS_ID().size(); i++) {
            classes.add(ctx.CSS_ID(i).getText());
        }
        cssSelector.setClasses(classes);
        return cssSelector;
    }
}
