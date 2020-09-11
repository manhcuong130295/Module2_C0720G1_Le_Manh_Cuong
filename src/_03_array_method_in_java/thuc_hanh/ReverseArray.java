package _03_array_method_in_java.thuc_hanh;

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Enter a size:");
            size = scanner.nextInt();
            if (size > 20)
                System.out.println("Size does not exceed 20");
        } while (size > 20);
        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
            i++;
        }
        int[] newArray= reverse(array);
        for (int x=0;x<newArray.length;x++) {
            System.out.print(newArray[x]+" ");
        }
    }

    public static int[] reverse(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            int temp;
            temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
        return arr;
    }

}
