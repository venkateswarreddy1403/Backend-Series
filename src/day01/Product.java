package day01;

public class Product {
    public static void main() {
        int price = 1000;
        int quantity = 3;

        int total = price * quantity;
        System.out.println("Total: " +total);

        if(total >= 3000)
            System.out.println("Eligible for discount");

        else
            System.out.println("No discount");
    }
}
