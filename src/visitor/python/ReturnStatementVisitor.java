package visitor.python;

import antlr.JinjaFlaskParser;
import antlr.JinjaFlaskParserBaseVisitor;
import ast.returnStmt.ReturnStatement;

public class ReturnStatementVisitor extends JinjaFlaskParserBaseVisitor<ReturnStatement> {
    @Override
    public ReturnStatement visitComplexReturn(JinjaFlaskParser.ComplexReturnContext ctx) {
        return super.visitComplexReturn(ctx);
    }

    @Override
    public ReturnStatement visitSimpleReturn(JinjaFlaskParser.SimpleReturnContext ctx) {
        return super.visitSimpleReturn(ctx);
    }
}
