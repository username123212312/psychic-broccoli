package semantic.rules;

public interface FunctionScopeAware {
    void pushFunction(String functionName);
    void popFunction();
}
