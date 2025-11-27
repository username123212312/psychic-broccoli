// Generated from C:/Users/Yousef Razzouk/IdeaProjects/compiler_project/grammars/JinjaFlaskParser.g4 by ANTLR 4.13.2
 package antlr; 
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link JinjaFlaskParser}.
 */
public interface JinjaFlaskParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code Program}
	 * labeled alternative in {@link JinjaFlaskParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProgram(JinjaFlaskParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Program}
	 * labeled alternative in {@link JinjaFlaskParser#prog}.
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
	 * Enter a parse tree produced by {@link JinjaFlaskParser#globalStmt}.
	 * @param ctx the parse tree
	 */
	void enterGlobalStmt(JinjaFlaskParser.GlobalStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaFlaskParser#globalStmt}.
	 * @param ctx the parse tree
	 */
	void exitGlobalStmt(JinjaFlaskParser.GlobalStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaFlaskParser#exprStmt}.
	 * @param ctx the parse tree
	 */
	void enterExprStmt(JinjaFlaskParser.ExprStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaFlaskParser#exprStmt}.
	 * @param ctx the parse tree
	 */
	void exitExprStmt(JinjaFlaskParser.ExprStmtContext ctx);
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
	 * Enter a parse tree produced by {@link JinjaFlaskParser#assignTarget}.
	 * @param ctx the parse tree
	 */
	void enterAssignTarget(JinjaFlaskParser.AssignTargetContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaFlaskParser#assignTarget}.
	 * @param ctx the parse tree
	 */
	void exitAssignTarget(JinjaFlaskParser.AssignTargetContext ctx);
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
	 * Enter a parse tree produced by {@link JinjaFlaskParser#paramList}.
	 * @param ctx the parse tree
	 */
	void enterParamList(JinjaFlaskParser.ParamListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaFlaskParser#paramList}.
	 * @param ctx the parse tree
	 */
	void exitParamList(JinjaFlaskParser.ParamListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaFlaskParser#ifStmt}.
	 * @param ctx the parse tree
	 */
	void enterIfStmt(JinjaFlaskParser.IfStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaFlaskParser#ifStmt}.
	 * @param ctx the parse tree
	 */
	void exitIfStmt(JinjaFlaskParser.IfStmtContext ctx);
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
	 * Enter a parse tree produced by the {@code AndExpr}
	 * labeled alternative in {@link JinjaFlaskParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAndExpr(JinjaFlaskParser.AndExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AndExpr}
	 * labeled alternative in {@link JinjaFlaskParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAndExpr(JinjaFlaskParser.AndExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MulDivExpr}
	 * labeled alternative in {@link JinjaFlaskParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMulDivExpr(JinjaFlaskParser.MulDivExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MulDivExpr}
	 * labeled alternative in {@link JinjaFlaskParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMulDivExpr(JinjaFlaskParser.MulDivExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SubscriptExpr}
	 * labeled alternative in {@link JinjaFlaskParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterSubscriptExpr(JinjaFlaskParser.SubscriptExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SubscriptExpr}
	 * labeled alternative in {@link JinjaFlaskParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitSubscriptExpr(JinjaFlaskParser.SubscriptExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ComparisonExpr}
	 * labeled alternative in {@link JinjaFlaskParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterComparisonExpr(JinjaFlaskParser.ComparisonExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ComparisonExpr}
	 * labeled alternative in {@link JinjaFlaskParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitComparisonExpr(JinjaFlaskParser.ComparisonExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AttributeExpr}
	 * labeled alternative in {@link JinjaFlaskParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAttributeExpr(JinjaFlaskParser.AttributeExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AttributeExpr}
	 * labeled alternative in {@link JinjaFlaskParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAttributeExpr(JinjaFlaskParser.AttributeExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NotExpr}
	 * labeled alternative in {@link JinjaFlaskParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNotExpr(JinjaFlaskParser.NotExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NotExpr}
	 * labeled alternative in {@link JinjaFlaskParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNotExpr(JinjaFlaskParser.NotExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AtomExpr}
	 * labeled alternative in {@link JinjaFlaskParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAtomExpr(JinjaFlaskParser.AtomExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AtomExpr}
	 * labeled alternative in {@link JinjaFlaskParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAtomExpr(JinjaFlaskParser.AtomExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AddSubExpr}
	 * labeled alternative in {@link JinjaFlaskParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAddSubExpr(JinjaFlaskParser.AddSubExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AddSubExpr}
	 * labeled alternative in {@link JinjaFlaskParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAddSubExpr(JinjaFlaskParser.AddSubExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FnCallExpr}
	 * labeled alternative in {@link JinjaFlaskParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterFnCallExpr(JinjaFlaskParser.FnCallExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FnCallExpr}
	 * labeled alternative in {@link JinjaFlaskParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitFnCallExpr(JinjaFlaskParser.FnCallExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OrExpr}
	 * labeled alternative in {@link JinjaFlaskParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterOrExpr(JinjaFlaskParser.OrExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OrExpr}
	 * labeled alternative in {@link JinjaFlaskParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitOrExpr(JinjaFlaskParser.OrExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaFlaskParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtom(JinjaFlaskParser.AtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaFlaskParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtom(JinjaFlaskParser.AtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaFlaskParser#argList}.
	 * @param ctx the parse tree
	 */
	void enterArgList(JinjaFlaskParser.ArgListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaFlaskParser#argList}.
	 * @param ctx the parse tree
	 */
	void exitArgList(JinjaFlaskParser.ArgListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaFlaskParser#argument}.
	 * @param ctx the parse tree
	 */
	void enterArgument(JinjaFlaskParser.ArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaFlaskParser#argument}.
	 * @param ctx the parse tree
	 */
	void exitArgument(JinjaFlaskParser.ArgumentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ListElements}
	 * labeled alternative in {@link JinjaFlaskParser#listLiteral}.
	 * @param ctx the parse tree
	 */
	void enterListElements(JinjaFlaskParser.ListElementsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ListElements}
	 * labeled alternative in {@link JinjaFlaskParser#listLiteral}.
	 * @param ctx the parse tree
	 */
	void exitListElements(JinjaFlaskParser.ListElementsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ListComp}
	 * labeled alternative in {@link JinjaFlaskParser#listLiteral}.
	 * @param ctx the parse tree
	 */
	void enterListComp(JinjaFlaskParser.ListCompContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ListComp}
	 * labeled alternative in {@link JinjaFlaskParser#listLiteral}.
	 * @param ctx the parse tree
	 */
	void exitListComp(JinjaFlaskParser.ListCompContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaFlaskParser#dictLiteral}.
	 * @param ctx the parse tree
	 */
	void enterDictLiteral(JinjaFlaskParser.DictLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaFlaskParser#dictLiteral}.
	 * @param ctx the parse tree
	 */
	void exitDictLiteral(JinjaFlaskParser.DictLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaFlaskParser#entry}.
	 * @param ctx the parse tree
	 */
	void enterEntry(JinjaFlaskParser.EntryContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaFlaskParser#entry}.
	 * @param ctx the parse tree
	 */
	void exitEntry(JinjaFlaskParser.EntryContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaFlaskParser#generatorExpr}.
	 * @param ctx the parse tree
	 */
	void enterGeneratorExpr(JinjaFlaskParser.GeneratorExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaFlaskParser#generatorExpr}.
	 * @param ctx the parse tree
	 */
	void exitGeneratorExpr(JinjaFlaskParser.GeneratorExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaFlaskParser#attributeAccess}.
	 * @param ctx the parse tree
	 */
	void enterAttributeAccess(JinjaFlaskParser.AttributeAccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaFlaskParser#attributeAccess}.
	 * @param ctx the parse tree
	 */
	void exitAttributeAccess(JinjaFlaskParser.AttributeAccessContext ctx);
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
	 * Enter a parse tree produced by {@link JinjaFlaskParser#templateContent}.
	 * @param ctx the parse tree
	 */
	void enterTemplateContent(JinjaFlaskParser.TemplateContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaFlaskParser#templateContent}.
	 * @param ctx the parse tree
	 */
	void exitTemplateContent(JinjaFlaskParser.TemplateContentContext ctx);
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
	/**
	 * Enter a parse tree produced by {@link JinjaFlaskParser#styleBlock}.
	 * @param ctx the parse tree
	 */
	void enterStyleBlock(JinjaFlaskParser.StyleBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaFlaskParser#styleBlock}.
	 * @param ctx the parse tree
	 */
	void exitStyleBlock(JinjaFlaskParser.StyleBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaFlaskParser#routeArgs}.
	 * @param ctx the parse tree
	 */
	void enterRouteArgs(JinjaFlaskParser.RouteArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaFlaskParser#routeArgs}.
	 * @param ctx the parse tree
	 */
	void exitRouteArgs(JinjaFlaskParser.RouteArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaFlaskParser#routeOptions}.
	 * @param ctx the parse tree
	 */
	void enterRouteOptions(JinjaFlaskParser.RouteOptionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaFlaskParser#routeOptions}.
	 * @param ctx the parse tree
	 */
	void exitRouteOptions(JinjaFlaskParser.RouteOptionsContext ctx);
}