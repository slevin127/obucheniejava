package WeekPractik;

public class Car {
    String brand;
    String model;
    int year;

    public Car(String brand) {
        this.brand = brand;
        this.model = "Неизвестно";
        this.year = 2000;
    }

    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public void listCar() {

        System.out.println("Марка " + brand + ", модель " + model + ", год " + year);
    }
}

class ListCar {
    public static void main(String[] args) {

        Car car1 = new Car("Toyota");
        Car car2 = new Car("Toyota", "Prius", 1995);
        Car car3 = new Car("WG", "Tiguan", 1990);
        Car car4 = new Car("UAZ");
        System.out.println("Список машин");

        car1.listCar();
        car2.listCar();
        car3.listCar();
        car4.listCar();

    }
}
