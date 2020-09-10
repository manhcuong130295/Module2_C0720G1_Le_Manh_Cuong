package loop_and_array_in_java_02_03.bai_tap;

import java.util.Scanner;

public class HienThiCacHinh {
    public static void main(String[] args) {
        int choose;
        Scanner sc = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1. ve hinh chu nhat");
        System.out.println("2. ve hinh tam giac vuong trai");
        System.out.println("3. ve hinh tam giasc vuong phai");
        System.out.println("0. Exit");
        System.out.println("Enter your choice: ");
        choose = sc.nextInt();
        switch (choose) {
            case 1:
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 5; j++) {
                        System.out.println("*");
                    }

                }

        }
    }
}
