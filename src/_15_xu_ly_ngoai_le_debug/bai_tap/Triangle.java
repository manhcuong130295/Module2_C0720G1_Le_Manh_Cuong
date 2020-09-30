package _15_xu_ly_ngoai_le_debug.bai_tap;

import java.util.Scanner;

public class Triangle {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        double a, b, c;
        boolean flag;
        do {
            System.out.println("Nhập độ dài 3 cạnh của tam giác");
            System.out.println("nhập a: ");
            a = sc.nextDouble();
            System.out.println("nhập b: ");
            b = sc.nextDouble();
            System.out.println("nhập c: ");
            c = sc.nextDouble();
            flag = a > 0 && b > 0 && c > 0 || a + b > c && b + c > a && c + a > b;
            if (!flag) {
                try {
                    throw new IllegalTriangleException();
                } catch (IllegalTriangleException e) {
                    e.printStackTrace();
                }
            }
        } while (!flag);
        System.out.println("a,b,c là giá trị hợp lệ của 3 cạnh của một tam giác: "+a+" , "+b+" , "+c);
    }


}
