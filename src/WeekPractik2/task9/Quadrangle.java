package WeekPractik2.task9;

public abstract class Quadrangle {
    protected int a, b;
    protected String color;


    public Quadrangle(int a, String color) {
        this.a = a;
        this.b = b;
        this.color = color;
    }

    public Quadrangle(int a, int b, String color) {
        this.a = a;
        this.b = b;
        this.color = color;
    }

    public abstract double getLargeDiagonal();

    public abstract double getHeight();

    public abstract String getColor();

}
