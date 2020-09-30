package _15_xu_ly_ngoai_le_debug.bai_tap;

public class IllegalTriangleException extends Exception {
    private String message;

    public IllegalTriangleException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
