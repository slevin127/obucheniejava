package lesson10.Task_1;
/*
Класс Receipt2 реализует метод countWords, который подсчитывает общее
количество слов в текстовом файле. Слова определяются как подстроки,
разделённые пробелами, и подсчёт ведётся построчно.
Считает пробелы
 */
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Receipt2 {
    public int countWords(String filename) throws FileNotFoundException {
        Scanner scanner = new Scanner(new FileInputStream(filename));
        int count = 0;

        while (scanner.hasNextLine()) {
            String[] words = scanner.nextLine().trim().split("\\s+");
            count += words.length;
        }

        return count;
    }

}