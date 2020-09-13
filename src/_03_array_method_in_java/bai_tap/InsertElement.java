package _03_array_method_in_java.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class InsertElement {
    public static void main(String[] args) {

        int[] arrayNumber = {5, 6, 7, 8, 2, 1,0};
        int number;
        int index;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        number = sc.nextInt();
        System.out.println("location insert");
        index = sc.nextInt();
        if (index <0 || index >= arrayNumber.length - 1) {
            System.out.println("cannot insert");
        } else {
            for (int i = arrayNumber.length-1 ;i >index; i--) {
                arrayNumber[i] = arrayNumber[i-1];
            }
            arrayNumber[index]=number;
        }
        for (int j=0;j<arrayNumber.length;j++){
        System.out.print(arrayNumber[j]+"\t");
        }
    }
}