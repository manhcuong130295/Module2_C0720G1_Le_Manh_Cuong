package _04_class_and_object_in_java.bai_tap.stopwatch;

import java.util.Arrays;
import java.util.Scanner;

public class StopWatch {
    private long startTime;
    private long endTime;

    public StopWatch() {
        this.startTime = System.currentTimeMillis();
    }

    public long getStartTime() {
        return this.startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public void start() {
        this.startTime = System.currentTimeMillis();
    }

    public void end() {
        this.endTime = System.currentTimeMillis();
    }

    public long getElapsedTime() {
        return this.endTime - this.startTime;
    }

    public void sort(long arr[]) {
        int n = arr.length;

        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n - 1; i++) {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i + 1; j < n; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;

            // Swap the found minimum element with the first
            // element
            long temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        System.out.println("start time :\t"+stopWatch.getStartTime()+"ms");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n = sc.nextInt();
        long[] array = new long[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = (long) (Math.random() * n);
        }
        System.out.println(Arrays.toString(array));
        stopWatch.sort(array);
        stopWatch.end();
        System.out.println("end time:\t"+stopWatch.getEndTime()+"ms");
        System.out.println("local time:\t"+stopWatch.getElapsedTime()+"\tms");
    }

}
