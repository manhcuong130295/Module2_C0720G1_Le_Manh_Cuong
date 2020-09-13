package _04_class_and_object_in_java.thuc_hanh.rectangle;

import java.util.Scanner;

public class DisplayRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double width;
        System.out.println("enter width");
        width = sc.nextDouble();
        double height;
        System.out.println("enter height");
        height = sc.nextDouble();
        Rectangle rectangle = new Rectangle(width,height);
        System.out.println("Area of this rectangle:\t"+rectangle.getArea());
        System.out.println("Perimeter of this rectangle:'t"+rectangle.getPerimeter());
        System.out.println("Your Rectangle:\t"+rectangle.displayRectangle());

    }
}
