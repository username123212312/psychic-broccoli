// Generated from C:/Users/Yousef Razzouk/IdeaProjects/compiler_project/grammars/CssParser.g4 by ANTLR 4.13.2
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
	 * Visit a parse tree produced by {@link CssParser#selector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelector(CssParser.SelectorContext ctx);
	/**
	 * Visit a parse tree produced by {@link CssParser#combinator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCombinator(CssParser.CombinatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link CssParser#simpleSelectorSequence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleSelectorSequence(CssParser.SimpleSelectorSequenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link CssParser#simpleSelector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleSelector(CssParser.SimpleSelectorContext ctx);
	/**
	 * Visit a parse tree produced by {@link CssParser#typeSelector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeSelector(CssParser.TypeSelectorContext ctx);
	/**
	 * Visit a parse tree produced by {@link CssParser#universal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUniversal(CssParser.UniversalContext ctx);
	/**
	 * Visit a parse tree produced by {@link CssParser#hash}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHash(CssParser.HashContext ctx);
	/**
	 * Visit a parse tree produced by {@link CssParser#classSelector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassSelector(CssParser.ClassSelectorContext ctx);
	/**
	 * Visit a parse tree produced by {@link CssParser#pseudo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPseudo(CssParser.PseudoContext ctx);
	/**
	 * Visit a parse tree produced by {@link CssParser#attributeSelector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributeSelector(CssParser.AttributeSelectorContext ctx);
	/**
	 * Visit a parse tree produced by {@link CssParser#atRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtRule(CssParser.AtRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link CssParser#importTerminator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportTerminator(CssParser.ImportTerminatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link CssParser#mediaQueryList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMediaQueryList(CssParser.MediaQueryListContext ctx);
	/**
	 * Visit a parse tree produced by {@link CssParser#mediaQuery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMediaQuery(CssParser.MediaQueryContext ctx);
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
	 * Visit a parse tree produced by {@link CssParser#propertyName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertyName(CssParser.PropertyNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link CssParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(CssParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link CssParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(CssParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link CssParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(CssParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link CssParser#valueList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueList(CssParser.ValueListContext ctx);
	/**
	 * Visit a parse tree produced by {@link CssParser#keyframeBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeyframeBlock(CssParser.KeyframeBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link CssParser#keyframeSelector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeyframeSelector(CssParser.KeyframeSelectorContext ctx);
}