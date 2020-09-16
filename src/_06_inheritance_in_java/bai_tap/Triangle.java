package _06_inheritance_in_java.bai_tap;

import _06_inheritance_in_java.thuc_hanh.Shape;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Triangle extends Shape {
    double side1;
    double side2;
    double side3;

    public Triangle() {
    }

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public Triangle(double side1, double side2, double side3, String color, boolean filled) {
        super(color, filled);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public double getPerimeter() {
        return this.side1 + this.side2 + this.side3;
    }

    public double getArea() {
        double halfPerimeter = getPerimeter() / 2;
        return Math.sqrt(halfPerimeter * (halfPerimeter - getSide1()) * (halfPerimeter - getSide2()) * (halfPerimeter - getSide3()));
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "color=" + getColor() + " " +
                (isFilled() ? "filled" : "not filled") +
                ",side1=" + side1 +
                ", side2=" + side2 +
                ", side3=" + side3 +
                ",perimeter=" + getPerimeter() +
                ",area=" + getArea() +
                '}';
    }
}

class TestTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b, c;
        do {
            System.out.println("Enter side of triangle");
            System.out.println("enter side 1");
            a = sc.nextDouble();
            System.out.println("enter side 1");
            b = sc.nextDouble();
            System.out.println("enter side 1");
            c = sc.nextDouble();
            if ((a > 0) && (b > 0) && (c > 0)) {
                if ((a + b) > c && (b + c) > a && (a + c) > b) {
                    System.out.println("a,b,c is side of triangle ");
                } else {
                    System.out.println("a,b,c is not side of triangle");
                }
            } else {
                System.out.println("a,b,c is not side of triangle");
            }
        } while ((a+b)<=c||(b+c)<=a||(a+c)<=b);
        Triangle triangle = new Triangle(a, b, c, "red", true);
        System.out.println(triangle.toString());
    }
}