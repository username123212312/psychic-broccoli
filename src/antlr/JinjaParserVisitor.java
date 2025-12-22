// Generated from C:/Users/center/psychic-broccoli/grammars/JinjaParser.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link JinjaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface JinjaParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link JinjaParser#jinja_content}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinja_content(JinjaParser.Jinja_contentContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaParser#jinja_template_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinja_template_block(JinjaParser.Jinja_template_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaParser#jinja_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinja_part(JinjaParser.Jinja_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaParser#jinja_output}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinja_output(JinjaParser.Jinja_outputContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaParser#jinja_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinja_statement(JinjaParser.Jinja_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaParser#jinja_ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinja_ifStatement(JinjaParser.Jinja_ifStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaParser#jinja_elifBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinja_elifBlock(JinjaParser.Jinja_elifBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaParser#jinja_elseBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinja_elseBlock(JinjaParser.Jinja_elseBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaParser#jinja_forStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinja_forStatement(JinjaParser.Jinja_forStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaParser#jinja_setStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinja_setStatement(JinjaParser.Jinja_setStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaParser#jinja_rawStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinja_rawStatement(JinjaParser.Jinja_rawStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaParser#jinja_rawText}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinja_rawText(JinjaParser.Jinja_rawTextContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaParser#jinja_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinja_expr(JinjaParser.Jinja_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaParser#jinja_logicalOr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinja_logicalOr(JinjaParser.Jinja_logicalOrContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaParser#jinja_logicalAnd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinja_logicalAnd(JinjaParser.Jinja_logicalAndContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaParser#jinja_equality}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinja_equality(JinjaParser.Jinja_equalityContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaParser#jinja_comparison}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinja_comparison(JinjaParser.Jinja_comparisonContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaParser#jinja_addition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinja_addition(JinjaParser.Jinja_additionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaParser#jinja_multiplication}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinja_multiplication(JinjaParser.Jinja_multiplicationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaParser#jinja_unary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinja_unary(JinjaParser.Jinja_unaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaParser#jinja_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinja_primary(JinjaParser.Jinja_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaParser#jinja_atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinja_atom(JinjaParser.Jinja_atomContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaParser#jinja_trailer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinja_trailer(JinjaParser.Jinja_trailerContext ctx);
}