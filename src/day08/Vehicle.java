package day08;

public class Vehicle {
    String brand;
    int speed;

    void start() {
        System.out.println("Vehicle started");
    }

    void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed);
    }
}

class Car extends Vehicle {
    void drive() {
        System.out.println("Car is driving");
    }
}


