// Generated from C:/Users/TWL/Desktop/psychic-broccoli-main/grammars/CssParser.g4 by ANTLR 4.13.2
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
	 * Enter a parse tree produced by {@link CssParser#anyValueUntilBrace}.
	 * @param ctx the parse tree
	 */
	void enterAnyValueUntilBrace(CssParser.AnyValueUntilBraceContext ctx);
	/**
	 * Exit a parse tree produced by {@link CssParser#anyValueUntilBrace}.
	 * @param ctx the parse tree
	 */
	void exitAnyValueUntilBrace(CssParser.AnyValueUntilBraceContext ctx);
	/**
	 * Enter a parse tree produced by {@link CssParser#anyValueUntilSemicolon}.
	 * @param ctx the parse tree
	 */
	void enterAnyValueUntilSemicolon(CssParser.AnyValueUntilSemicolonContext ctx);
	/**
	 * Exit a parse tree produced by {@link CssParser#anyValueUntilSemicolon}.
	 * @param ctx the parse tree
	 */
	void exitAnyValueUntilSemicolon(CssParser.AnyValueUntilSemicolonContext ctx);
}