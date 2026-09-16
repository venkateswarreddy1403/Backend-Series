package day02;

public class loops {
    public static void main(String[] args) {

    //        FOR LOOPS

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

        // WHILE LOOPS

    // Exercise 1 — Print 1 to 10
        int a = 1;
        while(a <= 10) {
            System.out.println(a);
            a++;
        }
    // Exercise 2 — Print even numbers
        int b = 2;
        while(b <= 20) {
            System.out.println(b);
            b += 2;
        }

    // Exercise 3 — Countdown
        int c = 10;
        while (c > 0) {
            System.out.println(c);
            c--;
        }

    // Exercise 4 — Sum of numbers
        int start = 1;
        int sum = 0;
        while(start <= 10) {
            sum += start;
            start++;
        }
        System.out.println(sum);

    // Exercise 5 — Backend-style problem
        int process = 1;
        while (process <= 5) {
            System.out.println("Processing order" +process);
            process++;
        }

        // DO-WHILE
//    Exercise 1
        int q = 1;
        do {
            System.out.println(q);
            q++;
        }while (q <= 5);

//        Exercise 2
        int p = 10;
        do {
            System.out.println(p);
            p--;
        }while (p > 0);

//          Exercise 4
        int l = 1;
        do {
            System.out.println("Processing Task" +l);
            l++;
        }while (l <= 3);
    }
}
