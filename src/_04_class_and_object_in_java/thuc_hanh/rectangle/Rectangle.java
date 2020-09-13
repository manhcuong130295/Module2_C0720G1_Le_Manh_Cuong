package _04_class_and_object_in_java.thuc_hanh.rectangle;

public class Rectangle {
    double width;
    double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return this.width * this.height;
    }

    public double getPerimeter() {
        return ((this.height + this.width) * 2);
    }

    public String displayRectangle() {
        return "Your Rectangle:" + "width=\t" + this.width + "height=\t" + this.height;
    }
}

