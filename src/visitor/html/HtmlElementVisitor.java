package visitor.html;

import antlr.JinjaFlaskParser;
import antlr.JinjaFlaskParserBaseVisitor;
import ast.htmlElement.HtmlElementItem;

public class HtmlElementVisitor extends JinjaFlaskParserBaseVisitor<HtmlElementItem> {
    @Override
    public HtmlElementItem visitHtmlElementItem(JinjaFlaskParser.HtmlElementItemContext ctx) {
        return super.visitHtmlElementItem(ctx);
    }

    @Override
    public HtmlElementItem visitTagElement(JinjaFlaskParser.TagElementContext ctx) {
        return super.visitTagElement(ctx);
    }

    @Override
    public HtmlElementItem visitScriptElement(JinjaFlaskParser.ScriptElementContext ctx) {
        return super.visitScriptElement(ctx);
    }

    @Override
    public HtmlElementItem visitStyleElement(JinjaFlaskParser.StyleElementContext ctx) {
        return super.visitStyleElement(ctx);
    }

    @Override
    public HtmlElementItem visitProcessingInstruction(JinjaFlaskParser.ProcessingInstructionContext ctx) {
        return super.visitProcessingInstruction(ctx);
    }

    @Override
    public HtmlElementItem visitCDataSection(JinjaFlaskParser.CDataSectionContext ctx) {
        return super.visitCDataSection(ctx);
    }

    @Override
    public HtmlElementItem visitDocTypeDeclaration(JinjaFlaskParser.DocTypeDeclarationContext ctx) {
        return super.visitDocTypeDeclaration(ctx);
    }

    @Override
    public HtmlElementItem visitServerScript(JinjaFlaskParser.ServerScriptContext ctx) {
        return super.visitServerScript(ctx);
    }
}
