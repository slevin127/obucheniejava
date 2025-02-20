package lesson2_3;

public class UserNameCheck {
    public static void main(String[] args) {
        String userNeme01 = "Иван Иванов";
        String newName = "Вовчик  Иванов  Иванович";

        if (checkUserName(userNeme01, newName)) { // Вызываем метод проверки
            System.out.println("Имя уже занято.");
        } else {
            System.out.println("Имя доступно.");
        }
        int count = newName.replace(" ", "").length();
        System.out.println("Длинна вашего Имени: " + newName + " " + newName.length() + " символа(ов).");
        System.out.println("Количество символов без пробелов: " + count);

    }

    // Метод для проверки имени
    public static boolean checkUserName(String userNeme01, String newName) {
        return userNeme01.equalsIgnoreCase(newName); // Сравниваем без учёта регистра
    }
}
