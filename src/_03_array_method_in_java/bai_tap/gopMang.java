package _03_array_method_in_java.bai_tap;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class gopMang {
    public static void main(String[] args) {
        int[] array1 = new int[3];
        int[] array2 = new int[4];
        int[] array = new int[7];

        Scanner sc = new Scanner(System.in);
       for (int i=0;i<array1.length;i++ ) {
           System.out.print("Enter element of array1\t");
           array1[i]= sc.nextInt();
       }
        System.out.println(Arrays.toString(array1));
        for (int i=0;i<array2.length;i++ ) {
            System.out.print("Enter element of array2\t");
            array2[i]= sc.nextInt();
        }
        System.out.println(Arrays.toString(array2));
        for (int i =0;i<array1.length;i++) {
            array[i]=array1[i];
        }
        int j= array1.length;
        for (int i=0;i<array2.length;i++) {
            array[j]=array2[i];
            j++;
        }

     /*   for (int i =0; i<array.length;i++, j++) {
            if (i<=array.length/2-1){
                array[i]=array1[j];
            }else {
                array[i]=array2[j];
            }

            if (j == array.length/2-1) {
                j = -1;
            }
        }*/
        System.out.println(Arrays.toString(array));
    }
}
