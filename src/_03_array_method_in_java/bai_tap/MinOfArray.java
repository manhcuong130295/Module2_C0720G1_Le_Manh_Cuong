package _03_array_method_in_java.bai_tap;

import java.util.Scanner;

public class MinOfArray {
    public static void main(String[] args) {
        int size;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size");
        size = sc.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter number of array");
            array[i] = sc.nextInt();
            System.out.print(array[i] + "\t");
        }
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) ;
            min = array[i];
        }
        System.out.print("min of array is:\t" + min);
    }

}
