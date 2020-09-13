package _03_array_method_in_java.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class TongDuongCheoMaTran {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap kich thuoc mang");
        n = sc.nextInt();
        float sum = 0;
        float[][] array = new float[n][n];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print("Nhap phan tu cua mang\t");
               array[i][j]= sc.nextFloat();
            }
        }
    
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == j) {
                    sum += array[i][j];
                }
            }
        }
        System.out.print("tong cac phan tu duong cheo chinh cua mang la:\t"+sum);
    }


}
