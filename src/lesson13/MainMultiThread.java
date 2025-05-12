package lesson13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainMultiThread {

    public static void main(String[] args) throws InterruptedException {
        long start = System.currentTimeMillis();


        Thread maxThread = new Thread(() -> {
            List<Integer> numbers = new ArrayList<>();
            for (int i = 0; i <= 10_000_000; i++) {
                numbers.add(i);
            }
            int max = Collections.max(numbers);
            System.out.println("max found: " + max);
        });


        Thread sortThread = new Thread(() -> {
            List<Integer> unsorted = new ArrayList<>();
            for (int i = 10_000_000; i >= 1; i--) {
                unsorted.add(i);
            }
            Collections.sort(unsorted);
            System.out.println("List is sorted now");
        });

        Thread clerThread = new Thread(() -> {

            List<Integer> list = new ArrayList<>();
            for (int i = 1; i <= 10_000_000; i++) {
                list.add(i);
            }
            while (!list.isEmpty()) {
                list.remove(list.size() - 1);
            }
            System.out.println("List cleared");
        });
        maxThread.start();
        sortThread.start();
        clerThread.start();

        maxThread.join();
        sortThread.join();
        clerThread.join();
        long end = System.currentTimeMillis();
        System.out.println("Time taken: " + (end - start) + "ms");
    }
}