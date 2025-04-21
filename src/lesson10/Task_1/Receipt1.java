

package lesson10.Task_1;
/*
Класс Receipt1 реализует метод getReceipt, который читает строки из файла
receipt.txt, содержащие записи о товарах в формате название;количество;цена, и
возвращает общую сумму по чеку (то есть: кол-во × цена для каждой строки),
отформатированную до двух знаков после запятой.
 */
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Locale;
import java.util.Scanner;

public class Receipt1 {
    public String getReceipt() throws FileNotFoundException {
        Scanner scanner = new Scanner(new FileInputStream("src/receipt.txt"));
        double result = 0;

        while (scanner.hasNextLine()) {
            String[] productInfo = scanner.nextLine().split(";");
            result += Integer.parseInt(productInfo[1]) * Double.parseDouble(productInfo[2]);
        }

        return String.format(Locale.US, "%.2f", result);
    }
}
