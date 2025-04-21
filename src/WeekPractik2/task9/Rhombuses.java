package WeekPractik2.task9;

import static java.lang.Math.*;

public class Rhombuses extends Quadrangle implements Figure {
    private double alpha;
    private double beta;

    public Rhombuses(int a, String alpha, double beta, int color) {
        super(a, String.valueOf(color));
        this.alpha = Double.parseDouble(alpha);
        this.beta = beta;
    }

    @Override
    public double area() {
        double alphaRad = toRadians(alpha);
        return a * a * sin(alphaRad);
    }

    @Override
    public double perimeter() {
        return 4 * a;
    }

    @Override
    public double getLargeDiagonal() {
        double alphaRad = toRadians(alpha);
        return 2 * a * cos(alphaRad / 2);
    }

    @Override
    public double getHeight() {
        double alphaRad = toRadians(alpha);
        return a * sin(alphaRad);
    }

    @Override
    public String getColor() {
        return color;
    }
}
