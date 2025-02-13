import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Создаем объект Scanner для считывания пользовательского ввода.
        Scanner scanner = new Scanner(System.in);

        // Начальная переменная для результата.
        float result = 0;

        while (true) {
            // Запрашиваем первое число (если калькулятор сброшен).
            System.out.print("Enter the first number: ");
            result = scanner.nextFloat();  // Считываем первое число.

            // Цикл для продолжения операций.
            while (true) {
                // Запрашиваем операцию, которую пользователь хочет выполнить.
                System.out.print("Function (+, -, *, /) or 's' to quit or 'c' to reset: ");
                String action = scanner.next();  // Считываем операцию.

                if (action.equals("s")) {  // Если пользователь введет 's', программа завершится.
                    System.out.println("Exiting program.");
                    return;
                }
                if (action.equals("c")) {
                    result = 0; // Если пользователь вводит 'c', сбрасываем результат.
                    System.out.println("Result reset to 0. Starting over...");
                    break;  // Прерываем внутренний цикл и начинаем с нового ввода первого числа.
                }

                // Считываем второе число для операции.
                System.out.print("Enter the next number: ");
                float num = scanner.nextFloat();  // Считываем второе число.

                // Выполняем соответствующую операцию в зависимости от введенной функции.
                switch (action) {
                    case "+":
                        result += num;  // Выполняем сложение.
                        break;
                    case "-":
                        result -= num;  // Выполняем вычитание.
                        break;
                    case "*":
                        result *= num;  // Выполняем умножение.
                        break;
                    case "/":
                        if (num == 0) {  // Проверка на деление на ноль.
                            System.out.println("Error: Division by zero.");
                            continue;  // Если деление на ноль, продолжаем цикл.
                        } else {
                            result /= num;  // Выполняем деление.
                        }
                        break;
                    default:
                        System.out.println("Invalid operation. Please enter +, -, *, or /.");
                        continue;  // Если операция некорректная, продолжаем цикл.
                }
                // Выводим результат текущей операции с двумя знаками после запятой.
                System.out.println("Result: " + String.format("%.2f", result));
            }
        }
    }
}
