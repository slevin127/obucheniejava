package lesson4_1;

import java.util.Random;
import java.util.Scanner;

public class Find_number {
    public static void main(String[] args) {
        Random random = new Random(); // Создаем объект Random
        int myNumber = random.nextInt(100) + 1; // Генерируем случайное число от 1 до 100
        int yourNumber = 0; // Число, которое вводит пользователь
        int attempts = 0; // Счётчик попыток
        int MaxAttempts = 5; //Максимальное число попыток
        Scanner scanner = new Scanner(System.in);

        System.out.println("Компьютер загадал число от 1 до 100. Попробуйте угадать!");

        while (true) { // Бесконечный цикл игры
            System.out.print("Введите ваше число: ");

            if (scanner.hasNextInt()) { // Проверяем, ввёл ли пользователь число
                yourNumber = scanner.nextInt(); // Считываем число
                attempts++; // Увеличиваем счетчик попыток

                if (yourNumber < 1 || yourNumber > 100) {// Если число меньше 1 или(||) больше 100 будет ошибка
                    System.out.println("Число должно быть в диапазоне от 1 до 100!");
                    continue; // Пропускаем текущую итерацию и просим ввести число заново
                }

                if (yourNumber == myNumber) {
                    System.out.println("Поздравляем! Вы угадали число " + myNumber + " за " + attempts + " попыток.");
                    break; // Завершаем игру
                } else if (yourNumber < myNumber) {
                    System.out.println("Мало! Попробуйте больше.");
                } else {
                    System.out.println("Много! Попробуйте меньше.");
                }
            } else {
                System.out.println("Ошибка: Введите целое число!");
                scanner.next(); // Очищаем некорректный ввод
            }
            if (attempts == MaxAttempts) {
                System.out.println("GAME OVER");
                break;
            }
        }
        scanner.close(); // Закрываем Scanner
        System.out.println("Спасибо за игру!");
    }
}