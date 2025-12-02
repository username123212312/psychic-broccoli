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
	 * Visit a parse tree produced by {@link JinjaFlaskParser#simple_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_stmt(JinjaFlaskParser.Simple_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaFlaskParser#small_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSmall_stmt(JinjaFlaskParser.Small_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaFlaskParser#compound_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompound_stmt(JinjaFlaskParser.Compound_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaFlaskParser#assign_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign_stmt(JinjaFlaskParser.Assign_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaFlaskParser#template_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplate_literal(JinjaFlaskParser.Template_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaFlaskParser#html_content}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtml_content(JinjaFlaskParser.Html_contentContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaFlaskParser#import_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImport_stmt(JinjaFlaskParser.Import_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaFlaskParser#import_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImport_name(JinjaFlaskParser.Import_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaFlaskParser#import_from}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImport_from(JinjaFlaskParser.Import_fromContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaFlaskParser#import_as_names}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImport_as_names(JinjaFlaskParser.Import_as_namesContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaFlaskParser#import_as_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImport_as_name(JinjaFlaskParser.Import_as_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaFlaskParser#dotted_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDotted_name(JinjaFlaskParser.Dotted_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaFlaskParser#global_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlobal_stmt(JinjaFlaskParser.Global_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaFlaskParser#decorated}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecorated(JinjaFlaskParser.DecoratedContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaFlaskParser#decorators}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecorators(JinjaFlaskParser.DecoratorsContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaFlaskParser#decorator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecorator(JinjaFlaskParser.DecoratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaFlaskParser#func_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_def(JinjaFlaskParser.Func_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaFlaskParser#parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameters(JinjaFlaskParser.ParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaFlaskParser#typedargslist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypedargslist(JinjaFlaskParser.TypedargslistContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaFlaskParser#if_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_stmt(JinjaFlaskParser.If_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaFlaskParser#return_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_stmt(JinjaFlaskParser.Return_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaFlaskParser#flow_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFlow_stmt(JinjaFlaskParser.Flow_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaFlaskParser#suite}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuite(JinjaFlaskParser.SuiteContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaFlaskParser#testlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTestlist(JinjaFlaskParser.TestlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaFlaskParser#test}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTest(JinjaFlaskParser.TestContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaFlaskParser#or_test}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOr_test(JinjaFlaskParser.Or_testContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaFlaskParser#and_test}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnd_test(JinjaFlaskParser.And_testContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaFlaskParser#not_test}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNot_test(JinjaFlaskParser.Not_testContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaFlaskParser#comparison}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparison(JinjaFlaskParser.ComparisonContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaFlaskParser#comp_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComp_op(JinjaFlaskParser.Comp_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaFlaskParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(JinjaFlaskParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaFlaskParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(JinjaFlaskParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaFlaskParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(JinjaFlaskParser.FactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaFlaskParser#power}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPower(JinjaFlaskParser.PowerContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaFlaskParser#atom_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtom_expr(JinjaFlaskParser.Atom_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaFlaskParser#trailer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrailer(JinjaFlaskParser.TrailerContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaFlaskParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtom(JinjaFlaskParser.AtomContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaFlaskParser#list_content}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_content(JinjaFlaskParser.List_contentContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaFlaskParser#comp_for}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComp_for(JinjaFlaskParser.Comp_forContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaFlaskParser#dict_maker}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDict_maker(JinjaFlaskParser.Dict_makerContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaFlaskParser#arglist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArglist(JinjaFlaskParser.ArglistContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaFlaskParser#argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgument(JinjaFlaskParser.ArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaFlaskParser#htmlElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlElement(JinjaFlaskParser.HtmlElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaFlaskParser#tag_content}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTag_content(JinjaFlaskParser.Tag_contentContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaFlaskParser#style_content}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStyle_content(JinjaFlaskParser.Style_contentContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaFlaskParser#stylesheet}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStylesheet(JinjaFlaskParser.StylesheetContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaFlaskParser#css_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCss_statement(JinjaFlaskParser.Css_statementContext ctx);
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
	 * Visit a parse tree produced by {@link JinjaFlaskParser#css_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCss_value(JinjaFlaskParser.Css_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaFlaskParser#css_term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCss_term(JinjaFlaskParser.Css_termContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaFlaskParser#css_functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCss_functionCall(JinjaFlaskParser.Css_functionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaFlaskParser#css_valueList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCss_valueList(JinjaFlaskParser.Css_valueListContext ctx);
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
	 * Visit a parse tree produced by {@link JinjaFlaskParser#jinjaStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaStatement(JinjaFlaskParser.JinjaStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaFlaskParser#jStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJStatement(JinjaFlaskParser.JStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaFlaskParser#jRawStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJRawStatement(JinjaFlaskParser.JRawStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaFlaskParser#jIfStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJIfStatement(JinjaFlaskParser.JIfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaFlaskParser#jForStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJForStatement(JinjaFlaskParser.JForStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaFlaskParser#jTargetList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJTargetList(JinjaFlaskParser.JTargetListContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaFlaskParser#jinjaExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaExpression(JinjaFlaskParser.JinjaExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaFlaskParser#jExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJExpression(JinjaFlaskParser.JExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaFlaskParser#jFilter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJFilter(JinjaFlaskParser.JFilterContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaFlaskParser#jTestExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJTestExpr(JinjaFlaskParser.JTestExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaFlaskParser#jOrTest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJOrTest(JinjaFlaskParser.JOrTestContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaFlaskParser#jAndTest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJAndTest(JinjaFlaskParser.JAndTestContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaFlaskParser#jNotTest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJNotTest(JinjaFlaskParser.JNotTestContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaFlaskParser#jComparison}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJComparison(JinjaFlaskParser.JComparisonContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaFlaskParser#jCompOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJCompOp(JinjaFlaskParser.JCompOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaFlaskParser#jMathExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJMathExpr(JinjaFlaskParser.JMathExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaFlaskParser#jTerm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJTerm(JinjaFlaskParser.JTermContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaFlaskParser#jFactor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJFactor(JinjaFlaskParser.JFactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaFlaskParser#jAtomExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJAtomExpr(JinjaFlaskParser.JAtomExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaFlaskParser#jTrailer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJTrailer(JinjaFlaskParser.JTrailerContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaFlaskParser#jAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJAtom(JinjaFlaskParser.JAtomContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaFlaskParser#jTestExprList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJTestExprList(JinjaFlaskParser.JTestExprListContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaFlaskParser#jArgumentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJArgumentList(JinjaFlaskParser.JArgumentListContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaFlaskParser#jDictMaker}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJDictMaker(JinjaFlaskParser.JDictMakerContext ctx);
}