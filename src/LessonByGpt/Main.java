package LessonByGpt;

public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(100);// Создаем счет с балансом 100

        account.deposit(50); // Пополняем на 50
        account.withdraw(1.10); // Снимаем
        account.withdraw(62); // Снимаем

        account.withdraw(300);// Пытаемся снять больше, чем есть
        System.out.println("Your account balance: " + account.getBalance() + " USD");
    }
}
