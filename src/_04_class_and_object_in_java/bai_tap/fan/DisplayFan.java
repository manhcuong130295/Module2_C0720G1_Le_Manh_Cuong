package _04_class_and_object_in_java.bai_tap.fan;

import java.util.Scanner;

public class DisplayFan {
    public static void main(String[] args) {
        Fan fan1 = new Fan();
        boolean on = true;
        String color = "yellow";
        int speed = 3;
        double radius = 10;
        fan1.setOn(on);
        fan1.setSpeed(speed);
        fan1.setColor(color);
        fan1.setRadius(radius);
        System.out.println(fan1.toString());
        Fan fan2 = new Fan();
        boolean on2 = false;
        String color2 = "blue";
        int speed2 = 2;
        double radius2 = 5;
        fan2.setOn(on2);
        fan2.setColor(color2);
        fan2.setSpeed(speed2);
        fan2.setRadius(radius2);
        System.out.println(fan2.toString());
    }
}

