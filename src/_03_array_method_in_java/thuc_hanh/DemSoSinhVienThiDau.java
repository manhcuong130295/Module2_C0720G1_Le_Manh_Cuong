package _03_array_method_in_java.thuc_hanh;

import java.util.Scanner;

public class DemSoSinhVienThiDau {
    public static void main(String[] args) {
        int soSinhVien;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("nhập số sinh viên");
            soSinhVien = sc.nextInt();
            if (soSinhVien > 30) {

            }
        } while (soSinhVien > 30);
        int cnt = 0;
        int[] bangDiem = new int[soSinhVien];
        for (int i = 0; i < bangDiem.length; i++) {
            System.out.println("nhập số điểm của sinh viên \t" + (i + 1));
            bangDiem[i] = sc.nextInt();
            if (bangDiem[i] > 0 && bangDiem[i] >= 5 && bangDiem[i] <= 10) {
                cnt++;
            }
        }
        System.out.println("Số sinh viên thi đậu là:\t" + cnt);
    }
}
