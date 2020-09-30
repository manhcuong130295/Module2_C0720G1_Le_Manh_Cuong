package _15_xu_ly_ngoai_le_debug.bai_tap;

import java.util.Scanner;

public class Triangle {
        public static void main(String[] args) throws IllegalTriangleException {

        Scanner sc = new Scanner(System.in);
        int a, b, c;
        boolean check = false;

        do {
            try {
                System.out.println("nhập 3 cạnh của tam giác");
                System.out.println("nhập cạnh a");
                a = sc.nextInt();
                System.out.println("nhập cạnh b");
                b = sc.nextInt();
                System.out.println("nhập cạnh c");
                c = sc.nextInt();
                check = (a > 0 && b > 0 && c > 0 && a + b > c && a + c > b && b + c > a);
                if (!check) {
                    throw new IllegalTriangleException("độ dài mỗi cạnh phải lớn hơn 0 và tổng độ dài 2 cạnh bất kỳ lớn hơn cạnh còn lại");
                } else {
                    System.out.println("a= " + a + " " + "b= " + b + " " + "c= " + c);
                }
            } catch (IllegalTriangleException e) {
               e.printStackTrace();
            }
        } while (!check);
    }

}
