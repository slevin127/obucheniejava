package Lesson4_3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

    public class TextCleaner {
        public static void main(String[] args) {
            // Инициализация строки с текстом, содержащим теги <strike>
            String text = "<strike>Это удалить!</strike>А это хороший текст, его трогать не надо.<strike> и это не нужно!</strike>";

            // Компилируем регулярное выражение для поиска подстрок, заключенных в теги <strike>...</strike>
            Pattern pattern = Pattern.compile("<strike>.*?</strike>");

            // Создаем Matcher для поиска совпадений в исходном тексте
            Matcher matcher = pattern.matcher(text);

            // Проходим по всем найденным совпадениям в тексте
            while (matcher.find()) {
                // Получаем начальный индекс текущего совпадения
                int start = matcher.start();
                // Получаем конечный индекс текущего совпадения (индекс символа после совпадения)
                int end = matcher.end();
                // Выводим информацию о найденном совпадении: само совпадение и его диапазон в тексте
                System.out.println("Found match\n" + text.substring(start, end) + "\nfrom " + start + " to " + (end - 1));
            }

            // Выводим сообщение о начале очистки текста
            System.out.println("Clean the text");
            // Заменяем все найденные совпадения на пустую строку и выводим очищенный текст
            System.out.println(matcher.replaceAll(""));
        }
    }
