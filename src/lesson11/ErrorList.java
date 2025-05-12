package lesson11;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;
import java.io.IOException;

public class ErrorList {
    public static void errorList0() throws IOException {
        List<String> lines = Files.readAllLines(Paths.get("src/borodino.txt"));
        Scanner in = new Scanner(System.in);
        int n = -1;

        // Повторять, пока пользователь не введёт корректный номер
        while (true) {
            System.out.println("Enter the number in range 1.." + lines.size());

            // Проверка, что это целое число
            if (!in.hasNextInt()) {
                System.out.println("Это не число. Попробуйте снова!");
                in.next(); // пропускаем некорректный ввод
                continue;
            }

            n = in.nextInt();

            // Проверка диапазона
            if (n < 1 || n > lines.size()) {
                System.out.println("Вы ввели номер вне допустимого диапазона. Попробуйте снова!");
            } else {
                break; // всё хорошо — выходим из цикла
            }
        }

        // Показываем строку (внутренне индексы с 0)
        System.out.println("Вот предсказание для вас:\n" + "\"" + lines.get(n - 1) + "\"");
    }

    // ❗ ArrayIndexOutOfBoundsException
    // Происходит при попытке обратиться к индексу, превышающему длину массива
    public static void error1() {
        int[] array = {1, 2 - 1, 5, 3};
        int sum = 0, i;
        for (i = 0; i <= array.length; i++) { // Ошибка: i <= array.length — должен быть i < array.length
            sum += array[i]; // 💥 выход за границы массива
        }
        System.out.println(sum);
    }

    // ❗ ArithmeticException
    // Происходит при делении на ноль
    public static void error2() {
        int a = 1, b = 2, c = 0;
        System.out.println(a * b / c); // 💥 Деление на ноль
    }

    // ❗ ArrayStoreException
    // Происходит при попытке вставить в массив объект несовместимого типа
    public static void error3() {
        Object[] array = new String[4]; // Массив на самом деле String[], но по типу — Object[]
        array[0] = "First";
        array[1] = "Second";
        array[2] = "Third";
        array[3] = 4; // 💥 Integer нельзя вставить в String[] → ArrayStoreException
    }

    // ❗ ClassCastException
    // Происходит при некорректном приведении типов
    public static void error4() {
        Object q = "This is a sting";
        Integer w = (Integer) q; // 💥 Нельзя привести String к Integer
        System.out.println(w);
    }

    // ❗ NegativeArraySizeException
    // Происходит при попытке создать массив с отрицательной длиной
    public static void error5() {
        int size = -5;
        int[] array = new int[size]; // 💥 Отрицательная длина массива
    }

    // ❗ NullPointerException
    // Происходит при попытке вызвать метод у объекта со значением null
    public static void error6() {
        String str = null;
        int sum = str.length(); // 💥 str == null → попытка вызвать length() → NullPointerException
    }

    // ❗ NumberFormatException
    // Происходит при попытке преобразовать строку в число, если строка содержит нечисловой текст
    public static void error7() {
        String str = "asd123";
        int sum = Integer.parseInt(str); // 💥 Строка содержит буквы → ошибка преобразования
    }

    // ❗ StringIndexOutOfBoundsException
    // Происходит при попытке обратиться к символу строки за пределами её длины
    public static void error8() {
        String text = "Java";
        char ch = text.charAt(10); // 💥 Строка длиной 4 → индекс 10 недопустим
        System.out.println(ch);
    }
}