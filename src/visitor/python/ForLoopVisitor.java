package visitor.python;

import antlr.JinjaFlaskParser;
import antlr.JinjaFlaskParserBaseVisitor;
import ast.compundStmt.ForLoop;

public class ForLoopVisitor extends JinjaFlaskParserBaseVisitor<ForLoop> {
    @Override
    public ForLoop visitSimpleForLoop(JinjaFlaskParser.SimpleForLoopContext ctx) {
        return super.visitSimpleForLoop(ctx);
    }

    @Override
    public ForLoop visitComplexForLoop(JinjaFlaskParser.ComplexForLoopContext ctx) {
        return super.visitComplexForLoop(ctx);
    }

}
