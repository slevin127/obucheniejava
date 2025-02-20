package lesson2_3;

import java.util.Random;

public class BucketOfWater {
    private static int source = 30;   // Ведро с водой (общее для всех методов)
    private static int receiver = 0;  // Пустое ведро (куда переливаем)
    private static int lostWater = 0; // Количество пролитой воды
    private static int homeWater = 0; // Вода, которая дошла до дома

    public static void main(String[] args) {
        transferWater();  // Переливаем воду в пустое ведро
        printFinalResult(); // Выводим итоговое состояние ведер

        carryWaterToHome(1000); // Несём воду домой на 1 км
        printHomeResult(); // Выводим, сколько воды дошло до дома
    }

    // Метод для переливания воды (из source в receiver)
    public static void transferWater() {
        int liter = 0; // Счётчик литров

        while (source > 0) {
            source--; // Уменьшаем количество воды в первом ведре
            liter++;  // Увеличиваем номер текущего литра

            if (isLostWater(liter)) { // Проверяем, должен ли литр пролиться
                lostWater++;
                System.out.println("Литр " + liter + " пролился мимо!");
                continue; // Пропускаем добавление в receiver
            }

            receiver++; // Переливаем воду во второе ведро
            printStep(liter); // Выводим текущее состояние ведер
        }
    }

    // Метод проверяет, должен ли литр пролиться (каждый 10-й)
    public static boolean isLostWater(int liter) {
        return liter % 10 == 0; // Возвращает true, если литр кратен 10 (проливается)
    }

    // Метод переносит воду домой (на 1 км) и теряет её каждые 150 метров случайным образом
    public static void carryWaterToHome(int distance) {
        Random random = new Random();
        int currentWater = receiver; // Воды в ведре перед переносом

        for (int meters = 0; meters <= distance; meters += 150) {
            if (currentWater <= 0) {
                System.out.println("\nВода закончилась в пути!");
                break;
            }

            // Случайно теряем воду (вероятность 30% на каждые 150 м)
            if (random.nextDouble() < 0.3) {
                int lost = Math.min(random.nextInt(3) + 1, currentWater); // Теряем от 1 до 3 литров, но не больше текущего количества
                currentWater -= lost;
                System.out.println("На " + meters + " м потеряли " + lost + " л воды. Осталось: " + currentWater + " л.");
            } else {
                System.out.println("Прошли " + meters + " м, вода не потеряна. Осталось: " + currentWater + " л.");
            }
        }
        homeWater = currentWater; // Сколько воды дошло до дома
    }

    // Метод выводит текущее состояние ведер
    public static void printStep(int liter) {
        System.out.println("Перелили литр " + liter + ": в первом ведре = " + source +
                " л, во втором ведре = " + receiver + " л");
    }

    // Метод выводит итоговые результаты после переливания
    public static void printFinalResult() {
        System.out.println("\nПереливание завершено!");
        System.out.println("В первом ведре: " + source + " л");  // source = 0
        System.out.println("Во втором ведре: " + receiver + " л");
        System.out.println("Пролилось мимо: " + lostWater + " л");
    }

    // Метод выводит итоговые результаты после переноса воды домой
    public static void printHomeResult() {
        System.out.println("\nПеренос воды домой завершён!");
        System.out.println("Вода, дошедшая до дома: " + homeWater + " л");
    }
}
