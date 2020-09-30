package _14_thuat_toan_sap_xep.bai_tap.sap_xep_chen;

import java.util.Arrays;

public class InsertSort {
    static int[] array = {5, 7, 2, 12, 20, 11, 8, 15, 55, 100, 99};

    public static void insertSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int currentElement = array[i];
            int k = i - 1;
            while (k >= 0 && array[k] > currentElement) {
                array[k + 1] = array[k];
                k--;
            }
            array[k + 1] = currentElement;
        }
    }

    public static void main(String[] args) {
        insertSort(array);
        System.out.println(Arrays.toString(array));
    }
}