package commons;

public class BirthdayException extends Exception {
    private String message;

    public BirthdayException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
