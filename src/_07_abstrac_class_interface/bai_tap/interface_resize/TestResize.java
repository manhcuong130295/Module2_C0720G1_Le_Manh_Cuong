package _07_abstrac_class_interface.bai_tap.interface_resize;

import _07_abstrac_class_interface.bai_tap.interface_resize.Circle;
import _07_abstrac_class_interface.bai_tap.interface_resize.Rectangle;
import _07_abstrac_class_interface.bai_tap.interface_resize.Shape;
import _07_abstrac_class_interface.bai_tap.interface_resize.Square;

public class TestResize {
    public static void main(String[] args) {
        int x = (int) Math.floor(Math.random() * 10);
        Shape[] shapes=new Shape[3];
        shapes[0]=new Circle(x,"yellow",true);
        shapes [1]=new Rectangle(x,x,"red",true);
        shapes[2]=new Square(x,"blue",true);
        for (Shape a : shapes){
            System.out.println(a);
        }
        for (Shape a : shapes) {
            a.resize(Math.random() * 100);
        }
        System.out.println("\n");
        Shape.printShape(shapes);
    }
}
