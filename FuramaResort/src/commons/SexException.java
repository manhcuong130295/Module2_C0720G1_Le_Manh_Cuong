package commons;

public class SexException extends Exception {
    private String message;
    public SexException(String message) {
        this.message=message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
