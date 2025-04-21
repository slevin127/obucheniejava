package lesson9;
public class lesson9_3 {

    public static double abs(double num) {

        num = Math.abs(num);

        return num;
    }

    public static int max(int a, int b) {
        int max = Math.max(a, b);
        return max;
    }

    public static int min(int a, int b) {
        int min = Math.min(a, b);
        return min;
    }

    public static void main(String[] args) {

        int a = -6, b = -3;

        System.out.println(abs(a));
        System.out.println(max(a, b));
        System.out.println(min(a, b));
    }
}