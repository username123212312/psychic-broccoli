package ast;

public abstract class ASTNode {
    public final String node_name;
    public final int line_number;
    protected List<ASTNode> children;

    public ASTNode(String node_name, int line_number) {
        this.node_name = node_name;
        this.line_number = line_number;
        this.children = new ArrayList<>();

    }
    public void print(String indent) {
        System.out.println(indent + "Node: " + node_name + " | Line: " + line_number);
        for (ASTNode child : children) {
            child.print(indent + "    ");
        }
    }

    @Override
    public String toString() {
        return node_name + ", line : " + line_number;
    }
}
