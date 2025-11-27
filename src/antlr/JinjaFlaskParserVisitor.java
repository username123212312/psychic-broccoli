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
	 * Visit a parse tree produced by {@link JinjaFlaskParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(JinjaFlaskParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaFlaskParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(JinjaFlaskParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaFlaskParser#importStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportStmt(JinjaFlaskParser.ImportStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaFlaskParser#decorator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecorator(JinjaFlaskParser.DecoratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaFlaskParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(JinjaFlaskParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaFlaskParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(JinjaFlaskParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ConstructorCallExpr}
	 * labeled alternative in {@link JinjaFlaskParser#constructorCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorCallExpr(JinjaFlaskParser.ConstructorCallExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaFlaskParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(JinjaFlaskParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaFlaskParser#functionDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDef(JinjaFlaskParser.FunctionDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaFlaskParser#returnStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStmt(JinjaFlaskParser.ReturnStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaFlaskParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(JinjaFlaskParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaFlaskParser#tripleQuotedTemplate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTripleQuotedTemplate(JinjaFlaskParser.TripleQuotedTemplateContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaFlaskParser#htmlContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlContent(JinjaFlaskParser.HtmlContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaFlaskParser#jinjaExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaExpr(JinjaFlaskParser.JinjaExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaFlaskParser#jinjaStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaStmt(JinjaFlaskParser.JinjaStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaFlaskParser#jinjaComment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaComment(JinjaFlaskParser.JinjaCommentContext ctx);
}