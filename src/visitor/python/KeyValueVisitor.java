package visitor.python;

import antlr.JinjaFlaskParser;
import antlr.JinjaFlaskParserBaseVisitor;
import ast.keyValue.KeyValue;

public class KeyValueVisitor extends JinjaFlaskParserBaseVisitor<KeyValue> {
    @Override
    public KeyValue visitAtomKeyValue(JinjaFlaskParser.AtomKeyValueContext ctx) {
        return super.visitAtomKeyValue(ctx);
    }

    @Override
    public KeyValue visitSimpleKeyValue(JinjaFlaskParser.SimpleKeyValueContext ctx) {
        return super.visitSimpleKeyValue(ctx);
    }

}
