package lesson10.Task_1;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
Класс предназначен для обработки чисел, записанных построчно в файл
numbers.txt, с целью выявления чисел, совпадающих со своей позицией
(т.е. чисел, где значение равно порядковому номеру строки).
Он предоставляет два метода для записи таких совпадений в файл:

   1. writeOrder() — сохраняет каждое совпадение в отдельной строке.

    2. writeOrder2() — записывает все совпадения в одну строку через пробел.
 */
public class Receipt4 {
    public static void writeOrder() throws IOException {
        List<Integer> numbers = new ArrayList<>();

        // 1. Читаем все числа из файла numbers.txt
        BufferedReader reader = new BufferedReader(new FileReader("src/numbers.txt"));
        String line;
        while ((line = reader.readLine()) != null) {
            numbers.add(Integer.parseInt(line.trim()));
        }
        reader.close();

        // 2. Проверяем на совпадения с порядковым номером
        List<Integer> matches = new ArrayList<>();
        for (int i = 0; i < numbers.size(); i++) {
            int position = i + 1;
            if (numbers.get(i) == position) {
                matches.add(position);
            }
        }

        // 3. Записываем результат в output.txt
        BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt", false));

        if (matches.isEmpty()) {
            writer.write("0");
        } else {
            for (int num : matches) {
                writer.write(String.valueOf(num));
                writer.newLine();
            }
        }

        writer.close();
    }

    //Тоже самое только другая реализация, и записывает все в одну строку
    public static void writeOrder2() throws IOException {
        Scanner scanner = new Scanner(new FileInputStream("src/numbers.txt"));
        int index = 1;
        String resString = "";

        while (scanner.hasNextLine()) {
            String nowNumber = scanner.nextLine();
            if (Integer.parseInt(nowNumber) == index) {
                resString += nowNumber + " ";
            }
            index++;
        }

        if (resString.equals("")) {
            resString = "0";
        }

        // write string in file
        FileWriter writer = new FileWriter("output2.txt", false);
        writer.write(resString.trim());

        writer.flush();
    }
}
