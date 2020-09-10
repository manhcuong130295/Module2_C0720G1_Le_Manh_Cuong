package introduction_to_java_01.bai_tap;

import java.util.Scanner;

public class ReadTheInterger {
    public static void main(String[] args) {
        int number;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        number = scanner.nextInt();
        if (number < 0) {
            System.out.println("out of ability");
        } else if (number < 10) {
            switch (number) {
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("two");
                    break;
                case 3:
                    System.out.println("three");
                    break;
                case 4:
                    System.out.println("four");
                    break;
                case 5:
                    System.out.println("five");
                    break;
                case 6:
                    System.out.println("six");
                    break;
                case 7:
                    System.out.println("seven");
                    break;
                case 8:
                    System.out.println("eight");
                    break;
                case 9:
                    System.out.println("nine");
                    break;

            }
        } else if (number < 20) {
            switch (number) {
                case 10:
                    System.out.println("ten");
                    break;
                case 11:
                    System.out.println("eleven");
                    break;
                case 12:
                    System.out.println("twelve");
                    break;
                case 13:
                    System.out.println("thirteen");
                    break;
                case 14:
                    System.out.println("fourteen");
                    break;
                case 15:
                    System.out.println("fifteen");
                    break;
                case 16:
                    System.out.println("sixteen");
                    break;
                case 17:
                    System.out.println("seventeen");
                    break;
                case 18:
                    System.out.println("eighteen");
                    break;
                case 19:
                    System.out.println("nineteen");
                    break;
            }
        } else if (number < 100) {
            String read1;
            int result1 = number / 10;
            switch (result1) {
                case 2:
                    read1 = "twenty";
                    break;
                case 3:
                    read1 = "thirty";
                    break;
                case 4:
                    read1 = "forty";
                    break;
                case 5:
                    read1 = "fifty";
                    break;
                case 6:
                    read1 = "sixty";
                    break;
                case 7:
                    read1 = "seventy";
                    break;
                case 8:
                    read1 = "eighty";
                    break;
                case 9:
                    read1 = "ninety";
                    break;
                default:
                    read1 = "Unknown";
            }
            String read2;
            int result2;
            result2 = number % 10;
            switch (result2) {
                case 0:
                    read2 = "";
                    break;
                case 1:
                    read2 = "one";
                    break;
                case 2:
                    read2 = "two";
                    break;
                case 3:
                    read2 = "three";
                    break;
                case 4:
                    read2 = "four";
                    break;
                case 5:
                    read2 = "five";
                    break;
                case 6:
                    read2 = "six";
                    break;
                case 7:
                    read2 = "seven";
                    break;
                case 8:
                    read2 = "eight";
                    break;
                case 9:
                    read2 = "nine";
                    break;
                default:
                    read2 = "Unknown";
            }
            System.out.println(read1 + ' ' + read2);
        } else if (number < 1000) {
            String read1;
            int result1;
            result1 = number / 100;
            switch (result1) {
                case 1:
                    read1 = "one hundred";
                    break;
                case 2:
                    read1 = "two hundred";
                    break;
                case 3:
                    read1 = "three hundred";
                    break;
                case 4:
                    read1 = "four hundred";
                    break;
                case 5:
                    read1 = "five hundred";
                    break;
                case 6:
                    read1 = "six hundred";
                    break;
                case 7:
                    read1 = "seven hundred";
                    break;
                case 8:
                    read1 = "eight hundred";
                    break;
                case 9:
                    read1 = "nine hundred";
                    break;
                default:
                    read1 = "Unknown";
            }
            String read2;
            int result2;
            result2 = number % 100;
            if (result2 < 20) {
                switch (result2) {
                    case 1:
                        read2 = "one";
                        break;
                    case 2:
                        read2 = "two";
                        break;
                    case 3:
                        read2 = "three";
                        break;
                    case 4:
                        read2 = "four";
                        break;
                    case 5:
                        read2 = "five";
                        break;
                    case 6:
                        read2 = "six";
                        break;
                    case 7:
                        read2 = "seven";
                        break;
                    case 8:
                        read2 = "eight";
                        break;
                    case 9:
                        read2 = "nine";
                        break;
                    case 10:
                        read2 = "ten";
                        break;
                    case 11:
                        read2 = "eleven";
                        break;
                    case 12:
                        read2 = "twelve";
                        break;
                    case 13:
                        read2 = "thirteen";
                        break;
                    case 14:
                        read2 = "fourteen";
                        break;
                    case 15:
                        read2 = "fifteen";
                        break;
                    case 16:
                        read2 = "sixteen";
                        break;
                    case 17:
                        read2 = "seventeen";
                        break;
                    case 18:
                        read2 = "eighteen";
                        break;
                    case 19:
                        read2 = "nineteen";
                        break;
                    default:
                        read2 = " ";
                }
            } else {
                switch (result2 / 10) {
                    case 2:
                        read2 = "twenty";
                        break;
                    case 3:
                        read2 = "thirty";
                        break;
                    case 4:
                        read2 = "forty";
                        break;
                    case 5:
                        read2 = "fifty";
                        break;
                    case 6:
                        read2 = "sixty";
                        break;
                    case 7:
                        read2 = "seventy";
                        break;
                    case 8:
                        read2 = "eighty";
                        break;
                    case 9:
                        read2 = "ninety";
                        break;
                    default:
                        read2 = " ";

                }
            }
            String read3;
            int result3;
            result3 = (number % 10);
            switch (result3) {
                case 0:
                    read3 = " ";
                    break;
                case 1:
                    read3 = "one";
                    break;
                case 2:
                    read3 = "two";
                    break;
                case 3:
                    read3 = "three";
                    break;
                case 4:
                    read3 = "four";
                    break;
                case 5:
                    read3 = "five";
                    break;
                case 6:
                    read3 = "six";
                    break;
                case 7:
                    read3 = "seven";
                    break;
                case 8:
                    read3 = "eight";
                    break;
                case 9:
                    read3 = "nine";
                    break;
                default:
                    read3 = "Unknown";
            }
            System.out.println(read1 + " " + read2 + " " + read3);
        } else {
            System.out.println("Unknown");
        }
    }
}
