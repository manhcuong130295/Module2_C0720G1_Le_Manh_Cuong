package _13_thuat_toan_tim_kiem.thuc_hanh.binary_search;

public class BinarySearchRecursive {

    public static int binarySearchRecursive(int[] array, int start, int end, int number) {
        while (end >= start) {
            int mid = (end + start);
            if (array[mid] == number) {
                return mid;
            } else if (number < array[mid]) {
                return binarySearchRecursive(array, start, mid - 1, number);
            } else {
                return binarySearchRecursive(array, mid + 1, end, number);
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] list = {2, 4, 7, 10, 11, 45, 50, 59, 60, 66, 69, 70, 79};
        System.out.println(binarySearchRecursive(list, 0, list.length - 1, 50));

    }
}
