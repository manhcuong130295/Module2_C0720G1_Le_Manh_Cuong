package _02_loop_in_java.thuc_hanh;

import java.util.Scanner;

public class CheckPrimeNumber {
    public static void main(String[] args) {
        int number;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        number = sc.nextInt();
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
            System.out.println("this number is a prime number");
        } else {
            System.out.println("this number is not prime number");
        }
    }
}
