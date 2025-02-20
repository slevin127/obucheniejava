package lesson4_2;

public class Rect {
    private int s; int w, h;
    Rect(int w, int h) {
        this.w = w;
        this.h = h;
        s = w * h;
    }

    public int getS() {
        return s;
    }

    public int getW() {
        return w;
    }

    public int getH() {
        return h;
    }
}
