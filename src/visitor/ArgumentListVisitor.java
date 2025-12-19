package visitor;

import antlr.JinjaFlaskParser;
import antlr.JinjaFlaskParserBaseVisitor;
import ast.argsList.ArgumentsList;

public class ArgumentListVisitor extends JinjaFlaskParserBaseVisitor<ArgumentsList> {
    @Override
    public ArgumentsList visitAtomArgs(JinjaFlaskParser.AtomArgsContext ctx) {
        return super.visitAtomArgs(ctx);
    }

    @Override
    public ArgumentsList visitComplexArgs(JinjaFlaskParser.ComplexArgsContext ctx) {
        return super.visitComplexArgs(ctx);
    }

}
