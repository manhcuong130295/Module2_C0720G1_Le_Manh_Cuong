package _07_abstrac_class_interface.bai_tap.interface_colorable;

import java.util.Arrays;

public class TestColorable {
    public static void main(String[] args) {
        Shape[] shapes= new Shape[3];
        shapes[0]= new Circle(10,"yellow",true);
        shapes[1]=new Rectangle(10,20,"red",true);
        shapes[2]=new Square(10,"red",true);
        for (Shape shape : shapes) {
            if (shape instanceof Colorable) {
                System.out.println(shape.getArea());
                Square square= (Square) shape;
                square.howTocColor();
             }
        }
    }
}
