package shared;

import java.util.ArrayList;
import java.util.List;

public class ErrorReporter {

    private final List<String> errors = new ArrayList<>();

    public void error(ErrorKind kind, String message) {
        errors.add("❌ " + kind + ": " + message);
    }

    public boolean hasErrors() {
        return !errors.isEmpty();
    }

    public void printErrors() {
        System.err.println("\n======= SEMANTIC ERRORS =======");
        for (String e : errors) {
            System.err.println(e);
        }
    }
}
