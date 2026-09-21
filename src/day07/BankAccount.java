package day07;

public class BankAccount {

    private final long accountNumber;
    private String holderName;
    private double balance;

    public BankAccount(long accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;

        if (balance >= 0) {
            this.balance = balance;
        }
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public String getHolderName() {
        return holderName;
    }

    public double getBalance() {
        return balance;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount");
        } else if (amount > balance) {
            System.out.println("Insufficient balance");
        } else {
            balance -= amount;
            System.out.println("Withdrawal successful");
        }
    }
}