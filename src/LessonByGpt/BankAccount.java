package LessonByGpt;

import lombok.Getter;

@Getter
public class BankAccount {
    private double balance; // Lombok автоматически создаст геттер

    public BankAccount(double balance) {
        if (balance < 0) throw new IllegalArgumentException("Баланс не может быть отрицательным");
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount <= 0) throw new IllegalArgumentException("Сумма пополнения должна быть положительной");
        balance += amount;
        System.out.println("💰 Пополнение: +" + amount + " USD. Новый баланс: " + balance);
    }

    public void withdraw(double amount) {
        if (amount <= 0) throw new IllegalArgumentException("Сумма снятия должна быть положительной");
        if (amount > balance) {
            System.out.println("❌ Недостаточно средств!");
            return;
        }
        balance -= amount;
        System.out.println("💸 Снятие: -" + amount + " USD. Новый баланс: " + balance);
    }
}
