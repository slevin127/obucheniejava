package WeekPractik2.task9;

public class Main {
    public static void main(String[] args) {
        Figure square = new Square(5, "Red");
        Figure rectangle = new Rectangle(4, 6, "Blue");
        Figure rhombus = new Rhombuses(6, "Green", 60, 120);
        Figure parallelogram = new Parallelogram(5, 8, "Yellow", 45, 135);

        printFigureInfo("Square", square);
        printFigureInfo("Rectangle", rectangle);
        printFigureInfo("Rhombus", rhombus);
        printFigureInfo("Parallelogram", parallelogram);
    }

    private static void printFigureInfo(String name, Figure figure) {
        System.out.println("==== " + name + " ====");
        System.out.println("Color: " + ((Quadrangle) figure).getColor());
        System.out.println("Area: " + figure.area());
        System.out.println("Perimeter: " + figure.perimeter());
        System.out.println("Height: " + ((Quadrangle) figure).getHeight());
        System.out.println("Large Diagonal: " + ((Quadrangle) figure).getLargeDiagonal());
        System.out.println();
    }
}
