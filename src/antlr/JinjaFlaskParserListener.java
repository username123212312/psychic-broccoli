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
	 * Enter a parse tree produced by {@link JinjaFlaskParser#style_content}.
	 * @param ctx the parse tree
	 */
	void enterStyle_content(JinjaFlaskParser.Style_contentContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaFlaskParser#style_content}.
	 * @param ctx the parse tree
	 */
	void exitStyle_content(JinjaFlaskParser.Style_contentContext ctx);
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
	 * Enter a parse tree produced by {@link JinjaFlaskParser#css_statement}.
	 * @param ctx the parse tree
	 */
	void enterCss_statement(JinjaFlaskParser.Css_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaFlaskParser#css_statement}.
	 * @param ctx the parse tree
	 */
	void exitCss_statement(JinjaFlaskParser.Css_statementContext ctx);
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
	 * Enter a parse tree produced by {@link JinjaFlaskParser#css_value}.
	 * @param ctx the parse tree
	 */
	void enterCss_value(JinjaFlaskParser.Css_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaFlaskParser#css_value}.
	 * @param ctx the parse tree
	 */
	void exitCss_value(JinjaFlaskParser.Css_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaFlaskParser#css_term}.
	 * @param ctx the parse tree
	 */
	void enterCss_term(JinjaFlaskParser.Css_termContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaFlaskParser#css_term}.
	 * @param ctx the parse tree
	 */
	void exitCss_term(JinjaFlaskParser.Css_termContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaFlaskParser#css_functionCall}.
	 * @param ctx the parse tree
	 */
	void enterCss_functionCall(JinjaFlaskParser.Css_functionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaFlaskParser#css_functionCall}.
	 * @param ctx the parse tree
	 */
	void exitCss_functionCall(JinjaFlaskParser.Css_functionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaFlaskParser#css_valueList}.
	 * @param ctx the parse tree
	 */
	void enterCss_valueList(JinjaFlaskParser.Css_valueListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaFlaskParser#css_valueList}.
	 * @param ctx the parse tree
	 */
	void exitCss_valueList(JinjaFlaskParser.Css_valueListContext ctx);
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
	 * Enter a parse tree produced by {@link JinjaFlaskParser#jRawStatement}.
	 * @param ctx the parse tree
	 */
	void enterJRawStatement(JinjaFlaskParser.JRawStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaFlaskParser#jRawStatement}.
	 * @param ctx the parse tree
	 */
	void exitJRawStatement(JinjaFlaskParser.JRawStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaFlaskParser#jIfStatement}.
	 * @param ctx the parse tree
	 */
	void enterJIfStatement(JinjaFlaskParser.JIfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaFlaskParser#jIfStatement}.
	 * @param ctx the parse tree
	 */
	void exitJIfStatement(JinjaFlaskParser.JIfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaFlaskParser#jForStatement}.
	 * @param ctx the parse tree
	 */
	void enterJForStatement(JinjaFlaskParser.JForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaFlaskParser#jForStatement}.
	 * @param ctx the parse tree
	 */
	void exitJForStatement(JinjaFlaskParser.JForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaFlaskParser#jTargetList}.
	 * @param ctx the parse tree
	 */
	void enterJTargetList(JinjaFlaskParser.JTargetListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaFlaskParser#jTargetList}.
	 * @param ctx the parse tree
	 */
	void exitJTargetList(JinjaFlaskParser.JTargetListContext ctx);
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
	 * Enter a parse tree produced by {@link JinjaFlaskParser#jExpression}.
	 * @param ctx the parse tree
	 */
	void enterJExpression(JinjaFlaskParser.JExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaFlaskParser#jExpression}.
	 * @param ctx the parse tree
	 */
	void exitJExpression(JinjaFlaskParser.JExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaFlaskParser#jFilter}.
	 * @param ctx the parse tree
	 */
	void enterJFilter(JinjaFlaskParser.JFilterContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaFlaskParser#jFilter}.
	 * @param ctx the parse tree
	 */
	void exitJFilter(JinjaFlaskParser.JFilterContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaFlaskParser#jTestExpr}.
	 * @param ctx the parse tree
	 */
	void enterJTestExpr(JinjaFlaskParser.JTestExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaFlaskParser#jTestExpr}.
	 * @param ctx the parse tree
	 */
	void exitJTestExpr(JinjaFlaskParser.JTestExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaFlaskParser#jOrTest}.
	 * @param ctx the parse tree
	 */
	void enterJOrTest(JinjaFlaskParser.JOrTestContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaFlaskParser#jOrTest}.
	 * @param ctx the parse tree
	 */
	void exitJOrTest(JinjaFlaskParser.JOrTestContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaFlaskParser#jAndTest}.
	 * @param ctx the parse tree
	 */
	void enterJAndTest(JinjaFlaskParser.JAndTestContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaFlaskParser#jAndTest}.
	 * @param ctx the parse tree
	 */
	void exitJAndTest(JinjaFlaskParser.JAndTestContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaFlaskParser#jNotTest}.
	 * @param ctx the parse tree
	 */
	void enterJNotTest(JinjaFlaskParser.JNotTestContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaFlaskParser#jNotTest}.
	 * @param ctx the parse tree
	 */
	void exitJNotTest(JinjaFlaskParser.JNotTestContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaFlaskParser#jComparison}.
	 * @param ctx the parse tree
	 */
	void enterJComparison(JinjaFlaskParser.JComparisonContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaFlaskParser#jComparison}.
	 * @param ctx the parse tree
	 */
	void exitJComparison(JinjaFlaskParser.JComparisonContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaFlaskParser#jCompOp}.
	 * @param ctx the parse tree
	 */
	void enterJCompOp(JinjaFlaskParser.JCompOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaFlaskParser#jCompOp}.
	 * @param ctx the parse tree
	 */
	void exitJCompOp(JinjaFlaskParser.JCompOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaFlaskParser#jMathExpr}.
	 * @param ctx the parse tree
	 */
	void enterJMathExpr(JinjaFlaskParser.JMathExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaFlaskParser#jMathExpr}.
	 * @param ctx the parse tree
	 */
	void exitJMathExpr(JinjaFlaskParser.JMathExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaFlaskParser#jTerm}.
	 * @param ctx the parse tree
	 */
	void enterJTerm(JinjaFlaskParser.JTermContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaFlaskParser#jTerm}.
	 * @param ctx the parse tree
	 */
	void exitJTerm(JinjaFlaskParser.JTermContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaFlaskParser#jFactor}.
	 * @param ctx the parse tree
	 */
	void enterJFactor(JinjaFlaskParser.JFactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaFlaskParser#jFactor}.
	 * @param ctx the parse tree
	 */
	void exitJFactor(JinjaFlaskParser.JFactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaFlaskParser#jAtomExpr}.
	 * @param ctx the parse tree
	 */
	void enterJAtomExpr(JinjaFlaskParser.JAtomExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaFlaskParser#jAtomExpr}.
	 * @param ctx the parse tree
	 */
	void exitJAtomExpr(JinjaFlaskParser.JAtomExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaFlaskParser#jTrailer}.
	 * @param ctx the parse tree
	 */
	void enterJTrailer(JinjaFlaskParser.JTrailerContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaFlaskParser#jTrailer}.
	 * @param ctx the parse tree
	 */
	void exitJTrailer(JinjaFlaskParser.JTrailerContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaFlaskParser#jAtom}.
	 * @param ctx the parse tree
	 */
	void enterJAtom(JinjaFlaskParser.JAtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaFlaskParser#jAtom}.
	 * @param ctx the parse tree
	 */
	void exitJAtom(JinjaFlaskParser.JAtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaFlaskParser#jTestExprList}.
	 * @param ctx the parse tree
	 */
	void enterJTestExprList(JinjaFlaskParser.JTestExprListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaFlaskParser#jTestExprList}.
	 * @param ctx the parse tree
	 */
	void exitJTestExprList(JinjaFlaskParser.JTestExprListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaFlaskParser#jArgumentList}.
	 * @param ctx the parse tree
	 */
	void enterJArgumentList(JinjaFlaskParser.JArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaFlaskParser#jArgumentList}.
	 * @param ctx the parse tree
	 */
	void exitJArgumentList(JinjaFlaskParser.JArgumentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaFlaskParser#jDictMaker}.
	 * @param ctx the parse tree
	 */
	void enterJDictMaker(JinjaFlaskParser.JDictMakerContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaFlaskParser#jDictMaker}.
	 * @param ctx the parse tree
	 */
	void exitJDictMaker(JinjaFlaskParser.JDictMakerContext ctx);
}