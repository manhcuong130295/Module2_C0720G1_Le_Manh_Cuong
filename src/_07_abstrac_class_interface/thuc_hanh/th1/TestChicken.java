package _07_abstrac_class_interface.thuc_hanh.th1;

public class TestChicken {
    public static void main(String[] args) {
        Animal[] animals= new Animal[2];
        animals[0]= new Tiger();
        animals[1]= new Chicken();
        for (Animal animal:animals) {
            System.out.println(animal.makeSound());
            if (animal instanceof  Chicken) {
                Chicken chicken= (Chicken) animal;
                System.out.println(chicken.howToEat());
            }
        }
    }
}
