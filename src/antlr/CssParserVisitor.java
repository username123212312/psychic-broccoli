// Generated from C:/Users/TWL/Desktop/psychic-broccoli-main/grammars/CssParser.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CssParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CssParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CssParser#stylesheet}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStylesheet(CssParser.StylesheetContext ctx);
	/**
	 * Visit a parse tree produced by {@link CssParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(CssParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CssParser#atRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtRule(CssParser.AtRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link CssParser#ruleset}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRuleset(CssParser.RulesetContext ctx);
	/**
	 * Visit a parse tree produced by {@link CssParser#selectorGroup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectorGroup(CssParser.SelectorGroupContext ctx);
	/**
	 * Visit a parse tree produced by {@link CssParser#declarationBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarationBlock(CssParser.DeclarationBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link CssParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(CssParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CssParser#anyValueUntilBrace}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnyValueUntilBrace(CssParser.AnyValueUntilBraceContext ctx);
	/**
	 * Visit a parse tree produced by {@link CssParser#anyValueUntilSemicolon}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnyValueUntilSemicolon(CssParser.AnyValueUntilSemicolonContext ctx);
}