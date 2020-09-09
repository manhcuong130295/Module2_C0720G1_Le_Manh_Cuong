package introduction_to_java_01.bai_tap;

import java.util.Scanner;

public class DisplayGreeting {
    public static void main(String[] args) {
        String name;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name");
        name = scanner.nextLine();
        System.out.println("Hello"+" "+name);

    }
}
