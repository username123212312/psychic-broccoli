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

    public void enterScope(String scopeName) {
        symbolTable.enterScope(scopeName);
    }

    public void exitScope() {
        symbolTable.exitScope();
    }

    public void declareGlobal(String name) {
        symbolTable.declareGlobal(name);
    }
}