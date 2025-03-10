package OOP.exercis6_2_3;

public class SubClass extends SuperClass {
    int num = 77;

    public void display() {
        System.out.println("Это метод display() подкласса");
    }

    public void myMethod() {
        this.display();
        super.display();
        System.out.println("Значение переменной num в подклассе: " + this.num);
        // Выводим значение переменной num суперкласса
        System.out.println("Значение переменной num в суперклассе: " + super.num);
    }

    public static void main(String args[]) {
        SubClass obj = new SubClass();
        obj.myMethod();
    }
}