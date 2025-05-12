package lesson13;

public class StockAccount {
    public String name;
    public int balance;
    public long money;

    public StockAccount(String name, int balance) {
        this.name = name;
        this.balance = balance;

    }
    public void deposit(int amount) {
        balance += amount;

    }
    public void withdraw(int amount) {
        balance -= amount;

    }
    public void start(){
        System.out.println("Запустили программу");
    }
}
