// Generated from C:/Users/Yousef Razzouk/IdeaProjects/compiler_project/grammars/JinjaFlaskParser.g4 by ANTLR 4.13.2

    package antlr;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link JinjaFlaskParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface JinjaFlaskParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link JinjaFlaskParser#file}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFile(JinjaFlaskParser.FileContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaFlaskParser#element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElement(JinjaFlaskParser.ElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaFlaskParser#python_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPython_block(JinjaFlaskParser.Python_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaFlaskParser#python_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPython_stmt(JinjaFlaskParser.Python_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaFlaskParser#simple_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_stmt(JinjaFlaskParser.Simple_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaFlaskParser#small_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSmall_stmt(JinjaFlaskParser.Small_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaFlaskParser#assign_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign_stmt(JinjaFlaskParser.Assign_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaFlaskParser#expr_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_stmt(JinjaFlaskParser.Expr_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaFlaskParser#compound_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompound_stmt(JinjaFlaskParser.Compound_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaFlaskParser#if_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_stmt(JinjaFlaskParser.If_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaFlaskParser#while_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_stmt(JinjaFlaskParser.While_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaFlaskParser#for_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_stmt(JinjaFlaskParser.For_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaFlaskParser#funcdef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncdef(JinjaFlaskParser.FuncdefContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaFlaskParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(JinjaFlaskParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaFlaskParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(JinjaFlaskParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaFlaskParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(JinjaFlaskParser.FactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaFlaskParser#html_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtml_block(JinjaFlaskParser.Html_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaFlaskParser#html_content}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtml_content(JinjaFlaskParser.Html_contentContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaFlaskParser#jinja_unit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinja_unit(JinjaFlaskParser.Jinja_unitContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaFlaskParser#template_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplate_block(JinjaFlaskParser.Template_blockContext ctx);
}