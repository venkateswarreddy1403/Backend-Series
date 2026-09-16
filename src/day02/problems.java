package day02;

public class problems {
    public static void main(String[] args) {
//        Problem 1 — Numbers
//        Print numbers from 1 to 50 using a for loop.
        for (int i = 1; i <= 50 ; i++) {
            System.out.println(i);
        }

//        Problem 2 — Odd numbers
//        Print all odd numbers from 1 to 30.
        for (int i = 1; i <= 30 ; i++) {
            if (i%2 != 0){
                System.out.println(i);
            }
        }

        int odd = 1;
        while (odd <= 30) {
            System.out.println(odd);
            odd += 2;
        }

//        Problem 3 — Sum of even numbers
//        Calculate the sum of all even numbers from 1 to 20.
        int sum = 0;
        int add = 2;
        while (add <= 20) {
            sum += add;
            add += 2;
        }
        System.out.println(sum);

//        Problem 4 — Multiplication table
        int n = 7;
        for (int i = 1; i <= 10 ; i++) {
            System.out.println("7 X " + i +" = " +n*i);
        }
//        Problem 5 — Count numbers:
//        Write a loop that counts how many numbers between 1 and 100 are divisible by 5.
        int count = 0;
        for (int i = 1; i <= 100 ; i++) {
            if (i%5 == 0){
                count++;
            }
        }
        System.out.println(count);

//        Problem 6 — Reverse countdown
        int countdown = 10;
        while (countdown > 0) {
            System.out.println(countdown);
            countdown--;
        }
        System.out.println("Done!");

//        Problem 7 — Backend-style
//        Imagine you received 10 records from a database.

        int records = 10;
        for (int i = 1; i <= records ; i++) {
            if(i % 3 == 0) {
                System.out.println("Skipping record " + i);
            }else  {
                System.out.println("Processing record " + i);
            }
        }

//        🔥 Challenge — Don't use %
//Print the even numbers from 2 to 20 without using %.
        int even = 2;
        while (even <= 20) {
            System.out.println(even);
            even += 2;
        }
    }
}
