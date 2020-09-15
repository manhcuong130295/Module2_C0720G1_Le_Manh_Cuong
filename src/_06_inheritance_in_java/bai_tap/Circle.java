package _06_inheritance_in_java.bai_tap;

import _06_inheritance_in_java.thuc_hanh.Shape;

import javax.crypto.spec.PSource;

public class Circle {
    private double radius;
    private String color;

    public Circle() {

    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "A circle with \t" + "radius\t" + getRadius() + "color:\t" + getColor();
    }
}

class TestCircle {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);
        Circle circle11 = new Circle(10, "yellow");
        System.out.println(circle11);
    }
}

class Cylinder extends Circle {
    private double height;

    public Cylinder() {

    }

    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(double height, double radius, String color) {
        super(radius, color);
        this.height = height;
    }
    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return getArea() * getHeight();
    }

    public String toString(double height) {
        return "A Cylinder with \t" + "radius\t" + getRadius() + "color:\t" + getColor() + "height" + getHeight();
    }
}

class TestCylinder {
    public static void main(String[] args) {
        Cylinder cylinder1 = new Cylinder(10, 20, "red");
        System.out.println(cylinder1);
        System.out.println("Volume is :\t" + cylinder1.getVolume());
    }
}

