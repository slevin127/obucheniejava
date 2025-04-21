package lesson9;

public class lesson9_2 {
    double result = 5;
    public void getResult() {
        result = Math.pow(result, 2);
        result = result + 25;
        result = result / 3;
        result = Math.round(result);
        System.out.println(result);
    }
}
class Main {

    public static void main(String[] args) {
        lesson9_2 calculator = new lesson9_2();
        calculator.getResult();
    }
}
