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
	 * Visit a parse tree produced by {@link JinjaFlaskParser#return_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_stmt(JinjaFlaskParser.Return_stmtContext ctx);
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
	 * Visit a parse tree produced by {@link JinjaFlaskParser#global_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlobal_stmt(JinjaFlaskParser.Global_stmtContext ctx);
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
	 * Visit a parse tree produced by {@link JinjaFlaskParser#flow_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFlow_stmt(JinjaFlaskParser.Flow_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaFlaskParser#compound_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompound_stmt(JinjaFlaskParser.Compound_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaFlaskParser#if_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_stmt(JinjaFlaskParser.If_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaFlaskParser#suite}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuite(JinjaFlaskParser.SuiteContext ctx);
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
	 * Visit a parse tree produced by {@link JinjaFlaskParser#html_content}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtml_content(JinjaFlaskParser.Html_contentContext ctx);
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
	 * Visit a parse tree produced by {@link JinjaFlaskParser#stylesheet}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStylesheet(JinjaFlaskParser.StylesheetContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaFlaskParser#ruleSet}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRuleSet(JinjaFlaskParser.RuleSetContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaFlaskParser#selectorList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectorList(JinjaFlaskParser.SelectorListContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaFlaskParser#selector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelector(JinjaFlaskParser.SelectorContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaFlaskParser#simpleSelector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleSelector(JinjaFlaskParser.SimpleSelectorContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaFlaskParser#declarationList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarationList(JinjaFlaskParser.DeclarationListContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaFlaskParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(JinjaFlaskParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaFlaskParser#cssValueTerms}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssValueTerms(JinjaFlaskParser.CssValueTermsContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaFlaskParser#cssterm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssterm(JinjaFlaskParser.CsstermContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaFlaskParser#cssfunctionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssfunctionCall(JinjaFlaskParser.CssfunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaFlaskParser#jinjaStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaStatement(JinjaFlaskParser.JinjaStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaFlaskParser#jinjaExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaExpression(JinjaFlaskParser.JinjaExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaFlaskParser#jStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJStatement(JinjaFlaskParser.JStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaFlaskParser#extends_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtends_stmt(JinjaFlaskParser.Extends_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaFlaskParser#block_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock_stmt(JinjaFlaskParser.Block_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaFlaskParser#for_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_stmt(JinjaFlaskParser.For_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaFlaskParser#j_if_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJ_if_stmt(JinjaFlaskParser.J_if_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaFlaskParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(JinjaFlaskParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaFlaskParser#call_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCall_expr(JinjaFlaskParser.Call_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaFlaskParser#var_access}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_access(JinjaFlaskParser.Var_accessContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaFlaskParser#argument_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgument_list(JinjaFlaskParser.Argument_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaFlaskParser#j_argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJ_argument(JinjaFlaskParser.J_argumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaFlaskParser#j_atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJ_atom(JinjaFlaskParser.J_atomContext ctx);
}