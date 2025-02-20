package lesson2_3;

import java.util.Scanner;

class UserNameCheckAndPass {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Запрос имени пользователя
        System.out.print("Please enter your name (Login): ");
        String name = scan.nextLine();

        // Запрос пароля
        System.out.print("Please create your password: ");
        String pass = scan.nextLine();

        // Проверка длины пароля
        while (pass.length() < 8 || pass.length() > 15) {
            System.out.println("Enter a valid password (8-15 characters). Your current password is incorrect.");
            pass = scan.nextLine();
        }

        // Вывод результата
        System.out.printf("%s, Ваш новый пароль: %s%n", name, pass);

        // Закрытие сканера
        scan.close();
    }
}
