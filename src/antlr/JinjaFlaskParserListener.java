// Generated from C:/Users/TWL/Desktop/psychic-broccoli-main/grammars/JinjaFlaskParser.g4 by ANTLR 4.13.2
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
	 * Enter a parse tree produced by the {@code goodCharset}
	 * labeled alternative in {@link JinjaFlaskParser#charset}.
	 * @param ctx the parse tree
	 */
	void enterGoodCharset(JinjaFlaskParser.GoodCharsetContext ctx);
	/**
	 * Exit a parse tree produced by the {@code goodCharset}
	 * labeled alternative in {@link JinjaFlaskParser#charset}.
	 * @param ctx the parse tree
	 */
	void exitGoodCharset(JinjaFlaskParser.GoodCharsetContext ctx);
	/**
	 * Enter a parse tree produced by the {@code badCharset}
	 * labeled alternative in {@link JinjaFlaskParser#charset}.
	 * @param ctx the parse tree
	 */
	void enterBadCharset(JinjaFlaskParser.BadCharsetContext ctx);
	/**
	 * Exit a parse tree produced by the {@code badCharset}
	 * labeled alternative in {@link JinjaFlaskParser#charset}.
	 * @param ctx the parse tree
	 */
	void exitBadCharset(JinjaFlaskParser.BadCharsetContext ctx);
	/**
	 * Enter a parse tree produced by the {@code goodImport}
	 * labeled alternative in {@link JinjaFlaskParser#imports}.
	 * @param ctx the parse tree
	 */
	void enterGoodImport(JinjaFlaskParser.GoodImportContext ctx);
	/**
	 * Exit a parse tree produced by the {@code goodImport}
	 * labeled alternative in {@link JinjaFlaskParser#imports}.
	 * @param ctx the parse tree
	 */
	void exitGoodImport(JinjaFlaskParser.GoodImportContext ctx);
	/**
	 * Enter a parse tree produced by the {@code badImport}
	 * labeled alternative in {@link JinjaFlaskParser#imports}.
	 * @param ctx the parse tree
	 */
	void enterBadImport(JinjaFlaskParser.BadImportContext ctx);
	/**
	 * Exit a parse tree produced by the {@code badImport}
	 * labeled alternative in {@link JinjaFlaskParser#imports}.
	 * @param ctx the parse tree
	 */
	void exitBadImport(JinjaFlaskParser.BadImportContext ctx);
	/**
	 * Enter a parse tree produced by the {@code goodNamespace}
	 * labeled alternative in {@link JinjaFlaskParser#namespace_}.
	 * @param ctx the parse tree
	 */
	void enterGoodNamespace(JinjaFlaskParser.GoodNamespaceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code goodNamespace}
	 * labeled alternative in {@link JinjaFlaskParser#namespace_}.
	 * @param ctx the parse tree
	 */
	void exitGoodNamespace(JinjaFlaskParser.GoodNamespaceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code badNamespace}
	 * labeled alternative in {@link JinjaFlaskParser#namespace_}.
	 * @param ctx the parse tree
	 */
	void enterBadNamespace(JinjaFlaskParser.BadNamespaceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code badNamespace}
	 * labeled alternative in {@link JinjaFlaskParser#namespace_}.
	 * @param ctx the parse tree
	 */
	void exitBadNamespace(JinjaFlaskParser.BadNamespaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaFlaskParser#namespacePrefix}.
	 * @param ctx the parse tree
	 */
	void enterNamespacePrefix(JinjaFlaskParser.NamespacePrefixContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaFlaskParser#namespacePrefix}.
	 * @param ctx the parse tree
	 */
	void exitNamespacePrefix(JinjaFlaskParser.NamespacePrefixContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaFlaskParser#media}.
	 * @param ctx the parse tree
	 */
	void enterMedia(JinjaFlaskParser.MediaContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaFlaskParser#media}.
	 * @param ctx the parse tree
	 */
	void exitMedia(JinjaFlaskParser.MediaContext ctx);
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
	 * Enter a parse tree produced by {@link JinjaFlaskParser#mediaType}.
	 * @param ctx the parse tree
	 */
	void enterMediaType(JinjaFlaskParser.MediaTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaFlaskParser#mediaType}.
	 * @param ctx the parse tree
	 */
	void exitMediaType(JinjaFlaskParser.MediaTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaFlaskParser#mediaExpression}.
	 * @param ctx the parse tree
	 */
	void enterMediaExpression(JinjaFlaskParser.MediaExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaFlaskParser#mediaExpression}.
	 * @param ctx the parse tree
	 */
	void exitMediaExpression(JinjaFlaskParser.MediaExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaFlaskParser#mediaFeature}.
	 * @param ctx the parse tree
	 */
	void enterMediaFeature(JinjaFlaskParser.MediaFeatureContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaFlaskParser#mediaFeature}.
	 * @param ctx the parse tree
	 */
	void exitMediaFeature(JinjaFlaskParser.MediaFeatureContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaFlaskParser#page}.
	 * @param ctx the parse tree
	 */
	void enterPage(JinjaFlaskParser.PageContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaFlaskParser#page}.
	 * @param ctx the parse tree
	 */
	void exitPage(JinjaFlaskParser.PageContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaFlaskParser#pseudoPage}.
	 * @param ctx the parse tree
	 */
	void enterPseudoPage(JinjaFlaskParser.PseudoPageContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaFlaskParser#pseudoPage}.
	 * @param ctx the parse tree
	 */
	void exitPseudoPage(JinjaFlaskParser.PseudoPageContext ctx);
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
	 * Enter a parse tree produced by {@link JinjaFlaskParser#typeNamespacePrefix}.
	 * @param ctx the parse tree
	 */
	void enterTypeNamespacePrefix(JinjaFlaskParser.TypeNamespacePrefixContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaFlaskParser#typeNamespacePrefix}.
	 * @param ctx the parse tree
	 */
	void exitTypeNamespacePrefix(JinjaFlaskParser.TypeNamespacePrefixContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaFlaskParser#elementName}.
	 * @param ctx the parse tree
	 */
	void enterElementName(JinjaFlaskParser.ElementNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaFlaskParser#elementName}.
	 * @param ctx the parse tree
	 */
	void exitElementName(JinjaFlaskParser.ElementNameContext ctx);
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
	 * Enter a parse tree produced by {@link JinjaFlaskParser#className}.
	 * @param ctx the parse tree
	 */
	void enterClassName(JinjaFlaskParser.ClassNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaFlaskParser#className}.
	 * @param ctx the parse tree
	 */
	void exitClassName(JinjaFlaskParser.ClassNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaFlaskParser#attrib}.
	 * @param ctx the parse tree
	 */
	void enterAttrib(JinjaFlaskParser.AttribContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaFlaskParser#attrib}.
	 * @param ctx the parse tree
	 */
	void exitAttrib(JinjaFlaskParser.AttribContext ctx);
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
	 * Enter a parse tree produced by {@link JinjaFlaskParser#functionalPseudo}.
	 * @param ctx the parse tree
	 */
	void enterFunctionalPseudo(JinjaFlaskParser.FunctionalPseudoContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaFlaskParser#functionalPseudo}.
	 * @param ctx the parse tree
	 */
	void exitFunctionalPseudo(JinjaFlaskParser.FunctionalPseudoContext ctx);
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
	 * Enter a parse tree produced by {@link JinjaFlaskParser#negation}.
	 * @param ctx the parse tree
	 */
	void enterNegation(JinjaFlaskParser.NegationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaFlaskParser#negation}.
	 * @param ctx the parse tree
	 */
	void exitNegation(JinjaFlaskParser.NegationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaFlaskParser#negationArg}.
	 * @param ctx the parse tree
	 */
	void enterNegationArg(JinjaFlaskParser.NegationArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaFlaskParser#negationArg}.
	 * @param ctx the parse tree
	 */
	void exitNegationArg(JinjaFlaskParser.NegationArgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code goodOperator}
	 * labeled alternative in {@link JinjaFlaskParser#operator_}.
	 * @param ctx the parse tree
	 */
	void enterGoodOperator(JinjaFlaskParser.GoodOperatorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code goodOperator}
	 * labeled alternative in {@link JinjaFlaskParser#operator_}.
	 * @param ctx the parse tree
	 */
	void exitGoodOperator(JinjaFlaskParser.GoodOperatorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code badOperator}
	 * labeled alternative in {@link JinjaFlaskParser#operator_}.
	 * @param ctx the parse tree
	 */
	void enterBadOperator(JinjaFlaskParser.BadOperatorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code badOperator}
	 * labeled alternative in {@link JinjaFlaskParser#operator_}.
	 * @param ctx the parse tree
	 */
	void exitBadOperator(JinjaFlaskParser.BadOperatorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code goodProperty}
	 * labeled alternative in {@link JinjaFlaskParser#property_}.
	 * @param ctx the parse tree
	 */
	void enterGoodProperty(JinjaFlaskParser.GoodPropertyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code goodProperty}
	 * labeled alternative in {@link JinjaFlaskParser#property_}.
	 * @param ctx the parse tree
	 */
	void exitGoodProperty(JinjaFlaskParser.GoodPropertyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code badProperty}
	 * labeled alternative in {@link JinjaFlaskParser#property_}.
	 * @param ctx the parse tree
	 */
	void enterBadProperty(JinjaFlaskParser.BadPropertyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code badProperty}
	 * labeled alternative in {@link JinjaFlaskParser#property_}.
	 * @param ctx the parse tree
	 */
	void exitBadProperty(JinjaFlaskParser.BadPropertyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code knownRuleset}
	 * labeled alternative in {@link JinjaFlaskParser#ruleset}.
	 * @param ctx the parse tree
	 */
	void enterKnownRuleset(JinjaFlaskParser.KnownRulesetContext ctx);
	/**
	 * Exit a parse tree produced by the {@code knownRuleset}
	 * labeled alternative in {@link JinjaFlaskParser#ruleset}.
	 * @param ctx the parse tree
	 */
	void exitKnownRuleset(JinjaFlaskParser.KnownRulesetContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unknownRuleset}
	 * labeled alternative in {@link JinjaFlaskParser#ruleset}.
	 * @param ctx the parse tree
	 */
	void enterUnknownRuleset(JinjaFlaskParser.UnknownRulesetContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unknownRuleset}
	 * labeled alternative in {@link JinjaFlaskParser#ruleset}.
	 * @param ctx the parse tree
	 */
	void exitUnknownRuleset(JinjaFlaskParser.UnknownRulesetContext ctx);
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
	 * Enter a parse tree produced by the {@code knownDeclaration}
	 * labeled alternative in {@link JinjaFlaskParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterKnownDeclaration(JinjaFlaskParser.KnownDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code knownDeclaration}
	 * labeled alternative in {@link JinjaFlaskParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitKnownDeclaration(JinjaFlaskParser.KnownDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unknownDeclaration}
	 * labeled alternative in {@link JinjaFlaskParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterUnknownDeclaration(JinjaFlaskParser.UnknownDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unknownDeclaration}
	 * labeled alternative in {@link JinjaFlaskParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitUnknownDeclaration(JinjaFlaskParser.UnknownDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaFlaskParser#prio}.
	 * @param ctx the parse tree
	 */
	void enterPrio(JinjaFlaskParser.PrioContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaFlaskParser#prio}.
	 * @param ctx the parse tree
	 */
	void exitPrio(JinjaFlaskParser.PrioContext ctx);
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
	 * Enter a parse tree produced by {@link JinjaFlaskParser#css_expr}.
	 * @param ctx the parse tree
	 */
	void enterCss_expr(JinjaFlaskParser.Css_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaFlaskParser#css_expr}.
	 * @param ctx the parse tree
	 */
	void exitCss_expr(JinjaFlaskParser.Css_exprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code knownTerm}
	 * labeled alternative in {@link JinjaFlaskParser#css_term}.
	 * @param ctx the parse tree
	 */
	void enterKnownTerm(JinjaFlaskParser.KnownTermContext ctx);
	/**
	 * Exit a parse tree produced by the {@code knownTerm}
	 * labeled alternative in {@link JinjaFlaskParser#css_term}.
	 * @param ctx the parse tree
	 */
	void exitKnownTerm(JinjaFlaskParser.KnownTermContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unknownTerm}
	 * labeled alternative in {@link JinjaFlaskParser#css_term}.
	 * @param ctx the parse tree
	 */
	void enterUnknownTerm(JinjaFlaskParser.UnknownTermContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unknownTerm}
	 * labeled alternative in {@link JinjaFlaskParser#css_term}.
	 * @param ctx the parse tree
	 */
	void exitUnknownTerm(JinjaFlaskParser.UnknownTermContext ctx);
	/**
	 * Enter a parse tree produced by the {@code badTerm}
	 * labeled alternative in {@link JinjaFlaskParser#css_term}.
	 * @param ctx the parse tree
	 */
	void enterBadTerm(JinjaFlaskParser.BadTermContext ctx);
	/**
	 * Exit a parse tree produced by the {@code badTerm}
	 * labeled alternative in {@link JinjaFlaskParser#css_term}.
	 * @param ctx the parse tree
	 */
	void exitBadTerm(JinjaFlaskParser.BadTermContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaFlaskParser#function_}.
	 * @param ctx the parse tree
	 */
	void enterFunction_(JinjaFlaskParser.Function_Context ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaFlaskParser#function_}.
	 * @param ctx the parse tree
	 */
	void exitFunction_(JinjaFlaskParser.Function_Context ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaFlaskParser#dxImageTransform}.
	 * @param ctx the parse tree
	 */
	void enterDxImageTransform(JinjaFlaskParser.DxImageTransformContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaFlaskParser#dxImageTransform}.
	 * @param ctx the parse tree
	 */
	void exitDxImageTransform(JinjaFlaskParser.DxImageTransformContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaFlaskParser#hexcolor}.
	 * @param ctx the parse tree
	 */
	void enterHexcolor(JinjaFlaskParser.HexcolorContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaFlaskParser#hexcolor}.
	 * @param ctx the parse tree
	 */
	void exitHexcolor(JinjaFlaskParser.HexcolorContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaFlaskParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(JinjaFlaskParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaFlaskParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(JinjaFlaskParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaFlaskParser#percentage}.
	 * @param ctx the parse tree
	 */
	void enterPercentage(JinjaFlaskParser.PercentageContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaFlaskParser#percentage}.
	 * @param ctx the parse tree
	 */
	void exitPercentage(JinjaFlaskParser.PercentageContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaFlaskParser#dimension}.
	 * @param ctx the parse tree
	 */
	void enterDimension(JinjaFlaskParser.DimensionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaFlaskParser#dimension}.
	 * @param ctx the parse tree
	 */
	void exitDimension(JinjaFlaskParser.DimensionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaFlaskParser#unknownDimension}.
	 * @param ctx the parse tree
	 */
	void enterUnknownDimension(JinjaFlaskParser.UnknownDimensionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaFlaskParser#unknownDimension}.
	 * @param ctx the parse tree
	 */
	void exitUnknownDimension(JinjaFlaskParser.UnknownDimensionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaFlaskParser#any_}.
	 * @param ctx the parse tree
	 */
	void enterAny_(JinjaFlaskParser.Any_Context ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaFlaskParser#any_}.
	 * @param ctx the parse tree
	 */
	void exitAny_(JinjaFlaskParser.Any_Context ctx);
	/**
	 * Enter a parse tree produced by the {@code unknownAtRule}
	 * labeled alternative in {@link JinjaFlaskParser#atRule}.
	 * @param ctx the parse tree
	 */
	void enterUnknownAtRule(JinjaFlaskParser.UnknownAtRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unknownAtRule}
	 * labeled alternative in {@link JinjaFlaskParser#atRule}.
	 * @param ctx the parse tree
	 */
	void exitUnknownAtRule(JinjaFlaskParser.UnknownAtRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaFlaskParser#unused}.
	 * @param ctx the parse tree
	 */
	void enterUnused(JinjaFlaskParser.UnusedContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaFlaskParser#unused}.
	 * @param ctx the parse tree
	 */
	void exitUnused(JinjaFlaskParser.UnusedContext ctx);
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
	 * Enter a parse tree produced by {@link JinjaFlaskParser#nestedStatement}.
	 * @param ctx the parse tree
	 */
	void enterNestedStatement(JinjaFlaskParser.NestedStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaFlaskParser#nestedStatement}.
	 * @param ctx the parse tree
	 */
	void exitNestedStatement(JinjaFlaskParser.NestedStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaFlaskParser#groupRuleBody}.
	 * @param ctx the parse tree
	 */
	void enterGroupRuleBody(JinjaFlaskParser.GroupRuleBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaFlaskParser#groupRuleBody}.
	 * @param ctx the parse tree
	 */
	void exitGroupRuleBody(JinjaFlaskParser.GroupRuleBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaFlaskParser#supportsRule}.
	 * @param ctx the parse tree
	 */
	void enterSupportsRule(JinjaFlaskParser.SupportsRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaFlaskParser#supportsRule}.
	 * @param ctx the parse tree
	 */
	void exitSupportsRule(JinjaFlaskParser.SupportsRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaFlaskParser#supportsCondition}.
	 * @param ctx the parse tree
	 */
	void enterSupportsCondition(JinjaFlaskParser.SupportsConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaFlaskParser#supportsCondition}.
	 * @param ctx the parse tree
	 */
	void exitSupportsCondition(JinjaFlaskParser.SupportsConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaFlaskParser#supportsConditionInParens}.
	 * @param ctx the parse tree
	 */
	void enterSupportsConditionInParens(JinjaFlaskParser.SupportsConditionInParensContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaFlaskParser#supportsConditionInParens}.
	 * @param ctx the parse tree
	 */
	void exitSupportsConditionInParens(JinjaFlaskParser.SupportsConditionInParensContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaFlaskParser#supportsNegation}.
	 * @param ctx the parse tree
	 */
	void enterSupportsNegation(JinjaFlaskParser.SupportsNegationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaFlaskParser#supportsNegation}.
	 * @param ctx the parse tree
	 */
	void exitSupportsNegation(JinjaFlaskParser.SupportsNegationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaFlaskParser#supportsConjunction}.
	 * @param ctx the parse tree
	 */
	void enterSupportsConjunction(JinjaFlaskParser.SupportsConjunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaFlaskParser#supportsConjunction}.
	 * @param ctx the parse tree
	 */
	void exitSupportsConjunction(JinjaFlaskParser.SupportsConjunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaFlaskParser#supportsDisjunction}.
	 * @param ctx the parse tree
	 */
	void enterSupportsDisjunction(JinjaFlaskParser.SupportsDisjunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaFlaskParser#supportsDisjunction}.
	 * @param ctx the parse tree
	 */
	void exitSupportsDisjunction(JinjaFlaskParser.SupportsDisjunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaFlaskParser#supportsDeclarationCondition}.
	 * @param ctx the parse tree
	 */
	void enterSupportsDeclarationCondition(JinjaFlaskParser.SupportsDeclarationConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaFlaskParser#supportsDeclarationCondition}.
	 * @param ctx the parse tree
	 */
	void exitSupportsDeclarationCondition(JinjaFlaskParser.SupportsDeclarationConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaFlaskParser#generalEnclosed}.
	 * @param ctx the parse tree
	 */
	void enterGeneralEnclosed(JinjaFlaskParser.GeneralEnclosedContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaFlaskParser#generalEnclosed}.
	 * @param ctx the parse tree
	 */
	void exitGeneralEnclosed(JinjaFlaskParser.GeneralEnclosedContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaFlaskParser#url}.
	 * @param ctx the parse tree
	 */
	void enterUrl(JinjaFlaskParser.UrlContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaFlaskParser#url}.
	 * @param ctx the parse tree
	 */
	void exitUrl(JinjaFlaskParser.UrlContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaFlaskParser#var_}.
	 * @param ctx the parse tree
	 */
	void enterVar_(JinjaFlaskParser.Var_Context ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaFlaskParser#var_}.
	 * @param ctx the parse tree
	 */
	void exitVar_(JinjaFlaskParser.Var_Context ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaFlaskParser#calc}.
	 * @param ctx the parse tree
	 */
	void enterCalc(JinjaFlaskParser.CalcContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaFlaskParser#calc}.
	 * @param ctx the parse tree
	 */
	void exitCalc(JinjaFlaskParser.CalcContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaFlaskParser#calcSum}.
	 * @param ctx the parse tree
	 */
	void enterCalcSum(JinjaFlaskParser.CalcSumContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaFlaskParser#calcSum}.
	 * @param ctx the parse tree
	 */
	void exitCalcSum(JinjaFlaskParser.CalcSumContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaFlaskParser#calcProduct}.
	 * @param ctx the parse tree
	 */
	void enterCalcProduct(JinjaFlaskParser.CalcProductContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaFlaskParser#calcProduct}.
	 * @param ctx the parse tree
	 */
	void exitCalcProduct(JinjaFlaskParser.CalcProductContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaFlaskParser#calcValue}.
	 * @param ctx the parse tree
	 */
	void enterCalcValue(JinjaFlaskParser.CalcValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaFlaskParser#calcValue}.
	 * @param ctx the parse tree
	 */
	void exitCalcValue(JinjaFlaskParser.CalcValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaFlaskParser#fontFaceRule}.
	 * @param ctx the parse tree
	 */
	void enterFontFaceRule(JinjaFlaskParser.FontFaceRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaFlaskParser#fontFaceRule}.
	 * @param ctx the parse tree
	 */
	void exitFontFaceRule(JinjaFlaskParser.FontFaceRuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code knownFontFaceDeclaration}
	 * labeled alternative in {@link JinjaFlaskParser#fontFaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterKnownFontFaceDeclaration(JinjaFlaskParser.KnownFontFaceDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code knownFontFaceDeclaration}
	 * labeled alternative in {@link JinjaFlaskParser#fontFaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitKnownFontFaceDeclaration(JinjaFlaskParser.KnownFontFaceDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unknownFontFaceDeclaration}
	 * labeled alternative in {@link JinjaFlaskParser#fontFaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterUnknownFontFaceDeclaration(JinjaFlaskParser.UnknownFontFaceDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unknownFontFaceDeclaration}
	 * labeled alternative in {@link JinjaFlaskParser#fontFaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitUnknownFontFaceDeclaration(JinjaFlaskParser.UnknownFontFaceDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaFlaskParser#keyframesRule}.
	 * @param ctx the parse tree
	 */
	void enterKeyframesRule(JinjaFlaskParser.KeyframesRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaFlaskParser#keyframesRule}.
	 * @param ctx the parse tree
	 */
	void exitKeyframesRule(JinjaFlaskParser.KeyframesRuleContext ctx);
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
	 * Enter a parse tree produced by {@link JinjaFlaskParser#viewport}.
	 * @param ctx the parse tree
	 */
	void enterViewport(JinjaFlaskParser.ViewportContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaFlaskParser#viewport}.
	 * @param ctx the parse tree
	 */
	void exitViewport(JinjaFlaskParser.ViewportContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaFlaskParser#counterStyle}.
	 * @param ctx the parse tree
	 */
	void enterCounterStyle(JinjaFlaskParser.CounterStyleContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaFlaskParser#counterStyle}.
	 * @param ctx the parse tree
	 */
	void exitCounterStyle(JinjaFlaskParser.CounterStyleContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaFlaskParser#fontFeatureValuesRule}.
	 * @param ctx the parse tree
	 */
	void enterFontFeatureValuesRule(JinjaFlaskParser.FontFeatureValuesRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaFlaskParser#fontFeatureValuesRule}.
	 * @param ctx the parse tree
	 */
	void exitFontFeatureValuesRule(JinjaFlaskParser.FontFeatureValuesRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaFlaskParser#fontFamilyNameList}.
	 * @param ctx the parse tree
	 */
	void enterFontFamilyNameList(JinjaFlaskParser.FontFamilyNameListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaFlaskParser#fontFamilyNameList}.
	 * @param ctx the parse tree
	 */
	void exitFontFamilyNameList(JinjaFlaskParser.FontFamilyNameListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaFlaskParser#fontFamilyName}.
	 * @param ctx the parse tree
	 */
	void enterFontFamilyName(JinjaFlaskParser.FontFamilyNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaFlaskParser#fontFamilyName}.
	 * @param ctx the parse tree
	 */
	void exitFontFamilyName(JinjaFlaskParser.FontFamilyNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaFlaskParser#featureValueBlock}.
	 * @param ctx the parse tree
	 */
	void enterFeatureValueBlock(JinjaFlaskParser.FeatureValueBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaFlaskParser#featureValueBlock}.
	 * @param ctx the parse tree
	 */
	void exitFeatureValueBlock(JinjaFlaskParser.FeatureValueBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaFlaskParser#featureType}.
	 * @param ctx the parse tree
	 */
	void enterFeatureType(JinjaFlaskParser.FeatureTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaFlaskParser#featureType}.
	 * @param ctx the parse tree
	 */
	void exitFeatureType(JinjaFlaskParser.FeatureTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaFlaskParser#featureValueDefinition}.
	 * @param ctx the parse tree
	 */
	void enterFeatureValueDefinition(JinjaFlaskParser.FeatureValueDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaFlaskParser#featureValueDefinition}.
	 * @param ctx the parse tree
	 */
	void exitFeatureValueDefinition(JinjaFlaskParser.FeatureValueDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaFlaskParser#ident}.
	 * @param ctx the parse tree
	 */
	void enterIdent(JinjaFlaskParser.IdentContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaFlaskParser#ident}.
	 * @param ctx the parse tree
	 */
	void exitIdent(JinjaFlaskParser.IdentContext ctx);
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