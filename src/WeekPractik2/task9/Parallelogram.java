package WeekPractik2.task9;

import static java.lang.Math.*;

public class Parallelogram extends Quadrangle implements Figure {
    private double alpha;
    private double beta;

    public Parallelogram(int a, int b, String alpha, double beta, int color) {
        super(a, b, String.valueOf(color));
        this.alpha = Double.parseDouble(alpha);
        this.beta = beta;
    }

    @Override
    public double area() {
        double alphaRad = toRadians(alpha);
        return a * b * sin(alphaRad);
    }

    @Override
    public double perimeter() {
        return 2 * (a + b);
    }

    @Override
    public double getLargeDiagonal() {
        double alphaRad = toRadians(alpha);
        return sqrt(a * a + b * b + 2 * a * b * cos(alphaRad));
    }

    @Override
    public double getHeight() {
        double alphaRad = toRadians(alpha);
        return b * sin(alphaRad);
    }

    @Override
    public String getColor() {
        return color;
    }
}
