package WeekPractik;

import java.util.Scanner;

public class ExercisesCycles {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int num = scanner.nextInt();
        for (int i = 1; i <= num; i++) {
            System.out.print(+i);
        }
    }
}
