// Generated from C:/Users/TWL/Desktop/psychic-broccoli-main/grammars/htmlParser.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link htmlParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface htmlParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link htmlParser#document}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDocument(htmlParser.DocumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link htmlParser#htmlContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlContent(htmlParser.HtmlContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link htmlParser#htmlElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlElement(htmlParser.HtmlElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link htmlParser#attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribute(htmlParser.AttributeContext ctx);
}