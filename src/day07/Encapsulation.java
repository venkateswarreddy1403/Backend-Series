package day07;

public class Encapsulation {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(123456, "Venky", 10000);

        System.out.println(bankAccount.getBalance());

        bankAccount.deposit(5000);
        System.out.println("After deposit:" +bankAccount.getBalance());

        bankAccount.withdraw(10000);
        System.out.println("After withdraw:" +bankAccount.getBalance());

        bankAccount.withdraw(30000);
        System.out.println("After withdraw:" +bankAccount.getBalance());

        System.out.println(bankAccount.getBalance());
        bankAccount.deposit(-5000);

    }
}
