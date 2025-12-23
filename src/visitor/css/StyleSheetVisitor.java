package visitor.css;

import antlr.JinjaFlaskParser;
import antlr.JinjaFlaskParserBaseVisitor;
import ast.ASTNode;
import ast.css.*;
import ast.cssTerm.CssFunctionArguments;
import ast.cssTerm.FunctionTerm;
import ast.htmlElement.StyleSheet;

import java.util.ArrayList;

public class StyleSheetVisitor extends JinjaFlaskParserBaseVisitor<ASTNode> {

    @Override
    public StyleSheet visitStyleSheet(JinjaFlaskParser.StyleSheetContext ctx) {
        return new StyleSheet(ctx.getStart().getLine(), new ArrayList<>());
    }

    @Override
    public RuleSet visitCssRule(JinjaFlaskParser.CssRuleContext ctx) {
        return new RuleSet(ctx.getStart().getLine(), null, null);
    }

    @Override
    public SelectorDeclaration visitCssSelectorDeclaration(JinjaFlaskParser.CssSelectorDeclarationContext ctx) {
        return new SelectorDeclaration(ctx.getStart().getLine(), new ArrayList<>());
    }

    @Override
    public CssSelectorList visitCssSelectorList(JinjaFlaskParser.CssSelectorListContext ctx) {
        return new CssSelectorList(ctx.getStart().getLine(), new ArrayList<>());
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
        return new FunctionTerm(ctx.getStart().getLine(), visitFunctionArguments((JinjaFlaskParser.FunctionArgumentsContext)ctx.css_function_args()));
    }

    @Override
    public CssFunctionArguments visitFunctionArguments(JinjaFlaskParser.FunctionArgumentsContext ctx) {
        return new CssFunctionArguments(ctx.getStart().getLine(), new ArrayList<>());
    }
}
