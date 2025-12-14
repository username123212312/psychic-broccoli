package ast;

import java.util.List;

public class DictionaryMaker extends ASTNode{
    private List<KeyValue> keyValuePairs;
    public DictionaryMaker(int line_number) {
        super("DictionaryMaker", line_number);
    }
}
