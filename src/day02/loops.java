package day02;

public class loops {
    public static void main(String[] args) {
    // Exercise 1: Write a Java program that prints 1 to 10
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

    // Exercise 2: Print only the even numbers from 1 to 20
        for (int i = 1; i <= 20; i++) {
            if(i%2==0){
                System.out.println(i);
            }
        }
    // Exercise 3: Print first 5 numbers in reverse order
        for (int i = 5; i > 0; i--) {
            System.out.println(i);
        }
    }
}
