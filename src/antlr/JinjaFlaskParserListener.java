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
	 * Enter a parse tree produced by {@link JinjaFlaskParser#template_literal}.
	 * @param ctx the parse tree
	 */
	void enterTemplate_literal(JinjaFlaskParser.Template_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaFlaskParser#template_literal}.
	 * @param ctx the parse tree
	 */
	void exitTemplate_literal(JinjaFlaskParser.Template_literalContext ctx);
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
	 * Enter a parse tree produced by {@link JinjaFlaskParser#import_stmt}.
	 * @param ctx the parse tree
	 */
	void enterImport_stmt(JinjaFlaskParser.Import_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaFlaskParser#import_stmt}.
	 * @param ctx the parse tree
	 */
	void exitImport_stmt(JinjaFlaskParser.Import_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaFlaskParser#import_name}.
	 * @param ctx the parse tree
	 */
	void enterImport_name(JinjaFlaskParser.Import_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaFlaskParser#import_name}.
	 * @param ctx the parse tree
	 */
	void exitImport_name(JinjaFlaskParser.Import_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaFlaskParser#import_from}.
	 * @param ctx the parse tree
	 */
	void enterImport_from(JinjaFlaskParser.Import_fromContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaFlaskParser#import_from}.
	 * @param ctx the parse tree
	 */
	void exitImport_from(JinjaFlaskParser.Import_fromContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaFlaskParser#import_as_names}.
	 * @param ctx the parse tree
	 */
	void enterImport_as_names(JinjaFlaskParser.Import_as_namesContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaFlaskParser#import_as_names}.
	 * @param ctx the parse tree
	 */
	void exitImport_as_names(JinjaFlaskParser.Import_as_namesContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaFlaskParser#import_as_name}.
	 * @param ctx the parse tree
	 */
	void enterImport_as_name(JinjaFlaskParser.Import_as_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaFlaskParser#import_as_name}.
	 * @param ctx the parse tree
	 */
	void exitImport_as_name(JinjaFlaskParser.Import_as_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaFlaskParser#dotted_name}.
	 * @param ctx the parse tree
	 */
	void enterDotted_name(JinjaFlaskParser.Dotted_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaFlaskParser#dotted_name}.
	 * @param ctx the parse tree
	 */
	void exitDotted_name(JinjaFlaskParser.Dotted_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaFlaskParser#global_stmt}.
	 * @param ctx the parse tree
	 */
	void enterGlobal_stmt(JinjaFlaskParser.Global_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaFlaskParser#global_stmt}.
	 * @param ctx the parse tree
	 */
	void exitGlobal_stmt(JinjaFlaskParser.Global_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaFlaskParser#decorated}.
	 * @param ctx the parse tree
	 */
	void enterDecorated(JinjaFlaskParser.DecoratedContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaFlaskParser#decorated}.
	 * @param ctx the parse tree
	 */
	void exitDecorated(JinjaFlaskParser.DecoratedContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaFlaskParser#decorators}.
	 * @param ctx the parse tree
	 */
	void enterDecorators(JinjaFlaskParser.DecoratorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaFlaskParser#decorators}.
	 * @param ctx the parse tree
	 */
	void exitDecorators(JinjaFlaskParser.DecoratorsContext ctx);
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
	 * Enter a parse tree produced by {@link JinjaFlaskParser#func_def}.
	 * @param ctx the parse tree
	 */
	void enterFunc_def(JinjaFlaskParser.Func_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaFlaskParser#func_def}.
	 * @param ctx the parse tree
	 */
	void exitFunc_def(JinjaFlaskParser.Func_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaFlaskParser#parameters}.
	 * @param ctx the parse tree
	 */
	void enterParameters(JinjaFlaskParser.ParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaFlaskParser#parameters}.
	 * @param ctx the parse tree
	 */
	void exitParameters(JinjaFlaskParser.ParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaFlaskParser#typedargslist}.
	 * @param ctx the parse tree
	 */
	void enterTypedargslist(JinjaFlaskParser.TypedargslistContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaFlaskParser#typedargslist}.
	 * @param ctx the parse tree
	 */
	void exitTypedargslist(JinjaFlaskParser.TypedargslistContext ctx);
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
	 * Enter a parse tree produced by {@link JinjaFlaskParser#return_stmt}.
	 * @param ctx the parse tree
	 */
	void enterReturn_stmt(JinjaFlaskParser.Return_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaFlaskParser#return_stmt}.
	 * @param ctx the parse tree
	 */
	void exitReturn_stmt(JinjaFlaskParser.Return_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaFlaskParser#flow_stmt}.
	 * @param ctx the parse tree
	 */
	void enterFlow_stmt(JinjaFlaskParser.Flow_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaFlaskParser#flow_stmt}.
	 * @param ctx the parse tree
	 */
	void exitFlow_stmt(JinjaFlaskParser.Flow_stmtContext ctx);
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
	 * Enter a parse tree produced by {@link JinjaFlaskParser#expressions}.
	 * @param ctx the parse tree
	 */
	void enterExpressions(JinjaFlaskParser.ExpressionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaFlaskParser#expressions}.
	 * @param ctx the parse tree
	 */
	void exitExpressions(JinjaFlaskParser.ExpressionsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code p_number}
	 * labeled alternative in {@link JinjaFlaskParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterP_number(JinjaFlaskParser.P_numberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code p_number}
	 * labeled alternative in {@link JinjaFlaskParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitP_number(JinjaFlaskParser.P_numberContext ctx);
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
	/**
	 * Enter a parse tree produced by {@link JinjaFlaskParser#complexExpression}.
	 * @param ctx the parse tree
	 */
	void enterComplexExpression(JinjaFlaskParser.ComplexExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaFlaskParser#complexExpression}.
	 * @param ctx the parse tree
	 */
	void exitComplexExpression(JinjaFlaskParser.ComplexExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaFlaskParser#suite}.
	 * @param ctx the parse tree
	 */
	void enterSuite(JinjaFlaskParser.SuiteContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaFlaskParser#suite}.
	 * @param ctx the parse tree
	 */
	void exitSuite(JinjaFlaskParser.SuiteContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaFlaskParser#testlist}.
	 * @param ctx the parse tree
	 */
	void enterTestlist(JinjaFlaskParser.TestlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaFlaskParser#testlist}.
	 * @param ctx the parse tree
	 */
	void exitTestlist(JinjaFlaskParser.TestlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaFlaskParser#test}.
	 * @param ctx the parse tree
	 */
	void enterTest(JinjaFlaskParser.TestContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaFlaskParser#test}.
	 * @param ctx the parse tree
	 */
	void exitTest(JinjaFlaskParser.TestContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaFlaskParser#or_test}.
	 * @param ctx the parse tree
	 */
	void enterOr_test(JinjaFlaskParser.Or_testContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaFlaskParser#or_test}.
	 * @param ctx the parse tree
	 */
	void exitOr_test(JinjaFlaskParser.Or_testContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaFlaskParser#and_test}.
	 * @param ctx the parse tree
	 */
	void enterAnd_test(JinjaFlaskParser.And_testContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaFlaskParser#and_test}.
	 * @param ctx the parse tree
	 */
	void exitAnd_test(JinjaFlaskParser.And_testContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaFlaskParser#not_test}.
	 * @param ctx the parse tree
	 */
	void enterNot_test(JinjaFlaskParser.Not_testContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaFlaskParser#not_test}.
	 * @param ctx the parse tree
	 */
	void exitNot_test(JinjaFlaskParser.Not_testContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaFlaskParser#comparison}.
	 * @param ctx the parse tree
	 */
	void enterComparison(JinjaFlaskParser.ComparisonContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaFlaskParser#comparison}.
	 * @param ctx the parse tree
	 */
	void exitComparison(JinjaFlaskParser.ComparisonContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaFlaskParser#comp_op}.
	 * @param ctx the parse tree
	 */
	void enterComp_op(JinjaFlaskParser.Comp_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaFlaskParser#comp_op}.
	 * @param ctx the parse tree
	 */
	void exitComp_op(JinjaFlaskParser.Comp_opContext ctx);
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
	 * Enter a parse tree produced by {@link JinjaFlaskParser#power}.
	 * @param ctx the parse tree
	 */
	void enterPower(JinjaFlaskParser.PowerContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaFlaskParser#power}.
	 * @param ctx the parse tree
	 */
	void exitPower(JinjaFlaskParser.PowerContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaFlaskParser#atom_expr}.
	 * @param ctx the parse tree
	 */
	void enterAtom_expr(JinjaFlaskParser.Atom_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaFlaskParser#atom_expr}.
	 * @param ctx the parse tree
	 */
	void exitAtom_expr(JinjaFlaskParser.Atom_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaFlaskParser#trailer}.
	 * @param ctx the parse tree
	 */
	void enterTrailer(JinjaFlaskParser.TrailerContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaFlaskParser#trailer}.
	 * @param ctx the parse tree
	 */
	void exitTrailer(JinjaFlaskParser.TrailerContext ctx);
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
	 * Enter a parse tree produced by {@link JinjaFlaskParser#list_content}.
	 * @param ctx the parse tree
	 */
	void enterList_content(JinjaFlaskParser.List_contentContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaFlaskParser#list_content}.
	 * @param ctx the parse tree
	 */
	void exitList_content(JinjaFlaskParser.List_contentContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaFlaskParser#comp_for}.
	 * @param ctx the parse tree
	 */
	void enterComp_for(JinjaFlaskParser.Comp_forContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaFlaskParser#comp_for}.
	 * @param ctx the parse tree
	 */
	void exitComp_for(JinjaFlaskParser.Comp_forContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaFlaskParser#dict_maker}.
	 * @param ctx the parse tree
	 */
	void enterDict_maker(JinjaFlaskParser.Dict_makerContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaFlaskParser#dict_maker}.
	 * @param ctx the parse tree
	 */
	void exitDict_maker(JinjaFlaskParser.Dict_makerContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaFlaskParser#arglist}.
	 * @param ctx the parse tree
	 */
	void enterArglist(JinjaFlaskParser.ArglistContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaFlaskParser#arglist}.
	 * @param ctx the parse tree
	 */
	void exitArglist(JinjaFlaskParser.ArglistContext ctx);
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
	 * Enter a parse tree produced by {@link JinjaFlaskParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void enterHtmlElement(JinjaFlaskParser.HtmlElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaFlaskParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void exitHtmlElement(JinjaFlaskParser.HtmlElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaFlaskParser#tag_content}.
	 * @param ctx the parse tree
	 */
	void enterTag_content(JinjaFlaskParser.Tag_contentContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaFlaskParser#tag_content}.
	 * @param ctx the parse tree
	 */
	void exitTag_content(JinjaFlaskParser.Tag_contentContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaFlaskParser#stylesheet}.
	 * @param ctx the parse tree
	 */
	void enterStylesheet(JinjaFlaskParser.StylesheetContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaFlaskParser#stylesheet}.
	 * @param ctx the parse tree
	 */
	void exitStylesheet(JinjaFlaskParser.StylesheetContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaFlaskParser#ruleSet}.
	 * @param ctx the parse tree
	 */
	void enterRuleSet(JinjaFlaskParser.RuleSetContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaFlaskParser#ruleSet}.
	 * @param ctx the parse tree
	 */
	void exitRuleSet(JinjaFlaskParser.RuleSetContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaFlaskParser#selectorList}.
	 * @param ctx the parse tree
	 */
	void enterSelectorList(JinjaFlaskParser.SelectorListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaFlaskParser#selectorList}.
	 * @param ctx the parse tree
	 */
	void exitSelectorList(JinjaFlaskParser.SelectorListContext ctx);
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
	 * Enter a parse tree produced by {@link JinjaFlaskParser#declarationList}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationList(JinjaFlaskParser.DeclarationListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaFlaskParser#declarationList}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationList(JinjaFlaskParser.DeclarationListContext ctx);
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
	 * Enter a parse tree produced by {@link JinjaFlaskParser#cssValueTerms}.
	 * @param ctx the parse tree
	 */
	void enterCssValueTerms(JinjaFlaskParser.CssValueTermsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaFlaskParser#cssValueTerms}.
	 * @param ctx the parse tree
	 */
	void exitCssValueTerms(JinjaFlaskParser.CssValueTermsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaFlaskParser#cssterm}.
	 * @param ctx the parse tree
	 */
	void enterCssterm(JinjaFlaskParser.CsstermContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaFlaskParser#cssterm}.
	 * @param ctx the parse tree
	 */
	void exitCssterm(JinjaFlaskParser.CsstermContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaFlaskParser#cssfunctionCall}.
	 * @param ctx the parse tree
	 */
	void enterCssfunctionCall(JinjaFlaskParser.CssfunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaFlaskParser#cssfunctionCall}.
	 * @param ctx the parse tree
	 */
	void exitCssfunctionCall(JinjaFlaskParser.CssfunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaFlaskParser#jinjaStatement}.
	 * @param ctx the parse tree
	 */
	void enterJinjaStatement(JinjaFlaskParser.JinjaStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaFlaskParser#jinjaStatement}.
	 * @param ctx the parse tree
	 */
	void exitJinjaStatement(JinjaFlaskParser.JinjaStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaFlaskParser#jinjaExpression}.
	 * @param ctx the parse tree
	 */
	void enterJinjaExpression(JinjaFlaskParser.JinjaExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaFlaskParser#jinjaExpression}.
	 * @param ctx the parse tree
	 */
	void exitJinjaExpression(JinjaFlaskParser.JinjaExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaFlaskParser#jStatement}.
	 * @param ctx the parse tree
	 */
	void enterJStatement(JinjaFlaskParser.JStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaFlaskParser#jStatement}.
	 * @param ctx the parse tree
	 */
	void exitJStatement(JinjaFlaskParser.JStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaFlaskParser#extends_stmt}.
	 * @param ctx the parse tree
	 */
	void enterExtends_stmt(JinjaFlaskParser.Extends_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaFlaskParser#extends_stmt}.
	 * @param ctx the parse tree
	 */
	void exitExtends_stmt(JinjaFlaskParser.Extends_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaFlaskParser#block_stmt}.
	 * @param ctx the parse tree
	 */
	void enterBlock_stmt(JinjaFlaskParser.Block_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaFlaskParser#block_stmt}.
	 * @param ctx the parse tree
	 */
	void exitBlock_stmt(JinjaFlaskParser.Block_stmtContext ctx);
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
	 * Enter a parse tree produced by {@link JinjaFlaskParser#j_if_stmt}.
	 * @param ctx the parse tree
	 */
	void enterJ_if_stmt(JinjaFlaskParser.J_if_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaFlaskParser#j_if_stmt}.
	 * @param ctx the parse tree
	 */
	void exitJ_if_stmt(JinjaFlaskParser.J_if_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaFlaskParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(JinjaFlaskParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaFlaskParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(JinjaFlaskParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaFlaskParser#call_expr}.
	 * @param ctx the parse tree
	 */
	void enterCall_expr(JinjaFlaskParser.Call_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaFlaskParser#call_expr}.
	 * @param ctx the parse tree
	 */
	void exitCall_expr(JinjaFlaskParser.Call_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaFlaskParser#var_access}.
	 * @param ctx the parse tree
	 */
	void enterVar_access(JinjaFlaskParser.Var_accessContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaFlaskParser#var_access}.
	 * @param ctx the parse tree
	 */
	void exitVar_access(JinjaFlaskParser.Var_accessContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaFlaskParser#argument_list}.
	 * @param ctx the parse tree
	 */
	void enterArgument_list(JinjaFlaskParser.Argument_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaFlaskParser#argument_list}.
	 * @param ctx the parse tree
	 */
	void exitArgument_list(JinjaFlaskParser.Argument_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaFlaskParser#j_argument}.
	 * @param ctx the parse tree
	 */
	void enterJ_argument(JinjaFlaskParser.J_argumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaFlaskParser#j_argument}.
	 * @param ctx the parse tree
	 */
	void exitJ_argument(JinjaFlaskParser.J_argumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaFlaskParser#j_atom}.
	 * @param ctx the parse tree
	 */
	void enterJ_atom(JinjaFlaskParser.J_atomContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaFlaskParser#j_atom}.
	 * @param ctx the parse tree
	 */
	void exitJ_atom(JinjaFlaskParser.J_atomContext ctx);
}