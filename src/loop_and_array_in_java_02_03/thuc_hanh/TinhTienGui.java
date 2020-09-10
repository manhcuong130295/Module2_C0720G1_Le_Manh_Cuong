package loop_and_array_in_java_02_03.thuc_hanh;

import java.util.Scanner;

public class TinhTienGui {
    public static void main(String[] args) {
        double soTienGui;
        int thoiGianGui;
        double laiSuat;
        double tongTienLai = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so tien da gui(trieu Vnd)");
        soTienGui = sc.nextDouble();
        System.out.println("nhap so thang gui");
        thoiGianGui = sc.nextInt();
        System.out.println("lai suat nam");
        laiSuat = sc.nextDouble();
        for (int i = 1; i <= thoiGianGui; i++) {
            tongTienLai = tongTienLai + soTienGui * (laiSuat / 100) / 12 * thoiGianGui;
        }
        System.out.println(tongTienLai + " " + "Vnd");
    }
}
