// Generated from C:/Users/Yousef Razzouk/IdeaProjects/compiler_project/grammars/JinjaFlaskParser.g4 by ANTLR 4.13.2

    package antlr;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link JinjaFlaskParser}.
 */
public interface JinjaFlaskParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link JinjaFlaskParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(JinjaFlaskParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaFlaskParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(JinjaFlaskParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaFlaskParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(JinjaFlaskParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaFlaskParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(JinjaFlaskParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaFlaskParser#importStmt}.
	 * @param ctx the parse tree
	 */
	void enterImportStmt(JinjaFlaskParser.ImportStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaFlaskParser#importStmt}.
	 * @param ctx the parse tree
	 */
	void exitImportStmt(JinjaFlaskParser.ImportStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaFlaskParser#decorator}.
	 * @param ctx the parse tree
	 */
	void enterDecorator(JinjaFlaskParser.DecoratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaFlaskParser#decorator}.
	 * @param ctx the parse tree
	 */
	void exitDecorator(JinjaFlaskParser.DecoratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaFlaskParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(JinjaFlaskParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaFlaskParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(JinjaFlaskParser.AssignmentContext ctx);
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
	 * Enter a parse tree produced by the {@code ConstructorCallExpr}
	 * labeled alternative in {@link JinjaFlaskParser#constructorCall}.
	 * @param ctx the parse tree
	 */
	void enterConstructorCallExpr(JinjaFlaskParser.ConstructorCallExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ConstructorCallExpr}
	 * labeled alternative in {@link JinjaFlaskParser#constructorCall}.
	 * @param ctx the parse tree
	 */
	void exitConstructorCallExpr(JinjaFlaskParser.ConstructorCallExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaFlaskParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(JinjaFlaskParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaFlaskParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(JinjaFlaskParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaFlaskParser#functionDef}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDef(JinjaFlaskParser.FunctionDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaFlaskParser#functionDef}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDef(JinjaFlaskParser.FunctionDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaFlaskParser#returnStmt}.
	 * @param ctx the parse tree
	 */
	void enterReturnStmt(JinjaFlaskParser.ReturnStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaFlaskParser#returnStmt}.
	 * @param ctx the parse tree
	 */
	void exitReturnStmt(JinjaFlaskParser.ReturnStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaFlaskParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(JinjaFlaskParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaFlaskParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(JinjaFlaskParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaFlaskParser#tripleQuotedTemplate}.
	 * @param ctx the parse tree
	 */
	void enterTripleQuotedTemplate(JinjaFlaskParser.TripleQuotedTemplateContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaFlaskParser#tripleQuotedTemplate}.
	 * @param ctx the parse tree
	 */
	void exitTripleQuotedTemplate(JinjaFlaskParser.TripleQuotedTemplateContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaFlaskParser#htmlContent}.
	 * @param ctx the parse tree
	 */
	void enterHtmlContent(JinjaFlaskParser.HtmlContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaFlaskParser#htmlContent}.
	 * @param ctx the parse tree
	 */
	void exitHtmlContent(JinjaFlaskParser.HtmlContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaFlaskParser#jinjaExpr}.
	 * @param ctx the parse tree
	 */
	void enterJinjaExpr(JinjaFlaskParser.JinjaExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaFlaskParser#jinjaExpr}.
	 * @param ctx the parse tree
	 */
	void exitJinjaExpr(JinjaFlaskParser.JinjaExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaFlaskParser#jinjaStmt}.
	 * @param ctx the parse tree
	 */
	void enterJinjaStmt(JinjaFlaskParser.JinjaStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaFlaskParser#jinjaStmt}.
	 * @param ctx the parse tree
	 */
	void exitJinjaStmt(JinjaFlaskParser.JinjaStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaFlaskParser#jinjaComment}.
	 * @param ctx the parse tree
	 */
	void enterJinjaComment(JinjaFlaskParser.JinjaCommentContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaFlaskParser#jinjaComment}.
	 * @param ctx the parse tree
	 */
	void exitJinjaComment(JinjaFlaskParser.JinjaCommentContext ctx);
}