package WeekPractik2.interface1;

public class Cat implements Edible, Eat, Movable {

    @Override
    public void eat() {
        System.out.println("Cat eat");
    }

    @Override
    public void beEaten() {
        System.out.println("Cat beEaten");
    }
    @Override
    public void move() {
        System.out.println("Cat move");

    }
}
