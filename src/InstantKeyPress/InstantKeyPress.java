package InstantKeyPress;

import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Random;

public class InstantKeyPress {
    private static char randomLetter;
    private static int correctCount = 0;
    private static int incorrectCount = 0;
    private static JLabel label;

    public static void main(String[] args) {
        Random random = new Random();
        JFrame frame = new JFrame("Игра на реакцию"); // Создаём окно
        label = new JLabel("Нажмите букву: "); // Текст в окне
        label.setFont(label.getFont().deriveFont(24.0f));

        frame.add(label);
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        generateRandomLetter(random);

        frame.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char userInput = e.getKeyChar();

                if (userInput == '!') {
                    System.out.println("Выход из программы...");
                    System.out.println("Статистика:");
                    System.out.println("Правильных ответов: " + correctCount);
                    System.out.println("Ошибок: " + incorrectCount);
                    System.exit(0);
                }

                if (userInput == randomLetter) {
                    correctCount++;
                    label.setText("Верно! Новая буква: ");
                } else {
                    incorrectCount++;
                    label.setText("Неверно, попробуйте снова!");
                }
                generateRandomLetter(random);
            }
        });
    }

    private static void generateRandomLetter(Random random) {
        if (random.nextBoolean()) {
            randomLetter = (char) (random.nextInt(32) + 1040);
        } else {
            randomLetter = (char) (random.nextInt(32) + 1072);
        }
        label.setText("Нажмите букву: " + randomLetter);
    }
}
