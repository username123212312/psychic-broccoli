// Generated from C:/Users/TWL/Desktop/psychic-broccoli-main/grammars/htmlParser.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link htmlParser}.
 */
public interface htmlParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link htmlParser#document}.
	 * @param ctx the parse tree
	 */
	void enterDocument(htmlParser.DocumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link htmlParser#document}.
	 * @param ctx the parse tree
	 */
	void exitDocument(htmlParser.DocumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link htmlParser#htmlContent}.
	 * @param ctx the parse tree
	 */
	void enterHtmlContent(htmlParser.HtmlContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link htmlParser#htmlContent}.
	 * @param ctx the parse tree
	 */
	void exitHtmlContent(htmlParser.HtmlContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link htmlParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void enterHtmlElement(htmlParser.HtmlElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link htmlParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void exitHtmlElement(htmlParser.HtmlElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link htmlParser#attribute}.
	 * @param ctx the parse tree
	 */
	void enterAttribute(htmlParser.AttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link htmlParser#attribute}.
	 * @param ctx the parse tree
	 */
	void exitAttribute(htmlParser.AttributeContext ctx);
}