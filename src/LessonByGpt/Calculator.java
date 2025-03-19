package LessonByGpt;
//Статический полиморфизм (перегрузка методов)
public class Calculator {
    // Сложение двух чисел
    public int add(int a, int b) {
        return a + b;
    }

    // Сложение трёх чисел (перегрузка)
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Сложение двух чисел с плавающей точкой (перегрузка)
    public double add(double a, double b, double c) {
        return a + b + c;
    }
    // Сложение двух чисел с плавающей точкой (перегрузка)
    public String add(char a, char b, char c) {
        return "" + a + b + c;
    }
}
class Main4 {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.add(10, 20));
        System.out.println(calc.add(4, 8));
        System.out.println(calc.add(11.2, 25.6, 3.12));
        System.out.println(calc.add('F', 'U', 'K'));
    }
}

