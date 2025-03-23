package Repetition;
import java.util.*;


public class Main4 {
    public static void main(String[] args) {
        List<String> word = Arrays.asList("яблоко", "ананас", "киви", "груша", "Трансформатор", "хуй");

Comparator<String> lengthComparator = new Comparator<String>() {
    @Override
    public int compare(String s1, String s2) {
        return Integer.compare(s1.length(), s2.length());
    }
};
    Collections.sort(word, lengthComparator);
    System.out.println(word);
}
}
 class Main5{
    public static void main(String[] args) {
        Thread counterThread = new Thread(new Runnable() {
           @Override
            public void run() {
               for (int i = 0; i <= 10; i++) {
                   System.out.println("Счет: " + i);
                  try {
                      Thread.sleep(1000);
                  } catch (InterruptedException e) {
                      System.out.println("Potok is interrupted");
                  }

               }
            //    System.out.println("Поток запущен");
            }
        });
        counterThread.start();
    }
}