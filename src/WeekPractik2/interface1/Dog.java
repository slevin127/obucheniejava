package WeekPractik2.interface1;

public class Dog implements Eat, Movable {

    @Override
    public void move() {
        System.out.println("Dog move");
    }

    @Override
    public void eat() {
        System.out.println("Dog eat");

    }
}
