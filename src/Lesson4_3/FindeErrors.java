package Lesson4_3;
/*Найти в тексте слова с нужным содержанием, в данном примере запрашиваем текст,
формируем из него массив и ищем в нем, любок упоминание об искомом слове. В данном примере это "Error"
 */
import java.util.Scanner;  // Импортируем класс Scanner для ввода данных с клавиатуры
import java.util.regex.Matcher;
import java.util.regex.Pattern;  // Импортируем класс Pattern для работы с регулярными выражениями

public class FindeErrors {  // Объявление главного класса программы
    public static void main(String[] args) {  // Главный метод программы, точка входа
        Scanner scan = new Scanner(System.in);  // Создаем объект класса Scanner для чтения данных с клавиатуры
        System.out.print("Введите текст для проверки: ");  // Запрашиваем у пользователя ввод текста
        String text = scan.nextLine();  // Считываем всю строку, введенную пользователем
        System.out.print("Найдены ошибки: ");

        String[] str = text.split(" ");  // Разделяем введенный текст на слова по пробелам и сохраняем в массив строк
        for (String s : str) {  // Проходим по каждому слову в массиве
            Pattern pattern = Pattern.compile(".*?Error", Pattern.CASE_INSENSITIVE);  // Создаем регулярное выражение для поиска "Error" без учета регистра
            Matcher matcher = pattern.matcher(s);  // Создаем объект Matcher для проверки строки
            if (matcher.find()) {  // Проверяем, найдено ли совпадение
                System.out.println("Найдены ошибки: " + s + " ");  // Если слово содержит "Error", выводим его
            }
        }
    }
}


