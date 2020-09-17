package _07_abstrac_class_interface.bai_tap.interface_colorable;

import _07_abstrac_class_interface.bai_tap.interface_resize.Resizeable;

public abstract class Shape {
    private String color;
    private boolean filled;

    public Shape() {
        this.color = "green";
        this.filled = true;
    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    abstract public double getArea();

    @Override
    public String toString() {
        return "A Shape with color of "
                + getColor()
                + " and "
                + (isFilled() ? "filled" : "not filled");
    }


}
    /* @Override
    public void resize(double percent) {

    }
    public static void printShape(Shape[] shape) {
        for (Shape x : shape) {
            System.out.println(x.toString());
        }
    }*/


