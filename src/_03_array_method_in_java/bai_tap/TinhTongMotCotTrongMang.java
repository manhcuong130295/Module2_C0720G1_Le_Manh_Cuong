package _03_array_method_in_java.bai_tap;

import _01_introduction_to_java.thuc_hanh.SystemTime;

import java.util.Scanner;

public class TinhTongMotCotTrongMang {
    public static void main(String[] args) {
        int[][] array = {{20, 5, 1, 3}, {4, 5, 7, 11}, {8, 8, 25, 9}};
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("nhap cot muon tinh tong");
        n = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (n == j) {
                    sum += array[i][j];
                }
            }
        }
        System.out.print("tong cua cot nay la:\t"+sum);
    }
}
