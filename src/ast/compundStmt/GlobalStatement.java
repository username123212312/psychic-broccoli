package ast.compundStmt;

import ast.atom.Name;

import java.util.List;

public class GlobalStatement extends CompoundStatement{
    private List<Name> globals;

    public GlobalStatement(int line_number, List<Name> globals) {
        super("GlobalStatement", line_number);
        this.globals = globals;
    }
}
