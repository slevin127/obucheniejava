package lesson2_3;

import java.util.Scanner;

public class exercise328 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isCorrectName = false;
        while (!isCorrectName) {
            System.out.println("Введите полное имя (Фамилия Имя Отчество): ");
            String name = scanner.nextLine(); //Считывает строку из System.in
            isCorrectName = checkName(name);

            if (!isCorrectName) {
                System.out.println("Введите корректное имя!");
            }
        }
    }


    private static boolean checkName(String name) {
        name = name.trim();
        String[] words = name.split("\\s+");
        return words.length == 3;
    }
}






