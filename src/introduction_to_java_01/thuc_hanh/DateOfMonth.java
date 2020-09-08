package introduction_to_java_01.thuc_hanh;

import java.util.Scanner;

public class DateOfMonth {
    public static void main(String[] args) {
        int month;
        String day;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter month");
        month = scanner.nextInt();
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                day = "31";
                System.out.println("this month have" + " " + day+" "+"days");
                break;
            case 2:
                day = "28 or 29";
                System.out.println("this month have" + " " + day+" "+"days");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                day = "30";
                System.out.println("this month have" + " " + day+" "+"days");
                break;
            default:
                System.out.println("Failed");

        }
    }
}
