package symbolTable;

public enum SymbolTableManager {
    INSTANCE;

    private final SymbolTable symbolTable;

    SymbolTableManager() {
        symbolTable = new SymbolTable();
    }

    public SymbolTable getSymbolTable() {
        return symbolTable;
    }
}