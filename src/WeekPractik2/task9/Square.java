package WeekPractik2.task9;
public class Square extends Quadrangle implements Figure {

    public Square(int a, String color) {
        super(a, color);
    }

    @Override
    public double getLargeDiagonal() {
        return Math.sqrt(2) * a;
    }

    @Override
    public double getHeight() {
        return a;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public double area() {
        return a * a;
    }

    @Override
    public double perimeter() {
        return 4 * a;
    }
}