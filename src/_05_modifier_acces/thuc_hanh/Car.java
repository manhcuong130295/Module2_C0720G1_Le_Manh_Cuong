package _05_modifier_acces.thuc_hanh;

public class Car {
    private String name;
    private String engine;
  public  static int numberOfCar;

    public Car(String name, String engine) {
        this.name = name;
        this.engine = engine;
        numberOfCar++;
    }

}
class TestCar {
    public static void main(String[] args) {
        Car car1 =new Car("mazda 3","Skyactiv 6");
        System.out.println(car1.numberOfCar);
        Car car2 = new Car("Huynhdai","Skyactiv 6" );
        System.out.println(car2.numberOfCar);
    }
}