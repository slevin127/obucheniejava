package lesson2_3;

public class PerimeterCalculator {

    public static void main(String[] args) {

        // Объявляем переменную для стороны квадрата.
        double sadeSquare = 50;

        // Объявляем три переменные для сторон треугольника.
        double sadeTriangle_a = 60, sadeTriangle_b = 45, sadeTriangle_c = 83;

        // Объявляем переменную для радиуса круга.
        double rCircle = 13;

        // Вызываем метод для вычисления периметра треугольника и выводим результат в консоль.
        System.out.println("Perimeter triangle = " +
                perimeterTriangle(sadeTriangle_a, sadeTriangle_b, sadeTriangle_c) + " mm");

        // Вызываем метод для вычисления периметра квадрата и выводим результат в консоль.
        System.out.println("Perimeter square = " +
                perimeterSquare(sadeSquare) + " mm");
        // Вызываем метод для вычисления площади квадрата и выводим результат в консоль.
        System.out.println("Area square = " +
                areaSquare(sadeSquare) + " mm²");

        // Вызываем метод для вычисления периметра окружности и выводим результат в консоль.
        System.out.println("Perimeter circle = " +
               String.format("%.2f", perimeterCircle(rCircle)) + " mm");
        // Вызываем метод для вычисления площади окружности и выводим результат в консоль.
        System.out.println("Area circle = " +
                String.format("%.2f", areaCircle(rCircle)) + " mm²");
        System.out.println("Вычисления завершены!");
    }

    // Метод для вычисления периметра треугольника.
    // Принимает три стороны (a, b, c) и возвращает их сумму.
    public static double perimeterTriangle(double a, double b, double c) {
        return a + b + c;
    }

    // Метод для вычисления периметра квадрата.
    // Принимает длину стороны (side) и возвращает 4 * side.
    public static double perimeterSquare(double side) {
        return 4 * side;
    }
    // Метод для вычисления периметра квадрата.
    // Принимает длину стороны (side) и возвращает 4 * side.
    public static double areaSquare(double side) {
        return side * side;
    }

    // Метод для вычисления периметра окружности.
    // Принимает радиус (radius) и возвращает 2 * π * radius.
    public static double perimeterCircle(double radius) {
        return 2 * Math.PI * radius;

    }
    public static double areaCircle(double radius) {
        return Math.PI * Math.pow(radius,2);
    }
}
