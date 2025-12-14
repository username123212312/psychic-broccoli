package ast.compundStmt;

import ast.Imported;

import java.util.List;

public class ImportStatement extends CompoundStatement {
    private String module;
    private List<Imported> importedList;

    public ImportStatement(int line_number, List<Imported> importedList) {
        super("ImportStatement", line_number);
        this.importedList = importedList;
    }
}
