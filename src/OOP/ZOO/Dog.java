package OOP.ZOO;

public class Dog extends Animal implements Soundable {
    public void print() {
    }
    @Override
    public void sound() {
        System.out.println("GAV");
    }
    @Override
    public String toString() {
        return "I am a Dog";
    }
}
