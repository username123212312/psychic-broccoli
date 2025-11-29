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
	 * Enter a parse tree produced by {@link JinjaFlaskParser#decoratedDef}.
	 * @param ctx the parse tree
	 */
	void enterDecoratedDef(JinjaFlaskParser.DecoratedDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaFlaskParser#decoratedDef}.
	 * @param ctx the parse tree
	 */
	void exitDecoratedDef(JinjaFlaskParser.DecoratedDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaFlaskParser#defStmt}.
	 * @param ctx the parse tree
	 */
	void enterDefStmt(JinjaFlaskParser.DefStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaFlaskParser#defStmt}.
	 * @param ctx the parse tree
	 */
	void exitDefStmt(JinjaFlaskParser.DefStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaFlaskParser#simpleStmt}.
	 * @param ctx the parse tree
	 */
	void enterSimpleStmt(JinjaFlaskParser.SimpleStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaFlaskParser#simpleStmt}.
	 * @param ctx the parse tree
	 */
	void exitSimpleStmt(JinjaFlaskParser.SimpleStmtContext ctx);
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
	 * Enter a parse tree produced by {@link JinjaFlaskParser#assignmentStmt}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentStmt(JinjaFlaskParser.AssignmentStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaFlaskParser#assignmentStmt}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentStmt(JinjaFlaskParser.AssignmentStmtContext ctx);
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
	 * Enter a parse tree produced by {@link JinjaFlaskParser#forLoop}.
	 * @param ctx the parse tree
	 */
	void enterForLoop(JinjaFlaskParser.ForLoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaFlaskParser#forLoop}.
	 * @param ctx the parse tree
	 */
	void exitForLoop(JinjaFlaskParser.ForLoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaFlaskParser#whileLoop}.
	 * @param ctx the parse tree
	 */
	void enterWhileLoop(JinjaFlaskParser.WhileLoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaFlaskParser#whileLoop}.
	 * @param ctx the parse tree
	 */
	void exitWhileLoop(JinjaFlaskParser.WhileLoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaFlaskParser#tripleQuotedString}.
	 * @param ctx the parse tree
	 */
	void enterTripleQuotedString(JinjaFlaskParser.TripleQuotedStringContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaFlaskParser#tripleQuotedString}.
	 * @param ctx the parse tree
	 */
	void exitTripleQuotedString(JinjaFlaskParser.TripleQuotedStringContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaFlaskParser#document}.
	 * @param ctx the parse tree
	 */
	void enterDocument(JinjaFlaskParser.DocumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaFlaskParser#document}.
	 * @param ctx the parse tree
	 */
	void exitDocument(JinjaFlaskParser.DocumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaFlaskParser#content}.
	 * @param ctx the parse tree
	 */
	void enterContent(JinjaFlaskParser.ContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaFlaskParser#content}.
	 * @param ctx the parse tree
	 */
	void exitContent(JinjaFlaskParser.ContentContext ctx);
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
	 * Enter a parse tree produced by {@link JinjaFlaskParser#attribute}.
	 * @param ctx the parse tree
	 */
	void enterAttribute(JinjaFlaskParser.AttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaFlaskParser#attribute}.
	 * @param ctx the parse tree
	 */
	void exitAttribute(JinjaFlaskParser.AttributeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code logicalOp}
	 * labeled alternative in {@link JinjaFlaskParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalOp(JinjaFlaskParser.LogicalOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code logicalOp}
	 * labeled alternative in {@link JinjaFlaskParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalOp(JinjaFlaskParser.LogicalOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code notOp}
	 * labeled alternative in {@link JinjaFlaskParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNotOp(JinjaFlaskParser.NotOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code notOp}
	 * labeled alternative in {@link JinjaFlaskParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNotOp(JinjaFlaskParser.NotOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code comparisonOp}
	 * labeled alternative in {@link JinjaFlaskParser#comparisonExpression}.
	 * @param ctx the parse tree
	 */
	void enterComparisonOp(JinjaFlaskParser.ComparisonOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code comparisonOp}
	 * labeled alternative in {@link JinjaFlaskParser#comparisonExpression}.
	 * @param ctx the parse tree
	 */
	void exitComparisonOp(JinjaFlaskParser.ComparisonOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code additiveOp}
	 * labeled alternative in {@link JinjaFlaskParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveOp(JinjaFlaskParser.AdditiveOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code additiveOp}
	 * labeled alternative in {@link JinjaFlaskParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveOp(JinjaFlaskParser.AdditiveOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multiplicativeOp}
	 * labeled alternative in {@link JinjaFlaskParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeOp(JinjaFlaskParser.MultiplicativeOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multiplicativeOp}
	 * labeled alternative in {@link JinjaFlaskParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeOp(JinjaFlaskParser.MultiplicativeOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code number}
	 * labeled alternative in {@link JinjaFlaskParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterNumber(JinjaFlaskParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code number}
	 * labeled alternative in {@link JinjaFlaskParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitNumber(JinjaFlaskParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by the {@code string}
	 * labeled alternative in {@link JinjaFlaskParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterString(JinjaFlaskParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code string}
	 * labeled alternative in {@link JinjaFlaskParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitString(JinjaFlaskParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tripleString}
	 * labeled alternative in {@link JinjaFlaskParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterTripleString(JinjaFlaskParser.TripleStringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tripleString}
	 * labeled alternative in {@link JinjaFlaskParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitTripleString(JinjaFlaskParser.TripleStringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code true}
	 * labeled alternative in {@link JinjaFlaskParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterTrue(JinjaFlaskParser.TrueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code true}
	 * labeled alternative in {@link JinjaFlaskParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitTrue(JinjaFlaskParser.TrueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code false}
	 * labeled alternative in {@link JinjaFlaskParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterFalse(JinjaFlaskParser.FalseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code false}
	 * labeled alternative in {@link JinjaFlaskParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitFalse(JinjaFlaskParser.FalseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code none}
	 * labeled alternative in {@link JinjaFlaskParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterNone(JinjaFlaskParser.NoneContext ctx);
	/**
	 * Exit a parse tree produced by the {@code none}
	 * labeled alternative in {@link JinjaFlaskParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitNone(JinjaFlaskParser.NoneContext ctx);
	/**
	 * Enter a parse tree produced by the {@code name}
	 * labeled alternative in {@link JinjaFlaskParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterName(JinjaFlaskParser.NameContext ctx);
	/**
	 * Exit a parse tree produced by the {@code name}
	 * labeled alternative in {@link JinjaFlaskParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitName(JinjaFlaskParser.NameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parenthesis}
	 * labeled alternative in {@link JinjaFlaskParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterParenthesis(JinjaFlaskParser.ParenthesisContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parenthesis}
	 * labeled alternative in {@link JinjaFlaskParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitParenthesis(JinjaFlaskParser.ParenthesisContext ctx);
	/**
	 * Enter a parse tree produced by the {@code listLiteral}
	 * labeled alternative in {@link JinjaFlaskParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterListLiteral(JinjaFlaskParser.ListLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code listLiteral}
	 * labeled alternative in {@link JinjaFlaskParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitListLiteral(JinjaFlaskParser.ListLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dictOrSetLiteral}
	 * labeled alternative in {@link JinjaFlaskParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterDictOrSetLiteral(JinjaFlaskParser.DictOrSetLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dictOrSetLiteral}
	 * labeled alternative in {@link JinjaFlaskParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitDictOrSetLiteral(JinjaFlaskParser.DictOrSetLiteralContext ctx);
}