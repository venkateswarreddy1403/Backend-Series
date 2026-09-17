package day03;

public class methods {

    static void sayHello() {
        System.out.println("Hello Venky");
    }

    static void greet(String name) {
        System.out.println("Hello " + name);
    }

    static int add(int a, int b) {
        return a + b;
    }

    static int multiply(int a, int b) {
        return a * b;
    }

    static int calculateTotal(int price, int quantity) {
        return multiply(price, quantity);
    }

    static boolean isEven(int a) {
        return a % 2 == 0;
    }

    static void main(String[] args) {
//        1
        sayHello();

//        2
        greet("Venky");
        greet("Rahul");

//        3
        int results = add(10, 20);
        System.out.println(results);

//        4
        System.out.println(isEven(10));

//        5
        int price = calculateTotal(500, 3);
        System.out.println(price);
    }
}
