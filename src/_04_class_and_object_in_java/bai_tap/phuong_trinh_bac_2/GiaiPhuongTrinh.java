package _04_class_and_object_in_java.bai_tap.phuong_trinh_bac_2;

import java.util.Scanner;

public class GiaiPhuongTrinh {
    public static void main(String[] args) {
        System.out.println("Giải hương trình ax^2 + bx + c = 0");
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a");
        double a = sc.nextDouble();
        System.out.println("enter b");
        double b = sc.nextDouble();
        System.out.println("enter c");
        double c = sc.nextDouble();
        PhuongTrinhBac2 input = new PhuongTrinhBac2(a, b, c);
        String result = input.getRoot();
        System.out.print(result);
    }
}
