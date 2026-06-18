package visitor.python;

import antlr.html.HtmlParser;
import antlr.python.PythonParser;
import antlr.python.PythonParserBaseVisitor;
import ast.HtmlContent;
import ast.TemplateLiteral;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import visitor.html.HtmlContentVisitor;

public class TemplateLiteralVisitor extends PythonParserBaseVisitor<TemplateLiteral> {

    @Override
    public TemplateLiteral visitTemplateLiteral(PythonParser.TemplateLiteralContext ctx) {
        TemplateLiteral templateLiteral = new TemplateLiteral(ctx.getStart().getLine());
        String raw = ctx.TRIPLE_QUOTE_STRING().getText();
        templateLiteral.setContent(raw);

        // Try to parse the inner content as HTML/Jinja and attach HtmlContent to avoid NPEs later
        try {
            String inner = raw;
            if ((inner.startsWith("\"\"\"") && inner.endsWith("\"\"\"")) || (inner.startsWith("'''") && inner.endsWith("'''"))) {
                inner = inner.substring(3, inner.length() - 3);
            }
            antlr.html.HtmlLexer lexer = new antlr.html.HtmlLexer(CharStreams.fromString(inner));
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            HtmlParser parser = new HtmlParser(tokens);
            HtmlContentVisitor visitor = new HtmlContentVisitor();
            HtmlContent htmlContent = visitor.visit(parser.html_content());
            if (htmlContent == null) {
                htmlContent = new HtmlContent(ctx.getStart().getLine());
            }
            templateLiteral.setHtmlContent(htmlContent);
        } catch (Exception ex) {
            // fallback: set empty HtmlContent so later toString() won't NPE
            templateLiteral.setHtmlContent(new HtmlContent(ctx.getStart().getLine()));
        }

        return templateLiteral;
    }
}
