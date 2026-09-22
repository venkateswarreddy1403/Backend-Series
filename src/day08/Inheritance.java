package day08;

public class Inheritance {
    public static void main(String[] args) {
        Car car = new Car();
        car.brand = "Toyota";
        car.speed = 120;

        car.start();
        car.displayDetails();
        car.drive();
    }
}
