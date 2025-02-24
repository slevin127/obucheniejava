package Lesson4_3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GoldNumber {
    public static void main(String[] args) {


        StringBuilder strBuilder = new StringBuilder();  // Создание объекта StringBuilder для накопления строк
        Pattern pattern = Pattern.compile("^(\\d{3})(\\d{4})$");  // Определение регулярного выражения для разбивки строки на две части (три цифры и четыре цифры)

        // Цикл от 1000000 до 9999999 (все возможные 7-значные числа)
        for (int aCount = 1000000; aCount <= 9999999; aCount++) {
            Matcher matcher = pattern.matcher(Integer.toString(aCount));  // Преобразование числа в строку и создание объекта Matcher для поиска по регулярному выражению
            if (matcher.find()) {  // Если найдено совпадение с регулярным выражением
                // Формирование строки в формате +7 (926) XXX-XXXX и добавление её в StringBuilder
                strBuilder.append("+7 (926) ").append(matcher.group(1))  // Добавление первых трех цифр
                        .append("-").append(matcher.group(2))  // Добавление последних четырех цифр
                        .append("; ");  // Добавление разделителя
            }
        }

        // Обновление паттерна для поиска номеров с двумя первыми цифрами 7 и четырьмя цифрами 7
        pattern = Pattern.compile("(\\d[7]{2})-([7]{4})");
        Matcher matcher2 = pattern.matcher(strBuilder);  // Применение второго регулярного выражения для поиска совпадений в строках из StringBuilder
        while (matcher2.find()) {  // Цикл для поиска всех совпадений
            // Печать отфильтрованных номеров в нужном формате
            System.out.println("+7 (926) " + matcher2.group(1) + "-" + matcher2.group(2) + "; ");
        }
    }
}
