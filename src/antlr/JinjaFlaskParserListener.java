// Generated from C:/Users/Yousef Razzouk/IdeaProjects/compiler_project/grammars/JinjaFlaskParser.g4 by ANTLR 4.13.2

    package antlr;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link JinjaFlaskParser}.
 */
public interface JinjaFlaskParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link JinjaFlaskParser#file}.
	 * @param ctx the parse tree
	 */
	void enterFile(JinjaFlaskParser.FileContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaFlaskParser#file}.
	 * @param ctx the parse tree
	 */
	void exitFile(JinjaFlaskParser.FileContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaFlaskParser#element}.
	 * @param ctx the parse tree
	 */
	void enterElement(JinjaFlaskParser.ElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaFlaskParser#element}.
	 * @param ctx the parse tree
	 */
	void exitElement(JinjaFlaskParser.ElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaFlaskParser#python_block}.
	 * @param ctx the parse tree
	 */
	void enterPython_block(JinjaFlaskParser.Python_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaFlaskParser#python_block}.
	 * @param ctx the parse tree
	 */
	void exitPython_block(JinjaFlaskParser.Python_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaFlaskParser#python_stmt}.
	 * @param ctx the parse tree
	 */
	void enterPython_stmt(JinjaFlaskParser.Python_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaFlaskParser#python_stmt}.
	 * @param ctx the parse tree
	 */
	void exitPython_stmt(JinjaFlaskParser.Python_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaFlaskParser#simple_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSimple_stmt(JinjaFlaskParser.Simple_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaFlaskParser#simple_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSimple_stmt(JinjaFlaskParser.Simple_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaFlaskParser#small_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSmall_stmt(JinjaFlaskParser.Small_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaFlaskParser#small_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSmall_stmt(JinjaFlaskParser.Small_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaFlaskParser#assign_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAssign_stmt(JinjaFlaskParser.Assign_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaFlaskParser#assign_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAssign_stmt(JinjaFlaskParser.Assign_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaFlaskParser#expr_stmt}.
	 * @param ctx the parse tree
	 */
	void enterExpr_stmt(JinjaFlaskParser.Expr_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaFlaskParser#expr_stmt}.
	 * @param ctx the parse tree
	 */
	void exitExpr_stmt(JinjaFlaskParser.Expr_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaFlaskParser#compound_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCompound_stmt(JinjaFlaskParser.Compound_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaFlaskParser#compound_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCompound_stmt(JinjaFlaskParser.Compound_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaFlaskParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void enterIf_stmt(JinjaFlaskParser.If_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaFlaskParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void exitIf_stmt(JinjaFlaskParser.If_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaFlaskParser#while_stmt}.
	 * @param ctx the parse tree
	 */
	void enterWhile_stmt(JinjaFlaskParser.While_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaFlaskParser#while_stmt}.
	 * @param ctx the parse tree
	 */
	void exitWhile_stmt(JinjaFlaskParser.While_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaFlaskParser#for_stmt}.
	 * @param ctx the parse tree
	 */
	void enterFor_stmt(JinjaFlaskParser.For_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaFlaskParser#for_stmt}.
	 * @param ctx the parse tree
	 */
	void exitFor_stmt(JinjaFlaskParser.For_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaFlaskParser#funcdef}.
	 * @param ctx the parse tree
	 */
	void enterFuncdef(JinjaFlaskParser.FuncdefContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaFlaskParser#funcdef}.
	 * @param ctx the parse tree
	 */
	void exitFuncdef(JinjaFlaskParser.FuncdefContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaFlaskParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(JinjaFlaskParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaFlaskParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(JinjaFlaskParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaFlaskParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(JinjaFlaskParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaFlaskParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(JinjaFlaskParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaFlaskParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(JinjaFlaskParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaFlaskParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(JinjaFlaskParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaFlaskParser#html_block}.
	 * @param ctx the parse tree
	 */
	void enterHtml_block(JinjaFlaskParser.Html_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaFlaskParser#html_block}.
	 * @param ctx the parse tree
	 */
	void exitHtml_block(JinjaFlaskParser.Html_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaFlaskParser#html_content}.
	 * @param ctx the parse tree
	 */
	void enterHtml_content(JinjaFlaskParser.Html_contentContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaFlaskParser#html_content}.
	 * @param ctx the parse tree
	 */
	void exitHtml_content(JinjaFlaskParser.Html_contentContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaFlaskParser#jinja_unit}.
	 * @param ctx the parse tree
	 */
	void enterJinja_unit(JinjaFlaskParser.Jinja_unitContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaFlaskParser#jinja_unit}.
	 * @param ctx the parse tree
	 */
	void exitJinja_unit(JinjaFlaskParser.Jinja_unitContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaFlaskParser#template_block}.
	 * @param ctx the parse tree
	 */
	void enterTemplate_block(JinjaFlaskParser.Template_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaFlaskParser#template_block}.
	 * @param ctx the parse tree
	 */
	void exitTemplate_block(JinjaFlaskParser.Template_blockContext ctx);
}