package Repetition;

public class BankAccount {
    private String ownerName;
    private double balance;

    public BankAccount(double balance, String ownerName) {
        setBalance(balance);
        this.ownerName = ownerName;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if (balance < 0) {
            throw new IllegalArgumentException("Balance cannot be negative");
        }
        this.balance = balance;
    }

    @Override
    public String toString() {
            return "BankAccount [balance=" + balance + ", ownerName=" + ownerName + "]";

    }
}

