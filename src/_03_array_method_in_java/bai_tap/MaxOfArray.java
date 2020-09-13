package _03_array_method_in_java.bai_tap;

public class MaxOfArray {
    public static void main(String[] args) {
        int[][] array = {{20, 5, 1}, {4, 5, 7}, {8, 8, 25}};
        int max = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > max) {
                    max = array[i][j];
                }
            }
        }
        System.out.print("max of array is :\t"+max);
    }
}
