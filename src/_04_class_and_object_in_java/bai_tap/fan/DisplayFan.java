package _04_class_and_object_in_java.bai_tap.fan;

import java.util.Scanner;

public class DisplayFan {
    public static void main(String[] args) {
       Fan fan = new Fan();
       boolean on = true;
       String color = "yellow";
       int speed = 3;
       double radius = 10;
       fan.setOn(on);
       fan.setSpeed(speed);
       fan.setColor(color);
       fan.setRadius(radius);
      System.out.println(fan.toString());
    }
}

