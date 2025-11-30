// Generated from C:/Users/Rama Alwanni/Desktop/psychic-broccoli-main/grammars/JinjaFlaskParser.g4 by ANTLR 4.13.1
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
	 * Visit a parse tree produced by {@link JinjaFlaskParser#decorator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecorator(JinjaFlaskParser.DecoratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaFlaskParser#decoratedDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecoratedDef(JinjaFlaskParser.DecoratedDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaFlaskParser#defStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefStmt(JinjaFlaskParser.DefStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaFlaskParser#simpleStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleStmt(JinjaFlaskParser.SimpleStmtContext ctx);
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
	 * Visit a parse tree produced by {@link JinjaFlaskParser#assignmentStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentStmt(JinjaFlaskParser.AssignmentStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaFlaskParser#returnStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStmt(JinjaFlaskParser.ReturnStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaFlaskParser#globalStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlobalStmt(JinjaFlaskParser.GlobalStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaFlaskParser#importStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportStmt(JinjaFlaskParser.ImportStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaFlaskParser#forLoop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForLoop(JinjaFlaskParser.ForLoopContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaFlaskParser#whileLoop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileLoop(JinjaFlaskParser.WhileLoopContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaFlaskParser#tripleQuotedString}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTripleQuotedString(JinjaFlaskParser.TripleQuotedStringContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaFlaskParser#document}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDocument(JinjaFlaskParser.DocumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaFlaskParser#content}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContent(JinjaFlaskParser.ContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaFlaskParser#element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElement(JinjaFlaskParser.ElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaFlaskParser#attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribute(JinjaFlaskParser.AttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaFlaskParser#styleElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStyleElement(JinjaFlaskParser.StyleElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaFlaskParser#styleContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStyleContent(JinjaFlaskParser.StyleContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaFlaskParser#cssStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssStatement(JinjaFlaskParser.CssStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaFlaskParser#ruleset}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRuleset(JinjaFlaskParser.RulesetContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaFlaskParser#selectorGroup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectorGroup(JinjaFlaskParser.SelectorGroupContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaFlaskParser#selector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelector(JinjaFlaskParser.SelectorContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaFlaskParser#combinator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCombinator(JinjaFlaskParser.CombinatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaFlaskParser#simpleSelectorSequence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleSelectorSequence(JinjaFlaskParser.SimpleSelectorSequenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaFlaskParser#simpleSelector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleSelector(JinjaFlaskParser.SimpleSelectorContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaFlaskParser#typeSelector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeSelector(JinjaFlaskParser.TypeSelectorContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaFlaskParser#universal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUniversal(JinjaFlaskParser.UniversalContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaFlaskParser#hash}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHash(JinjaFlaskParser.HashContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaFlaskParser#classSelector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassSelector(JinjaFlaskParser.ClassSelectorContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaFlaskParser#pseudo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPseudo(JinjaFlaskParser.PseudoContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaFlaskParser#attributeSelector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributeSelector(JinjaFlaskParser.AttributeSelectorContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaFlaskParser#atRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtRule(JinjaFlaskParser.AtRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaFlaskParser#importTerminator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportTerminator(JinjaFlaskParser.ImportTerminatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaFlaskParser#mediaQueryList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMediaQueryList(JinjaFlaskParser.MediaQueryListContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaFlaskParser#mediaQuery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMediaQuery(JinjaFlaskParser.MediaQueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaFlaskParser#declarationBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarationBlock(JinjaFlaskParser.DeclarationBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaFlaskParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(JinjaFlaskParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaFlaskParser#propertyName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertyName(JinjaFlaskParser.PropertyNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaFlaskParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(JinjaFlaskParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaFlaskParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(JinjaFlaskParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaFlaskParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(JinjaFlaskParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaFlaskParser#valueList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueList(JinjaFlaskParser.ValueListContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaFlaskParser#keyframeBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeyframeBlock(JinjaFlaskParser.KeyframeBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaFlaskParser#keyframeSelector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeyframeSelector(JinjaFlaskParser.KeyframeSelectorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code logicalOp}
	 * labeled alternative in {@link JinjaFlaskParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalOp(JinjaFlaskParser.LogicalOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code notOp}
	 * labeled alternative in {@link JinjaFlaskParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotOp(JinjaFlaskParser.NotOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code comparisonOp}
	 * labeled alternative in {@link JinjaFlaskParser#comparisonExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisonOp(JinjaFlaskParser.ComparisonOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code additiveOp}
	 * labeled alternative in {@link JinjaFlaskParser#additiveExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveOp(JinjaFlaskParser.AdditiveOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multiplicativeOp}
	 * labeled alternative in {@link JinjaFlaskParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicativeOp(JinjaFlaskParser.MultiplicativeOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code number}
	 * labeled alternative in {@link JinjaFlaskParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(JinjaFlaskParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by the {@code string}
	 * labeled alternative in {@link JinjaFlaskParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(JinjaFlaskParser.StringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code true}
	 * labeled alternative in {@link JinjaFlaskParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrue(JinjaFlaskParser.TrueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code false}
	 * labeled alternative in {@link JinjaFlaskParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFalse(JinjaFlaskParser.FalseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code none}
	 * labeled alternative in {@link JinjaFlaskParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNone(JinjaFlaskParser.NoneContext ctx);
	/**
	 * Visit a parse tree produced by the {@code name}
	 * labeled alternative in {@link JinjaFlaskParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName(JinjaFlaskParser.NameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parenthesis}
	 * labeled alternative in {@link JinjaFlaskParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesis(JinjaFlaskParser.ParenthesisContext ctx);
	/**
	 * Visit a parse tree produced by the {@code listLiteral}
	 * labeled alternative in {@link JinjaFlaskParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListLiteral(JinjaFlaskParser.ListLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tripleDoubleString}
	 * labeled alternative in {@link JinjaFlaskParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTripleDoubleString(JinjaFlaskParser.TripleDoubleStringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tripleSingleString}
	 * labeled alternative in {@link JinjaFlaskParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTripleSingleString(JinjaFlaskParser.TripleSingleStringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dictOrSetLiteral}
	 * labeled alternative in {@link JinjaFlaskParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDictOrSetLiteral(JinjaFlaskParser.DictOrSetLiteralContext ctx);
}