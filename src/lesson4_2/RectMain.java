package lesson4_2;

public class RectMain {
    public static void main(String[] args) {
        Rect rect = new Rect(4, 6);
        rect.w = 6;
        System.out.println(rect.getW() * rect.getH() == rect.getS());

    }
}
