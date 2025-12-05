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
	 * Visit a parse tree produced by {@link JinjaFlaskParser#stylesheet}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStylesheet(JinjaFlaskParser.StylesheetContext ctx);
	/**
	 * Visit a parse tree produced by the {@code goodCharset}
	 * labeled alternative in {@link JinjaFlaskParser#charset}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGoodCharset(JinjaFlaskParser.GoodCharsetContext ctx);
	/**
	 * Visit a parse tree produced by the {@code badCharset}
	 * labeled alternative in {@link JinjaFlaskParser#charset}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBadCharset(JinjaFlaskParser.BadCharsetContext ctx);
	/**
	 * Visit a parse tree produced by the {@code goodImport}
	 * labeled alternative in {@link JinjaFlaskParser#imports}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGoodImport(JinjaFlaskParser.GoodImportContext ctx);
	/**
	 * Visit a parse tree produced by the {@code badImport}
	 * labeled alternative in {@link JinjaFlaskParser#imports}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBadImport(JinjaFlaskParser.BadImportContext ctx);
	/**
	 * Visit a parse tree produced by the {@code goodNamespace}
	 * labeled alternative in {@link JinjaFlaskParser#namespace_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGoodNamespace(JinjaFlaskParser.GoodNamespaceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code badNamespace}
	 * labeled alternative in {@link JinjaFlaskParser#namespace_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBadNamespace(JinjaFlaskParser.BadNamespaceContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaFlaskParser#namespacePrefix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamespacePrefix(JinjaFlaskParser.NamespacePrefixContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaFlaskParser#media}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMedia(JinjaFlaskParser.MediaContext ctx);
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
	 * Visit a parse tree produced by {@link JinjaFlaskParser#mediaType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMediaType(JinjaFlaskParser.MediaTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaFlaskParser#mediaExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMediaExpression(JinjaFlaskParser.MediaExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaFlaskParser#mediaFeature}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMediaFeature(JinjaFlaskParser.MediaFeatureContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaFlaskParser#page}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPage(JinjaFlaskParser.PageContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaFlaskParser#pseudoPage}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPseudoPage(JinjaFlaskParser.PseudoPageContext ctx);
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
	 * Visit a parse tree produced by {@link JinjaFlaskParser#typeNamespacePrefix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeNamespacePrefix(JinjaFlaskParser.TypeNamespacePrefixContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaFlaskParser#elementName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementName(JinjaFlaskParser.ElementNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaFlaskParser#universal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUniversal(JinjaFlaskParser.UniversalContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaFlaskParser#className}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassName(JinjaFlaskParser.ClassNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaFlaskParser#attrib}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttrib(JinjaFlaskParser.AttribContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaFlaskParser#pseudo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPseudo(JinjaFlaskParser.PseudoContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaFlaskParser#functionalPseudo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionalPseudo(JinjaFlaskParser.FunctionalPseudoContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaFlaskParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(JinjaFlaskParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaFlaskParser#negation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNegation(JinjaFlaskParser.NegationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaFlaskParser#negationArg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNegationArg(JinjaFlaskParser.NegationArgContext ctx);
	/**
	 * Visit a parse tree produced by the {@code goodOperator}
	 * labeled alternative in {@link JinjaFlaskParser#operator_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGoodOperator(JinjaFlaskParser.GoodOperatorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code badOperator}
	 * labeled alternative in {@link JinjaFlaskParser#operator_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBadOperator(JinjaFlaskParser.BadOperatorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code goodProperty}
	 * labeled alternative in {@link JinjaFlaskParser#property_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGoodProperty(JinjaFlaskParser.GoodPropertyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code badProperty}
	 * labeled alternative in {@link JinjaFlaskParser#property_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBadProperty(JinjaFlaskParser.BadPropertyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code knownRuleset}
	 * labeled alternative in {@link JinjaFlaskParser#ruleset}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKnownRuleset(JinjaFlaskParser.KnownRulesetContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unknownRuleset}
	 * labeled alternative in {@link JinjaFlaskParser#ruleset}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnknownRuleset(JinjaFlaskParser.UnknownRulesetContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaFlaskParser#declarationList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarationList(JinjaFlaskParser.DeclarationListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code knownDeclaration}
	 * labeled alternative in {@link JinjaFlaskParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKnownDeclaration(JinjaFlaskParser.KnownDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unknownDeclaration}
	 * labeled alternative in {@link JinjaFlaskParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnknownDeclaration(JinjaFlaskParser.UnknownDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaFlaskParser#prio}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrio(JinjaFlaskParser.PrioContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaFlaskParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(JinjaFlaskParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaFlaskParser#css_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCss_expr(JinjaFlaskParser.Css_exprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code knownTerm}
	 * labeled alternative in {@link JinjaFlaskParser#css_term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKnownTerm(JinjaFlaskParser.KnownTermContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unknownTerm}
	 * labeled alternative in {@link JinjaFlaskParser#css_term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnknownTerm(JinjaFlaskParser.UnknownTermContext ctx);
	/**
	 * Visit a parse tree produced by the {@code badTerm}
	 * labeled alternative in {@link JinjaFlaskParser#css_term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBadTerm(JinjaFlaskParser.BadTermContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaFlaskParser#function_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_(JinjaFlaskParser.Function_Context ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaFlaskParser#dxImageTransform}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDxImageTransform(JinjaFlaskParser.DxImageTransformContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaFlaskParser#hexcolor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHexcolor(JinjaFlaskParser.HexcolorContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaFlaskParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(JinjaFlaskParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaFlaskParser#percentage}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPercentage(JinjaFlaskParser.PercentageContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaFlaskParser#dimension}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDimension(JinjaFlaskParser.DimensionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaFlaskParser#unknownDimension}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnknownDimension(JinjaFlaskParser.UnknownDimensionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaFlaskParser#any_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAny_(JinjaFlaskParser.Any_Context ctx);
	/**
	 * Visit a parse tree produced by the {@code unknownAtRule}
	 * labeled alternative in {@link JinjaFlaskParser#atRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnknownAtRule(JinjaFlaskParser.UnknownAtRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaFlaskParser#unused}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnused(JinjaFlaskParser.UnusedContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaFlaskParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(JinjaFlaskParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaFlaskParser#nestedStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNestedStatement(JinjaFlaskParser.NestedStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaFlaskParser#groupRuleBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroupRuleBody(JinjaFlaskParser.GroupRuleBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaFlaskParser#supportsRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSupportsRule(JinjaFlaskParser.SupportsRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaFlaskParser#supportsCondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSupportsCondition(JinjaFlaskParser.SupportsConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaFlaskParser#supportsConditionInParens}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSupportsConditionInParens(JinjaFlaskParser.SupportsConditionInParensContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaFlaskParser#supportsNegation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSupportsNegation(JinjaFlaskParser.SupportsNegationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaFlaskParser#supportsConjunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSupportsConjunction(JinjaFlaskParser.SupportsConjunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaFlaskParser#supportsDisjunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSupportsDisjunction(JinjaFlaskParser.SupportsDisjunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaFlaskParser#supportsDeclarationCondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSupportsDeclarationCondition(JinjaFlaskParser.SupportsDeclarationConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaFlaskParser#generalEnclosed}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGeneralEnclosed(JinjaFlaskParser.GeneralEnclosedContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaFlaskParser#url}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUrl(JinjaFlaskParser.UrlContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaFlaskParser#var_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_(JinjaFlaskParser.Var_Context ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaFlaskParser#calc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCalc(JinjaFlaskParser.CalcContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaFlaskParser#calcSum}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCalcSum(JinjaFlaskParser.CalcSumContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaFlaskParser#calcProduct}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCalcProduct(JinjaFlaskParser.CalcProductContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaFlaskParser#calcValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCalcValue(JinjaFlaskParser.CalcValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaFlaskParser#fontFaceRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFontFaceRule(JinjaFlaskParser.FontFaceRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code knownFontFaceDeclaration}
	 * labeled alternative in {@link JinjaFlaskParser#fontFaceDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKnownFontFaceDeclaration(JinjaFlaskParser.KnownFontFaceDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unknownFontFaceDeclaration}
	 * labeled alternative in {@link JinjaFlaskParser#fontFaceDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnknownFontFaceDeclaration(JinjaFlaskParser.UnknownFontFaceDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaFlaskParser#keyframesRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeyframesRule(JinjaFlaskParser.KeyframesRuleContext ctx);
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
	 * Visit a parse tree produced by {@link JinjaFlaskParser#viewport}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitViewport(JinjaFlaskParser.ViewportContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaFlaskParser#counterStyle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCounterStyle(JinjaFlaskParser.CounterStyleContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaFlaskParser#fontFeatureValuesRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFontFeatureValuesRule(JinjaFlaskParser.FontFeatureValuesRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaFlaskParser#fontFamilyNameList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFontFamilyNameList(JinjaFlaskParser.FontFamilyNameListContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaFlaskParser#fontFamilyName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFontFamilyName(JinjaFlaskParser.FontFamilyNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaFlaskParser#featureValueBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFeatureValueBlock(JinjaFlaskParser.FeatureValueBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaFlaskParser#featureType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFeatureType(JinjaFlaskParser.FeatureTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaFlaskParser#featureValueDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFeatureValueDefinition(JinjaFlaskParser.FeatureValueDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaFlaskParser#ident}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdent(JinjaFlaskParser.IdentContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaFlaskParser#jinja_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinja_part(JinjaFlaskParser.Jinja_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaFlaskParser#jinja_output}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinja_output(JinjaFlaskParser.Jinja_outputContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaFlaskParser#jinja_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinja_statement(JinjaFlaskParser.Jinja_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaFlaskParser#jinja_ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinja_ifStatement(JinjaFlaskParser.Jinja_ifStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaFlaskParser#jinja_elifBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinja_elifBlock(JinjaFlaskParser.Jinja_elifBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaFlaskParser#jinja_elseBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinja_elseBlock(JinjaFlaskParser.Jinja_elseBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaFlaskParser#jinja_forStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinja_forStatement(JinjaFlaskParser.Jinja_forStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaFlaskParser#jinja_setStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinja_setStatement(JinjaFlaskParser.Jinja_setStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaFlaskParser#jinja_rawStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinja_rawStatement(JinjaFlaskParser.Jinja_rawStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaFlaskParser#jinja_rawText}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinja_rawText(JinjaFlaskParser.Jinja_rawTextContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaFlaskParser#jinja_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinja_expr(JinjaFlaskParser.Jinja_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaFlaskParser#jinja_logicalOr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinja_logicalOr(JinjaFlaskParser.Jinja_logicalOrContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaFlaskParser#jinja_logicalAnd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinja_logicalAnd(JinjaFlaskParser.Jinja_logicalAndContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaFlaskParser#jinja_equality}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinja_equality(JinjaFlaskParser.Jinja_equalityContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaFlaskParser#jinja_comparison}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinja_comparison(JinjaFlaskParser.Jinja_comparisonContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaFlaskParser#jinja_addition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinja_addition(JinjaFlaskParser.Jinja_additionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaFlaskParser#jinja_multiplication}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinja_multiplication(JinjaFlaskParser.Jinja_multiplicationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaFlaskParser#jinja_unary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinja_unary(JinjaFlaskParser.Jinja_unaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaFlaskParser#jinja_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinja_primary(JinjaFlaskParser.Jinja_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaFlaskParser#jinja_atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinja_atom(JinjaFlaskParser.Jinja_atomContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaFlaskParser#jinja_trailer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinja_trailer(JinjaFlaskParser.Jinja_trailerContext ctx);
}