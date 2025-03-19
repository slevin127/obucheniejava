package OOP.ZOO;

public class Reptile extends Animal {
    public void print() {
        System.out.println(this);
    }
//    @Override
//    public void sound() {
//        System.out.println("");
//    }
    @Override
    public String toString() {
        return "I am a Reptile";
    }
}
