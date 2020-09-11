package _01_introduction_to_java.thuc_hanh;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        int year ;
        Scanner scanner = new Scanner(System.in);
        System.out.println("What the year do you want to check?");
        year = scanner.nextInt();
      if (year%4==0) {
          if (year%100!=0) {
              System.out.println("Is a leap year");
          } else if (year%400!=0) {
              System.out.println("Is not a leap year");
          }else {
              System.out.println("Is a leap year");
          }
      }else {
          System.out.println("Is not a leap year");
      }
    }
}
