package introduction_to_java_01.thuc_hanh;

import java.util.Scanner;

public class BodyMassIndex {
    public static void main(String[] args) {
        float weight, height;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Weight");
        weight = scanner.nextFloat();
        System.out.println("Enter Height");
        height = scanner.nextFloat();
        float bmi = weight/(height*height);
        if (bmi>=30) {
            System.out.println("Obese");
        } else if (bmi>=25) {
            System.out.println("Overweight");
        } else if (bmi>=18.5) {
            System.out.println("Normal");
        } else {
            System.out.println("Underweight");
        }


    }
}
