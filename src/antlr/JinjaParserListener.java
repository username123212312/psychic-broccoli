// Generated from C:/Users/center/psychic-broccoli/grammars/JinjaParser.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link JinjaParser}.
 */
public interface JinjaParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link JinjaParser#jinja_content}.
	 * @param ctx the parse tree
	 */
	void enterJinja_content(JinjaParser.Jinja_contentContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaParser#jinja_content}.
	 * @param ctx the parse tree
	 */
	void exitJinja_content(JinjaParser.Jinja_contentContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaParser#jinja_template_block}.
	 * @param ctx the parse tree
	 */
	void enterJinja_template_block(JinjaParser.Jinja_template_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaParser#jinja_template_block}.
	 * @param ctx the parse tree
	 */
	void exitJinja_template_block(JinjaParser.Jinja_template_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaParser#jinja_part}.
	 * @param ctx the parse tree
	 */
	void enterJinja_part(JinjaParser.Jinja_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaParser#jinja_part}.
	 * @param ctx the parse tree
	 */
	void exitJinja_part(JinjaParser.Jinja_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaParser#jinja_output}.
	 * @param ctx the parse tree
	 */
	void enterJinja_output(JinjaParser.Jinja_outputContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaParser#jinja_output}.
	 * @param ctx the parse tree
	 */
	void exitJinja_output(JinjaParser.Jinja_outputContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaParser#jinja_statement}.
	 * @param ctx the parse tree
	 */
	void enterJinja_statement(JinjaParser.Jinja_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaParser#jinja_statement}.
	 * @param ctx the parse tree
	 */
	void exitJinja_statement(JinjaParser.Jinja_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaParser#jinja_ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterJinja_ifStatement(JinjaParser.Jinja_ifStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaParser#jinja_ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitJinja_ifStatement(JinjaParser.Jinja_ifStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaParser#jinja_elifBlock}.
	 * @param ctx the parse tree
	 */
	void enterJinja_elifBlock(JinjaParser.Jinja_elifBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaParser#jinja_elifBlock}.
	 * @param ctx the parse tree
	 */
	void exitJinja_elifBlock(JinjaParser.Jinja_elifBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaParser#jinja_elseBlock}.
	 * @param ctx the parse tree
	 */
	void enterJinja_elseBlock(JinjaParser.Jinja_elseBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaParser#jinja_elseBlock}.
	 * @param ctx the parse tree
	 */
	void exitJinja_elseBlock(JinjaParser.Jinja_elseBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaParser#jinja_forStatement}.
	 * @param ctx the parse tree
	 */
	void enterJinja_forStatement(JinjaParser.Jinja_forStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaParser#jinja_forStatement}.
	 * @param ctx the parse tree
	 */
	void exitJinja_forStatement(JinjaParser.Jinja_forStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaParser#jinja_setStatement}.
	 * @param ctx the parse tree
	 */
	void enterJinja_setStatement(JinjaParser.Jinja_setStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaParser#jinja_setStatement}.
	 * @param ctx the parse tree
	 */
	void exitJinja_setStatement(JinjaParser.Jinja_setStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaParser#jinja_rawStatement}.
	 * @param ctx the parse tree
	 */
	void enterJinja_rawStatement(JinjaParser.Jinja_rawStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaParser#jinja_rawStatement}.
	 * @param ctx the parse tree
	 */
	void exitJinja_rawStatement(JinjaParser.Jinja_rawStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaParser#jinja_rawText}.
	 * @param ctx the parse tree
	 */
	void enterJinja_rawText(JinjaParser.Jinja_rawTextContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaParser#jinja_rawText}.
	 * @param ctx the parse tree
	 */
	void exitJinja_rawText(JinjaParser.Jinja_rawTextContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaParser#jinja_expr}.
	 * @param ctx the parse tree
	 */
	void enterJinja_expr(JinjaParser.Jinja_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaParser#jinja_expr}.
	 * @param ctx the parse tree
	 */
	void exitJinja_expr(JinjaParser.Jinja_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaParser#jinja_logicalOr}.
	 * @param ctx the parse tree
	 */
	void enterJinja_logicalOr(JinjaParser.Jinja_logicalOrContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaParser#jinja_logicalOr}.
	 * @param ctx the parse tree
	 */
	void exitJinja_logicalOr(JinjaParser.Jinja_logicalOrContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaParser#jinja_logicalAnd}.
	 * @param ctx the parse tree
	 */
	void enterJinja_logicalAnd(JinjaParser.Jinja_logicalAndContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaParser#jinja_logicalAnd}.
	 * @param ctx the parse tree
	 */
	void exitJinja_logicalAnd(JinjaParser.Jinja_logicalAndContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaParser#jinja_equality}.
	 * @param ctx the parse tree
	 */
	void enterJinja_equality(JinjaParser.Jinja_equalityContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaParser#jinja_equality}.
	 * @param ctx the parse tree
	 */
	void exitJinja_equality(JinjaParser.Jinja_equalityContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaParser#jinja_comparison}.
	 * @param ctx the parse tree
	 */
	void enterJinja_comparison(JinjaParser.Jinja_comparisonContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaParser#jinja_comparison}.
	 * @param ctx the parse tree
	 */
	void exitJinja_comparison(JinjaParser.Jinja_comparisonContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaParser#jinja_addition}.
	 * @param ctx the parse tree
	 */
	void enterJinja_addition(JinjaParser.Jinja_additionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaParser#jinja_addition}.
	 * @param ctx the parse tree
	 */
	void exitJinja_addition(JinjaParser.Jinja_additionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaParser#jinja_multiplication}.
	 * @param ctx the parse tree
	 */
	void enterJinja_multiplication(JinjaParser.Jinja_multiplicationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaParser#jinja_multiplication}.
	 * @param ctx the parse tree
	 */
	void exitJinja_multiplication(JinjaParser.Jinja_multiplicationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaParser#jinja_unary}.
	 * @param ctx the parse tree
	 */
	void enterJinja_unary(JinjaParser.Jinja_unaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaParser#jinja_unary}.
	 * @param ctx the parse tree
	 */
	void exitJinja_unary(JinjaParser.Jinja_unaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaParser#jinja_primary}.
	 * @param ctx the parse tree
	 */
	void enterJinja_primary(JinjaParser.Jinja_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaParser#jinja_primary}.
	 * @param ctx the parse tree
	 */
	void exitJinja_primary(JinjaParser.Jinja_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaParser#jinja_atom}.
	 * @param ctx the parse tree
	 */
	void enterJinja_atom(JinjaParser.Jinja_atomContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaParser#jinja_atom}.
	 * @param ctx the parse tree
	 */
	void exitJinja_atom(JinjaParser.Jinja_atomContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaParser#jinja_trailer}.
	 * @param ctx the parse tree
	 */
	void enterJinja_trailer(JinjaParser.Jinja_trailerContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaParser#jinja_trailer}.
	 * @param ctx the parse tree
	 */
	void exitJinja_trailer(JinjaParser.Jinja_trailerContext ctx);
}