package lesson10.Task_1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Receipt6 {
    public static void solution(double n) throws IOException {
        String fileName = "src/EGE.txt";

        // Создаётся BufferedReader для построчного чтения файла.
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        String line = reader.readLine(); // Пропускаем заголовок

        // Цикл while, который читает оставшиеся строки файла до тех пор,
        // пока не дойдёт до конца (null).
        while ((line = reader.readLine()) != null) {

            // Делим строку по символу ; и сохраняем элементы в массив parts.
            String[] parts = line.split(";");

            // Проверяем соответствует ли строка шаблону, в данном случае строка должна
            // содержать не сеннее 4 полей, если меньше то пропускаем
            if (parts.length < 4) continue;

            //Извлекаем название предмета (первый элемент строки).
            String subject = parts[0];
            //Преобразуем значение из колонки "Passed in %" (третье поле) в double
            double passedPercent = Double.parseDouble(parts[2]);

            // проверяем условие, значение из второй колонки Passed in % >= заданному в Main
            if (passedPercent >= n) {
                System.out.println(subject);
            }
        }

        // Закрываем BufferedReader, завершая работу с файлом.
        reader.close();
    }
}
