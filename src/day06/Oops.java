package day06;

public class Oops {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount(12345, "Venky", 20000);
        BankAccount account2 = new BankAccount(34556, "Rahul", 10000);

        account1.deposit(5000);

        account1.displayAccountDetails();
        account2.displayAccountDetails();

        account1.deposit(20000);
        account1.displayAccountDetails();
        System.out.println(account1.hasSufficientBalance(20000));
        System.out.println(account1.hasSufficientBalance(100000));

        Student student = new Student();
        Student student1 = new Student("Venky");
        Student student2 = new Student("Rahul", 24, 35);
    }
}
