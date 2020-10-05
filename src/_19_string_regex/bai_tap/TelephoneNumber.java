package _19_string_regex.bai_tap;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TelephoneNumber {
    public static void main(String[] args) {
        final String REGEX = "\\(84\\)[-]\\(0\\d{9}\\)";
        Scanner sc = new Scanner(System.in);
        boolean check = false;

         do {
        System.out.println("Enter Numberphone");
        String numberPhone =sc.nextLine();
        Pattern pattern = Pattern.compile(REGEX);
        Matcher matcher = pattern.matcher(numberPhone.trim());
        check = matcher.matches();

            if (check) {
                System.out.println("OK");
            } else {
                System.out.println("Wrong Format! Pleasa Input Again");
         }
         } while (!check);
    }
}
