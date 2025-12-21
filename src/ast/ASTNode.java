package ast;

public abstract class ASTNode {
    public final String node_name;
    public final int line_number;

    public ASTNode(String node_name, int line_number) {
        this.node_name = node_name;
        this.line_number = line_number;
    }

    @Override
    public String toString() {
        return node_name + ", line : " + line_number;
    }
}
