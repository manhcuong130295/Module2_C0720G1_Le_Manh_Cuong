package _07_abstrac_class_interface.thuc_hanh.th1;

import _07_abstrac_class_interface.thuc_hanh.th1.Apple;
import _07_abstrac_class_interface.thuc_hanh.th1.Fruit;
import _07_abstrac_class_interface.thuc_hanh.th1.Orange;

public class TestFruit {
    public static void main(String[] args) {
        Fruit[] fruits = new Fruit[2];
        fruits[0]= new Orange();
        fruits [1]= new Apple();
        for (Fruit fruit: fruits) {
            System.out.println(fruit.howToEat());
        }
    }
}
