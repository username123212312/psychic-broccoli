package semantic;

import java.util.ArrayList;
import java.util.List;

public class ErrorReporter {
    private final List<String> errors = new ArrayList<>();

    public void addError(String error) {
        errors.add(error);
    }

    public boolean hasErrors() {
        return !errors.isEmpty();
    }

    public List<String> getErrors() {
        return errors;
    }

    public void printErrors() {
        if (errors.isEmpty()) return;
        System.out.println("--- Semantic Errors ---");
        for (String e : errors) System.out.println(e);
    }
}
