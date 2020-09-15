package _05_modifier_acces.thuc_hanh;

public class Circle {
    private double radius = 1.0;
    private String color = "red";

    public Circle() {

    }

    Circle(double radius) {
        this.radius = radius;
    }

    protected double getRadius() {
        return radius;
    }

    protected double getArea() {
        return (Math.PI) * (Math.pow(this.radius, 2));
    }
}

class TestCircle {
    public void method(Circle r) {
    }

    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println("radius:\t"+circle.getRadius());
        System.out.println("area:\t"+circle.getArea());
    }
}
