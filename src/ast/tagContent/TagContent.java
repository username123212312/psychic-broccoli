package ast.tagContent;

import ast.ASTNode;

public abstract class TagContent extends ASTNode {
    public TagContent(String name, int line) {
        super(name, line);
    }
}
