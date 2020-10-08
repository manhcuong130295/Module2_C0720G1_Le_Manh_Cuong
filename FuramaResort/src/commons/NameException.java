package commons;

import java.util.InputMismatchException;

public class NameException extends Exception {
    private String message;

    public NameException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
