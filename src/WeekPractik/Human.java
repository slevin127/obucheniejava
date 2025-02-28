package WeekPractik;

public class Human {
    String name;
    int age;
    int weight;
    String address;
    String work;

    private static final String DEFAULT_NAME = "Ivanov Ivan Ivanovich";
    private static final int DEFAULT_AGE = 30;
    private static final int DEFAULT_WEIGHT = 60;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
        this.weight = 60;
    }

    public Human(String name, String address) {
        this.name = name;
        this.address = address;
        this.weight = 60;
        this.age = 30;
    }

    public Human(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public Human(String name, int age, String work) {
        this.name = name;
        this.age = age;
        this.work = work;
        this.weight = 60;

    }

    public Human(int age, int weight, String address, String work) {
        this.age = age;
        this.weight = weight;
        this.address = address;
        this.work = work;
        this.name = "Ivanov Ivan Ivanovich";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }
}
 class Main3 {
    public static void main(String[] args) {
        Human h1 = new Human("Alex", 25);
        Human h2 = new Human("Maria", "New York");
        Human h3 = new Human("John", 40, 75);
        Human h4 = new Human("Eva", 28, "Engineer");
        Human h5 = new Human(35, 80, "London", "Doctor");

        System.out.println(h1);
        System.out.println(h2);
        System.out.println(h3);
        System.out.println(h4);
        System.out.println(h5);
    }
}