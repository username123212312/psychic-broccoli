// Generated from C:/Users/Yousef Razzouk/IdeaProjects/compiler_project/grammars/CssParser.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CssParser}.
 */
public interface CssParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CssParser#stylesheet}.
	 * @param ctx the parse tree
	 */
	void enterStylesheet(CssParser.StylesheetContext ctx);
	/**
	 * Exit a parse tree produced by {@link CssParser#stylesheet}.
	 * @param ctx the parse tree
	 */
	void exitStylesheet(CssParser.StylesheetContext ctx);
	/**
	 * Enter a parse tree produced by {@link CssParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(CssParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CssParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(CssParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CssParser#ruleset}.
	 * @param ctx the parse tree
	 */
	void enterRuleset(CssParser.RulesetContext ctx);
	/**
	 * Exit a parse tree produced by {@link CssParser#ruleset}.
	 * @param ctx the parse tree
	 */
	void exitRuleset(CssParser.RulesetContext ctx);
	/**
	 * Enter a parse tree produced by {@link CssParser#selectorGroup}.
	 * @param ctx the parse tree
	 */
	void enterSelectorGroup(CssParser.SelectorGroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link CssParser#selectorGroup}.
	 * @param ctx the parse tree
	 */
	void exitSelectorGroup(CssParser.SelectorGroupContext ctx);
	/**
	 * Enter a parse tree produced by {@link CssParser#selector}.
	 * @param ctx the parse tree
	 */
	void enterSelector(CssParser.SelectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CssParser#selector}.
	 * @param ctx the parse tree
	 */
	void exitSelector(CssParser.SelectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CssParser#combinator}.
	 * @param ctx the parse tree
	 */
	void enterCombinator(CssParser.CombinatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CssParser#combinator}.
	 * @param ctx the parse tree
	 */
	void exitCombinator(CssParser.CombinatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CssParser#simpleSelectorSequence}.
	 * @param ctx the parse tree
	 */
	void enterSimpleSelectorSequence(CssParser.SimpleSelectorSequenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link CssParser#simpleSelectorSequence}.
	 * @param ctx the parse tree
	 */
	void exitSimpleSelectorSequence(CssParser.SimpleSelectorSequenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link CssParser#simpleSelector}.
	 * @param ctx the parse tree
	 */
	void enterSimpleSelector(CssParser.SimpleSelectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CssParser#simpleSelector}.
	 * @param ctx the parse tree
	 */
	void exitSimpleSelector(CssParser.SimpleSelectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CssParser#typeSelector}.
	 * @param ctx the parse tree
	 */
	void enterTypeSelector(CssParser.TypeSelectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CssParser#typeSelector}.
	 * @param ctx the parse tree
	 */
	void exitTypeSelector(CssParser.TypeSelectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CssParser#universal}.
	 * @param ctx the parse tree
	 */
	void enterUniversal(CssParser.UniversalContext ctx);
	/**
	 * Exit a parse tree produced by {@link CssParser#universal}.
	 * @param ctx the parse tree
	 */
	void exitUniversal(CssParser.UniversalContext ctx);
	/**
	 * Enter a parse tree produced by {@link CssParser#hash}.
	 * @param ctx the parse tree
	 */
	void enterHash(CssParser.HashContext ctx);
	/**
	 * Exit a parse tree produced by {@link CssParser#hash}.
	 * @param ctx the parse tree
	 */
	void exitHash(CssParser.HashContext ctx);
	/**
	 * Enter a parse tree produced by {@link CssParser#classSelector}.
	 * @param ctx the parse tree
	 */
	void enterClassSelector(CssParser.ClassSelectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CssParser#classSelector}.
	 * @param ctx the parse tree
	 */
	void exitClassSelector(CssParser.ClassSelectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CssParser#pseudo}.
	 * @param ctx the parse tree
	 */
	void enterPseudo(CssParser.PseudoContext ctx);
	/**
	 * Exit a parse tree produced by {@link CssParser#pseudo}.
	 * @param ctx the parse tree
	 */
	void exitPseudo(CssParser.PseudoContext ctx);
	/**
	 * Enter a parse tree produced by {@link CssParser#attributeSelector}.
	 * @param ctx the parse tree
	 */
	void enterAttributeSelector(CssParser.AttributeSelectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CssParser#attributeSelector}.
	 * @param ctx the parse tree
	 */
	void exitAttributeSelector(CssParser.AttributeSelectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CssParser#atRule}.
	 * @param ctx the parse tree
	 */
	void enterAtRule(CssParser.AtRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link CssParser#atRule}.
	 * @param ctx the parse tree
	 */
	void exitAtRule(CssParser.AtRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link CssParser#importTerminator}.
	 * @param ctx the parse tree
	 */
	void enterImportTerminator(CssParser.ImportTerminatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CssParser#importTerminator}.
	 * @param ctx the parse tree
	 */
	void exitImportTerminator(CssParser.ImportTerminatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CssParser#mediaQueryList}.
	 * @param ctx the parse tree
	 */
	void enterMediaQueryList(CssParser.MediaQueryListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CssParser#mediaQueryList}.
	 * @param ctx the parse tree
	 */
	void exitMediaQueryList(CssParser.MediaQueryListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CssParser#mediaQuery}.
	 * @param ctx the parse tree
	 */
	void enterMediaQuery(CssParser.MediaQueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link CssParser#mediaQuery}.
	 * @param ctx the parse tree
	 */
	void exitMediaQuery(CssParser.MediaQueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link CssParser#declarationBlock}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationBlock(CssParser.DeclarationBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link CssParser#declarationBlock}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationBlock(CssParser.DeclarationBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link CssParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(CssParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CssParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(CssParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CssParser#propertyName}.
	 * @param ctx the parse tree
	 */
	void enterPropertyName(CssParser.PropertyNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CssParser#propertyName}.
	 * @param ctx the parse tree
	 */
	void exitPropertyName(CssParser.PropertyNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link CssParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(CssParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link CssParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(CssParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link CssParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(CssParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link CssParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(CssParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link CssParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(CssParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link CssParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(CssParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link CssParser#valueList}.
	 * @param ctx the parse tree
	 */
	void enterValueList(CssParser.ValueListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CssParser#valueList}.
	 * @param ctx the parse tree
	 */
	void exitValueList(CssParser.ValueListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CssParser#keyframeBlock}.
	 * @param ctx the parse tree
	 */
	void enterKeyframeBlock(CssParser.KeyframeBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link CssParser#keyframeBlock}.
	 * @param ctx the parse tree
	 */
	void exitKeyframeBlock(CssParser.KeyframeBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link CssParser#keyframeSelector}.
	 * @param ctx the parse tree
	 */
	void enterKeyframeSelector(CssParser.KeyframeSelectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CssParser#keyframeSelector}.
	 * @param ctx the parse tree
	 */
	void exitKeyframeSelector(CssParser.KeyframeSelectorContext ctx);
}