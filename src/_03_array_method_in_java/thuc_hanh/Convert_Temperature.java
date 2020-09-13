package _03_array_method_in_java.thuc_hanh;

import java.util.Scanner;

public class Convert_Temperature {
    public static double fahrenheitToCelsius(double fahrenheit) {
        double celsius = (5.0 / 9) * (fahrenheit - 32);
        return celsius;
    }

    public static double celsiusToFahrenheit(double celsius) {
        double fahrenheit = (9.0 / 5) * celsius + 32;
        return fahrenheit;
    }

    public static double inputFahrenheit() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter Fahrenheit");
        double fahrenheit = sc.nextDouble();
        return fahrenheit;
    }

    public static double inputcCelsius() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter Celsius");
        double celsius = sc.nextDouble();
        return celsius;
    }

    public static void main(String[] args) {
        int choose;
        Scanner sc = new Scanner(System.in);
        System.out.println("choose one");
        choose = sc.nextInt();
        double result = 0;
        do {
            switch (choose) {
                case 1:
                    double fahrenheit = inputFahrenheit();
                    result = fahrenheitToCelsius(fahrenheit);
                    System.out.println("celsius=" + "\t" + result);
                    break;
                case 2:
                    double celsius = inputcCelsius();
                    result = celsiusToFahrenheit(celsius);
                    System.out.println("fahrenheit=" + "\t" + result);
                    break;
                case 0:
                    System.exit(0);
            }
        } while (choose != 0);
    }

}
