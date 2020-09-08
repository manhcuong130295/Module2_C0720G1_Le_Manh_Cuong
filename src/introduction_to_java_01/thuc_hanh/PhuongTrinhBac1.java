package introduction_to_java_01.thuc_hanh;

import java.util.Scanner;

public class PhuongTrinhBac1 {
    public static void main(String[] args) {
        System.out.println("Giai phuong trinh : ax + b = 0");
        float a;
        float b;
        float x;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a");
        a = scanner.nextFloat();
        System.out.println("Enter b");
        b = scanner.nextFloat();
        if (a != 0) {
            x = (-b)/a;
            System.out.println(x);
        } else {
            if (b==0) {
                System.out.println("phương trình có vô số nghiệm");
            } else {
                System.out.println("Phương trình vô nghiệm");
            }
        }
    }
}
