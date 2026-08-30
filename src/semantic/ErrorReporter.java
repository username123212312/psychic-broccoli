package semantic;

import semantic.errors.SemanticError;

import java.util.ArrayList;
import java.util.List;

public class ErrorReporter {
    private final List<SemanticError> errors = new ArrayList<>();

    public void addError(SemanticError error) {
        errors.add(error);
    }

    public void addError(String message) {
        errors.add(new SemanticError(message));
    }

    public boolean hasErrors() {
        return !errors.isEmpty();
    }

    public List<SemanticError> getErrors() {
        return errors;
    }

    public void printErrors() {
        if (errors.isEmpty()) return;
        System.out.println("--- Semantic Errors ---");
        for (SemanticError e : errors) System.out.println(e.getName() + ": " + e.getDescription());
    }
}