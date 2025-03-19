package LessonByGpt;



 class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public void makeSound() {
        System.out.println("Какой то звук... ");
    }

    public String getName() {
        return name;
    }
}
 class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }
    @Override
     public void makeSound() {
        System.out.println(getName() + " говорит: ГАВ гав");
    }
 }
class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }
    @Override
    public void makeSound() {
        System.out.println(getName() + "говорит: Мяу");
    }

}
  class Main3 {
    public static void main(String[] args) {
        Dog dog = new Dog("Shurik");
        Cat cat = new Cat("Sharik");
        dog.makeSound();
        cat.makeSound();

    }
 }