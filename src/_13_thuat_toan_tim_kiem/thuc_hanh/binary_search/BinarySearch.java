package _13_thuat_toan_tim_kiem.thuc_hanh.binary_search;

public class BinarySearch {
    static int[] list = {2, 4, 7, 10, 11, 45, 50, 59, 60, 66, 69, 70, 79};

    static int binarySearch(int[] list, int number) {
        int low = 0;
        int high = list.length - 1;
        while (high >= low) {
            int mid = (low + high) / 2;
            if (number < list[mid])
                high = mid - 1;
            else if (number == list[mid])
                return mid;
            else
                low = mid + 1;
        }
        return -1; /* Now high < low, key not found */
    }

    public static void main(String[] args) {
        System.out.println(binarySearch(list,50));
    }
}
