package OOP.exercis6_2_2;

public class Main {

    public static void main(String[] args) {
        class Cat extends Animal {
        public void sound () {
            System.out.println("Meow");
        }
    }
        Cat cat = new Cat();
        cat.sound();
cat.walk();
    }
}



