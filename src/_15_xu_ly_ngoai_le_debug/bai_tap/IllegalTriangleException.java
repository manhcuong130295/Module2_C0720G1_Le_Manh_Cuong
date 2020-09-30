package _15_xu_ly_ngoai_le_debug.bai_tap;

public class IllegalTriangleException extends Exception {
    public IllegalTriangleException() {
        super("Độ dài cạnh nhập vào phải lớn hơn 0 và tổng 2 cạnh bất kì phải lớn hơn cạnh còn lại");
    }
}
