package lesson13;

public class JoinExample {
    private static int counter = 0;

    public static void main(String[] args)
            throws InterruptedException {
        Thread thread = new Thread() {
            public void run() {
                for (int i = 0; i < 50000000; i++) {
                    JoinExample.counter++;
                }
            }
        };
        thread.start();
        thread.join();
        System.out.println("Counter value: " + counter); // Counter value: 0
    }
}
