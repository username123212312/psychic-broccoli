package semantic.errors;

public class SemanticError extends RuntimeException {
    public SemanticError(String message) {
        super(message);
    }

    public String getName() {
        return getClass().getSimpleName();
    }

    public String getDescription() {
        return getMessage();
    }

    @Override
    public String toString() {
        return getName() + ": " + getDescription();
    }
}