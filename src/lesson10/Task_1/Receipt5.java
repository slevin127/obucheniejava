package lesson10.Task_1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Receipt5 {
    public static boolean arePalindromes() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("src/strings.txt"));
        String line;

        while ((line = reader.readLine()) != null) {
            String cleaned = line.replaceAll(" ", "").toLowerCase();

            if (!isPalindrome(cleaned)) {
                reader.close();
                return false;
            }
        }

        reader.close();
        return true;

    }

    private static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}
