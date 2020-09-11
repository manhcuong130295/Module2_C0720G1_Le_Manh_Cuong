package _02_loop_in_java.bai_tap;

import java.util.Scanner;

public class DisplayPrimeNumber {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap do dai day muon in");
        n = sc.nextInt();
        int cnt = 0;
        int number = 2;
        while (cnt < n) {
            boolean check = true;
            if (number < 2) {
                check = false;
            } else if (number == 2) {
                check = true;
            } else if (number % 2 == 0) {
                check = false;
            } else {
                for (int index = 3; index < number; index += 2) {
                    if (number % index == 0) {
                        check = false;
                        break;
                    }
                }
            }
            if (check == true) {
                System.out.println(" " + n);
                cnt++;
            }
            number++;
        }

    }
}
