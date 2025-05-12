package lesson10.Task_1;
/*
Класс Receipt3 содержит статический метод getMul(), который считывает данные из текстового файла data.txt
и вычисляет произведение всех чисел от 1 до N, делящихся хотя бы на одно число из заданного списка делителей.

Этот класс может быть полезен для решения задач, связанных с фильтрацией и агрегацией чисел по заданному правилу,
особенно при работе с файлами.
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Receipt3 {
    public static long getMul() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("src/data.txt"));

        int N = Integer.parseInt(reader.readLine().trim());
        String[] parts = reader.readLine().trim().split(" ");
        reader.close();

        List<Integer> divisors = new ArrayList<>();
        for (String part : parts) {
            divisors.add(Integer.parseInt(part));
        }

        long result = 1;
        for (int i = 1; i <= N; i++) {
            for (int d : divisors) {
                if (i % d == 0) {
                    result *= i;
                    break;
                }
            }
        }

        return result;
    }
}
