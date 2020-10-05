package _19_string_regex.bai_tap;

import javax.swing.*;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NameClass {
    public static void main(String[] args) {
        final String REGEX = "^[CAP]{1}\\d{4}[GHIKLM]$";
        Scanner sc = new Scanner(System.in);
        boolean check=false;
        do {
            System.out.println("Input class name");
            String testClassname = sc.nextLine();
            Pattern pattern = Pattern.compile(REGEX);
            Matcher matcher = pattern.matcher(testClassname);
             check = matcher.matches();
            if (check) {
                System.out.println("Ok");
            } else {
                System.out.println("Wrong format\nPlease input agian");
            }
        }while (!check);
    }
}
