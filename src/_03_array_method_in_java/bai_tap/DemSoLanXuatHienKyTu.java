package _03_array_method_in_java.bai_tap;

import java.util.Scanner;

public class DemSoLanXuatHienKyTu {
    public static void main(String[] args) {
        String string = new String("Codegym Da Nang");
        char kyTu;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập ký tự cần kiểm tra");
         kyTu = scanner.next().charAt(0);
        int cnt = 0;
        for (int i = 0; i < string.length(); i++) {
            if (kyTu==(string.charAt(i))) {
                cnt++;
            }
        }
        System.out.println("số lần cuất hiện của \t" + kyTu + "\t là\t" + cnt);
    }
}
