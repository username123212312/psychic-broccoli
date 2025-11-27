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
	 * Visit a parse tree produced by the {@code Program}
	 * labeled alternative in {@link JinjaFlaskParser#prog}.
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
	 * Visit a parse tree produced by {@link JinjaFlaskParser#globalStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlobalStmt(JinjaFlaskParser.GlobalStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaFlaskParser#exprStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprStmt(JinjaFlaskParser.ExprStmtContext ctx);
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
	 * Visit a parse tree produced by {@link JinjaFlaskParser#assignTarget}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignTarget(JinjaFlaskParser.AssignTargetContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaFlaskParser#returnStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStmt(JinjaFlaskParser.ReturnStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaFlaskParser#functionDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDef(JinjaFlaskParser.FunctionDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaFlaskParser#paramList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParamList(JinjaFlaskParser.ParamListContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaFlaskParser#ifStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStmt(JinjaFlaskParser.IfStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaFlaskParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(JinjaFlaskParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AndExpr}
	 * labeled alternative in {@link JinjaFlaskParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExpr(JinjaFlaskParser.AndExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MulDivExpr}
	 * labeled alternative in {@link JinjaFlaskParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulDivExpr(JinjaFlaskParser.MulDivExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SubscriptExpr}
	 * labeled alternative in {@link JinjaFlaskParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubscriptExpr(JinjaFlaskParser.SubscriptExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ComparisonExpr}
	 * labeled alternative in {@link JinjaFlaskParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisonExpr(JinjaFlaskParser.ComparisonExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AttributeExpr}
	 * labeled alternative in {@link JinjaFlaskParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributeExpr(JinjaFlaskParser.AttributeExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NotExpr}
	 * labeled alternative in {@link JinjaFlaskParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotExpr(JinjaFlaskParser.NotExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AtomExpr}
	 * labeled alternative in {@link JinjaFlaskParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomExpr(JinjaFlaskParser.AtomExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AddSubExpr}
	 * labeled alternative in {@link JinjaFlaskParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddSubExpr(JinjaFlaskParser.AddSubExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FnCallExpr}
	 * labeled alternative in {@link JinjaFlaskParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFnCallExpr(JinjaFlaskParser.FnCallExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OrExpr}
	 * labeled alternative in {@link JinjaFlaskParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrExpr(JinjaFlaskParser.OrExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaFlaskParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtom(JinjaFlaskParser.AtomContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaFlaskParser#argList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgList(JinjaFlaskParser.ArgListContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaFlaskParser#argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgument(JinjaFlaskParser.ArgumentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ListElements}
	 * labeled alternative in {@link JinjaFlaskParser#listLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListElements(JinjaFlaskParser.ListElementsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ListComp}
	 * labeled alternative in {@link JinjaFlaskParser#listLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListComp(JinjaFlaskParser.ListCompContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaFlaskParser#dictLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDictLiteral(JinjaFlaskParser.DictLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaFlaskParser#entry}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEntry(JinjaFlaskParser.EntryContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaFlaskParser#generatorExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGeneratorExpr(JinjaFlaskParser.GeneratorExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaFlaskParser#attributeAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributeAccess(JinjaFlaskParser.AttributeAccessContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaFlaskParser#tripleQuotedTemplate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTripleQuotedTemplate(JinjaFlaskParser.TripleQuotedTemplateContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaFlaskParser#templateContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplateContent(JinjaFlaskParser.TemplateContentContext ctx);
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
	/**
	 * Visit a parse tree produced by {@link JinjaFlaskParser#styleBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStyleBlock(JinjaFlaskParser.StyleBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaFlaskParser#routeArgs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRouteArgs(JinjaFlaskParser.RouteArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaFlaskParser#routeOptions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRouteOptions(JinjaFlaskParser.RouteOptionsContext ctx);
}