package _03_array_method_in_java.thuc_hanh;

public class min_of_array {
    public static int minOfArray(int[] array ) {
        int min = array[0];
        for (int i =0;i<array.length;i++) {
            if (array[i]<min) {
                min= array[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[] arrayNumber = {5,2,4,3,6,7,8,9,1};
        System.out.println(" min of this array = "+" "+minOfArray(arrayNumber));
    }
}
