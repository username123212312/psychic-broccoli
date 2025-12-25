package visitor.css;

import antlr.JinjaFlaskParser;
import antlr.JinjaFlaskParserBaseVisitor;
import ast.ASTNode;
import ast.css.*;
import ast.cssTerm.CssFunctionArguments;
import ast.cssTerm.FunctionTerm;
import ast.htmlElement.StyleSheet;

import java.util.ArrayList;
import java.util.List;

public class StyleSheetVisitor extends JinjaFlaskParserBaseVisitor<ASTNode> {

    @Override
    public StyleSheet visitStyleSheet(JinjaFlaskParser.StyleSheetContext ctx) {
        StyleSheet styleSheet = new StyleSheet(ctx.getStart().getLine());
        List<RuleSet> ruleSetList = new ArrayList<>();
        for (int i = 0; i < ctx.ruleSet().size(); i++) {
            RuleSet ruleSet = (RuleSet) visit(ctx.ruleSet(i));
            ruleSetList.add(ruleSet);
        }
        styleSheet.setRuleSets(ruleSetList);
        return styleSheet;
    }

    @Override
    public RuleSet visitCssRule(JinjaFlaskParser.CssRuleContext ctx) {
        RuleSet ruleSet = new RuleSet(ctx.getStart().getLine());
        SelectorDeclaration selectorDeclaration = (SelectorDeclaration) visit(ctx.selector_decl());
        CssDeclarationList declarationList = (CssDeclarationList) visit(ctx.declarationList());
        ruleSet.setSelectorDeclaration(selectorDeclaration);
        ruleSet.setDeclarationList(declarationList);
        return ruleSet;
    }

    @Override
    public SelectorDeclaration visitCssSelectorDeclaration(JinjaFlaskParser.CssSelectorDeclarationContext ctx) {
        SelectorDeclaration selectorDeclaration = new SelectorDeclaration(ctx.getStart().getLine());
        List<CssSelectorList> cssSelectorLists = new ArrayList<>();
        for (int i = 0; i < ctx.css_selector_list().size(); i++) {
            CssSelectorList cssSelectorList = (CssSelectorList) visit(ctx.css_selector_list(i));
            cssSelectorLists.add(cssSelectorList);
        }
        selectorDeclaration.setSelectorLists(cssSelectorLists);
        return selectorDeclaration;
    }

    @Override
    public CssSelectorList visitCssSelectorList(JinjaFlaskParser.CssSelectorListContext ctx) {
        CssSelectorList cssSelectorList = new CssSelectorList(ctx.getStart().getLine());
        CssSelectorVisitor cssSelectorVisitor = new CssSelectorVisitor();
        List<CssSelector> cssSelectors = new ArrayList<>();
        for(int i = 0; i< ctx.css_selector().size(); i ++ ){
            CssSelector cssSelector = cssSelectorVisitor.visit(ctx.css_selector(i));
            cssSelectors.add(cssSelector);
        }
        cssSelectorList.setSelectors(cssSelectors);
        return cssSelectorList;
    }

    @Override
    public CssDeclarationList visitDeclarationBlock(JinjaFlaskParser.DeclarationBlockContext ctx) {
        return new CssDeclarationList(ctx.getStart().getLine(), new ArrayList<>());
    }

    @Override
    public CssDeclaration visitCssDeclaration(JinjaFlaskParser.CssDeclarationContext ctx) {
        return new CssDeclaration(ctx.getStart().getLine(), new ArrayList<>());
    }

    @Override
    public FunctionTerm visitCssFunctionCall(JinjaFlaskParser.CssFunctionCallContext ctx) {
        return new FunctionTerm(ctx.getStart().getLine(), visitFunctionArguments((JinjaFlaskParser.FunctionArgumentsContext) ctx.css_function_args()));
    }

    @Override
    public CssFunctionArguments visitFunctionArguments(JinjaFlaskParser.FunctionArgumentsContext ctx) {
        return new CssFunctionArguments(ctx.getStart().getLine(), new ArrayList<>());
    }
}
