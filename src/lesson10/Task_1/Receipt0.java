package lesson10.Task_1;
/*
 * Класс Receipt0 реализует метод getReceipt, который считывает текст из файла
 * receipt.txt, находит все числа с плавающей точкой (включая отрицательные), и
 * возвращает сумму этих чисел, отформатированную до двух знаков после запятой.
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Receipt0 {
    public static String getReceipt() throws IOException {
        try
                (BufferedReader reader = new BufferedReader(new FileReader("src/receipt.txt"))) {

            String line;
            Pattern pattern = Pattern.compile("-?\\d+\\.\\d+");
            double total = 0;
            while ((line = reader.readLine()) != null) {
                Matcher matcher = pattern.matcher(line);
                while (matcher.find()) {
                    double d = Double.parseDouble(matcher.group());
                    total += d;
                }
            }

            reader.close();
            return String.format("%.2f", total);


        }

    }
}
