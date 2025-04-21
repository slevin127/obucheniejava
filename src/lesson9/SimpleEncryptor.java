package lesson9;
public class SimpleEncryptor {

    private static final String originalChars =
            "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZабвгдеёжзийклмнопрстуфхцчшщъыьэюя" +
                    "АБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ0123456789 .,!?-:;";

    private static final String encryptedChars =
            "QWERTYUIOPASDFGHJKLZXCVBNMlkjhgfdsamnbvcxzpoiuytrewqйцукенгшщзхъфывапролдячсмитьбюэё" +
                    "ЙЦУКЕНГШЩЗХЪФЫВАПРОЛДЯЧСМИТывЬБЮЭЁ9876543210 !?:;.-,";

    // Метод шифрования с использованием replace()
    public static String encrypt(String input) {
        String result = input;
        for (int i = 0; i < originalChars.length(); i++) {
            result = result.replace(originalChars.charAt(i), encryptedChars.charAt(i));
        }
        return result;
    }

    // Метод дешифрования с использованием replace()
    public static String decrypt(String input) {
        String result = input;
        for (int i = 0; i < encryptedChars.length(); i++) {
            result = result.replace(encryptedChars.charAt(i), originalChars.charAt(i));
        }
        return result;
    }

    public static void main(String[] args) {
        String message = "Привет, как дела?";
        String time = java.time.LocalDateTime.now()
                .format(java.time.format.DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));

        String encryptedMessage = encrypt(message);
        String encryptedTime = encrypt(time);

        String decryptedMessage = decrypt(encryptedMessage);
        String decryptedTime = decrypt(encryptedTime);

        System.out.println("Оригинал: " + message);
        System.out.println("Время: " + time);
        System.out.println("Зашифровано: " + encryptedMessage);
        System.out.println("Время зашифровано: " + encryptedTime);
        System.out.println("Расшифровано: " + decryptedMessage);
        System.out.println("Время расшифровано: " + decryptedTime);
    }
}
