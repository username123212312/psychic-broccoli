// Generated from C:/Users/Rama Alwanni/Desktop/psychic-broccoli-main/grammars/JinjaFlaskParser.g4 by ANTLR 4.13.1
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
	 * Enter a parse tree produced by {@link JinjaFlaskParser#styleElement}.
	 * @param ctx the parse tree
	 */
	void enterStyleElement(JinjaFlaskParser.StyleElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaFlaskParser#styleElement}.
	 * @param ctx the parse tree
	 */
	void exitStyleElement(JinjaFlaskParser.StyleElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaFlaskParser#styleContent}.
	 * @param ctx the parse tree
	 */
	void enterStyleContent(JinjaFlaskParser.StyleContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaFlaskParser#styleContent}.
	 * @param ctx the parse tree
	 */
	void exitStyleContent(JinjaFlaskParser.StyleContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaFlaskParser#cssStatement}.
	 * @param ctx the parse tree
	 */
	void enterCssStatement(JinjaFlaskParser.CssStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaFlaskParser#cssStatement}.
	 * @param ctx the parse tree
	 */
	void exitCssStatement(JinjaFlaskParser.CssStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaFlaskParser#ruleset}.
	 * @param ctx the parse tree
	 */
	void enterRuleset(JinjaFlaskParser.RulesetContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaFlaskParser#ruleset}.
	 * @param ctx the parse tree
	 */
	void exitRuleset(JinjaFlaskParser.RulesetContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaFlaskParser#selectorGroup}.
	 * @param ctx the parse tree
	 */
	void enterSelectorGroup(JinjaFlaskParser.SelectorGroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaFlaskParser#selectorGroup}.
	 * @param ctx the parse tree
	 */
	void exitSelectorGroup(JinjaFlaskParser.SelectorGroupContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaFlaskParser#selector}.
	 * @param ctx the parse tree
	 */
	void enterSelector(JinjaFlaskParser.SelectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaFlaskParser#selector}.
	 * @param ctx the parse tree
	 */
	void exitSelector(JinjaFlaskParser.SelectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaFlaskParser#combinator}.
	 * @param ctx the parse tree
	 */
	void enterCombinator(JinjaFlaskParser.CombinatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaFlaskParser#combinator}.
	 * @param ctx the parse tree
	 */
	void exitCombinator(JinjaFlaskParser.CombinatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaFlaskParser#simpleSelectorSequence}.
	 * @param ctx the parse tree
	 */
	void enterSimpleSelectorSequence(JinjaFlaskParser.SimpleSelectorSequenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaFlaskParser#simpleSelectorSequence}.
	 * @param ctx the parse tree
	 */
	void exitSimpleSelectorSequence(JinjaFlaskParser.SimpleSelectorSequenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaFlaskParser#simpleSelector}.
	 * @param ctx the parse tree
	 */
	void enterSimpleSelector(JinjaFlaskParser.SimpleSelectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaFlaskParser#simpleSelector}.
	 * @param ctx the parse tree
	 */
	void exitSimpleSelector(JinjaFlaskParser.SimpleSelectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaFlaskParser#typeSelector}.
	 * @param ctx the parse tree
	 */
	void enterTypeSelector(JinjaFlaskParser.TypeSelectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaFlaskParser#typeSelector}.
	 * @param ctx the parse tree
	 */
	void exitTypeSelector(JinjaFlaskParser.TypeSelectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaFlaskParser#universal}.
	 * @param ctx the parse tree
	 */
	void enterUniversal(JinjaFlaskParser.UniversalContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaFlaskParser#universal}.
	 * @param ctx the parse tree
	 */
	void exitUniversal(JinjaFlaskParser.UniversalContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaFlaskParser#hash}.
	 * @param ctx the parse tree
	 */
	void enterHash(JinjaFlaskParser.HashContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaFlaskParser#hash}.
	 * @param ctx the parse tree
	 */
	void exitHash(JinjaFlaskParser.HashContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaFlaskParser#classSelector}.
	 * @param ctx the parse tree
	 */
	void enterClassSelector(JinjaFlaskParser.ClassSelectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaFlaskParser#classSelector}.
	 * @param ctx the parse tree
	 */
	void exitClassSelector(JinjaFlaskParser.ClassSelectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaFlaskParser#pseudo}.
	 * @param ctx the parse tree
	 */
	void enterPseudo(JinjaFlaskParser.PseudoContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaFlaskParser#pseudo}.
	 * @param ctx the parse tree
	 */
	void exitPseudo(JinjaFlaskParser.PseudoContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaFlaskParser#attributeSelector}.
	 * @param ctx the parse tree
	 */
	void enterAttributeSelector(JinjaFlaskParser.AttributeSelectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaFlaskParser#attributeSelector}.
	 * @param ctx the parse tree
	 */
	void exitAttributeSelector(JinjaFlaskParser.AttributeSelectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaFlaskParser#atRule}.
	 * @param ctx the parse tree
	 */
	void enterAtRule(JinjaFlaskParser.AtRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaFlaskParser#atRule}.
	 * @param ctx the parse tree
	 */
	void exitAtRule(JinjaFlaskParser.AtRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaFlaskParser#importTerminator}.
	 * @param ctx the parse tree
	 */
	void enterImportTerminator(JinjaFlaskParser.ImportTerminatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaFlaskParser#importTerminator}.
	 * @param ctx the parse tree
	 */
	void exitImportTerminator(JinjaFlaskParser.ImportTerminatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaFlaskParser#mediaQueryList}.
	 * @param ctx the parse tree
	 */
	void enterMediaQueryList(JinjaFlaskParser.MediaQueryListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaFlaskParser#mediaQueryList}.
	 * @param ctx the parse tree
	 */
	void exitMediaQueryList(JinjaFlaskParser.MediaQueryListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaFlaskParser#mediaQuery}.
	 * @param ctx the parse tree
	 */
	void enterMediaQuery(JinjaFlaskParser.MediaQueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaFlaskParser#mediaQuery}.
	 * @param ctx the parse tree
	 */
	void exitMediaQuery(JinjaFlaskParser.MediaQueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaFlaskParser#declarationBlock}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationBlock(JinjaFlaskParser.DeclarationBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaFlaskParser#declarationBlock}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationBlock(JinjaFlaskParser.DeclarationBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaFlaskParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(JinjaFlaskParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaFlaskParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(JinjaFlaskParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaFlaskParser#propertyName}.
	 * @param ctx the parse tree
	 */
	void enterPropertyName(JinjaFlaskParser.PropertyNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaFlaskParser#propertyName}.
	 * @param ctx the parse tree
	 */
	void exitPropertyName(JinjaFlaskParser.PropertyNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaFlaskParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(JinjaFlaskParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaFlaskParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(JinjaFlaskParser.ValueContext ctx);
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
	 * Enter a parse tree produced by {@link JinjaFlaskParser#valueList}.
	 * @param ctx the parse tree
	 */
	void enterValueList(JinjaFlaskParser.ValueListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaFlaskParser#valueList}.
	 * @param ctx the parse tree
	 */
	void exitValueList(JinjaFlaskParser.ValueListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaFlaskParser#keyframeBlock}.
	 * @param ctx the parse tree
	 */
	void enterKeyframeBlock(JinjaFlaskParser.KeyframeBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaFlaskParser#keyframeBlock}.
	 * @param ctx the parse tree
	 */
	void exitKeyframeBlock(JinjaFlaskParser.KeyframeBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaFlaskParser#keyframeSelector}.
	 * @param ctx the parse tree
	 */
	void enterKeyframeSelector(JinjaFlaskParser.KeyframeSelectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaFlaskParser#keyframeSelector}.
	 * @param ctx the parse tree
	 */
	void exitKeyframeSelector(JinjaFlaskParser.KeyframeSelectorContext ctx);
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
	 * Enter a parse tree produced by the {@code tripleDoubleString}
	 * labeled alternative in {@link JinjaFlaskParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterTripleDoubleString(JinjaFlaskParser.TripleDoubleStringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tripleDoubleString}
	 * labeled alternative in {@link JinjaFlaskParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitTripleDoubleString(JinjaFlaskParser.TripleDoubleStringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tripleSingleString}
	 * labeled alternative in {@link JinjaFlaskParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterTripleSingleString(JinjaFlaskParser.TripleSingleStringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tripleSingleString}
	 * labeled alternative in {@link JinjaFlaskParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitTripleSingleString(JinjaFlaskParser.TripleSingleStringContext ctx);
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