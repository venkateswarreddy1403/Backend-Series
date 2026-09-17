package day03;

public class Exercise {

//    1. FindMax
    static int findMax(int a, int b) {
        if(a < b) return b;
        else return a;
    }

//    2. Calculate Discount
    static double calculateDiscount(int price, int discount ) {
        return  price - (price * discount / 100);
    }

//    3. IsEligible
    static boolean isEligible(int age) {
        return age >= 18;
    }

//    4. Order
    static void processOrder(int orderId, double amount) {
        if(amount >= 1000) {
            System.out.println("Order " + orderId +": High value order");
        }else {
            System.out.println("Order " + orderId +": Normal order");
        }
    }

    public static void main(String[] args) {
        int max = findMax(5, 10);
        System.out.println(max);

        double discount = calculateDiscount(1000, 10);
        System.out.println(discount);

        System.out.println(isEligible(10));

        processOrder(101, 1000);
    }
}
