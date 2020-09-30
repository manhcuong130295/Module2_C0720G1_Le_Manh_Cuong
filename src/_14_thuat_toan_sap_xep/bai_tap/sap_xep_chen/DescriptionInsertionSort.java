package _14_thuat_toan_sap_xep.bai_tap.sap_xep_chen;

import java.util.Arrays;

public class DescriptionInsertionSort {
    static int[] array = {5, 7, 2, 12, 20, 11, 8, 15, 55, 100, 99};

    public static void insertSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int currentElement = array[i];
            int k ;
//            while (k >= 0 && array[k] > currentElement) {
//                array[k + 1] = array[k];
//                k--;
//            }
            for (k = i - 1; k >= 0 && array[k] > currentElement; k--) {
                array[k + 1] = array[k];
            }
            System.out.println(Arrays.toString(array));
            array[k + 1] = currentElement;
            System.out.println(Arrays.toString(array));
            System.out.println("xong vòng lặp lần " + i);
        }
    }

//    public static void insertSort(int[] array) {
//        for (int i = array.length - 2; i >= 0; i--) {
//            int currentElement = array[i];
//            int j = i + 1;
//            while (j <= array.length - 1 && array[j] > currentElement) {
//                array[j] = array[j - 1];
//                j++;
//            }
//            array[j - 1] = currentElement;
//        }
//    }

    public static void main(String[] args) {
        System.out.println("mảng chưa thay đổi \t" + Arrays.toString(array));
        insertSort(array);
        for (int e : array) {
            System.out.print(e + " ");
        }
    }
}
