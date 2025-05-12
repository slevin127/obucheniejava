package lesson12.TaskList;

import java.util.*;

public class Main {
    private static final String TOYOTA = "Toyota";
    private static final String BMW = "BMW";
    private static final String Nissan = "Nissan";

    public static void main(String[] args) {
        Car car1 = new Car(TOYOTA, "Camri", false);
        Car car2 = new Car(BMW, "X5", true);
        Car car3 = new Car(Nissan, "Altima", false);
        Car car4 = new Car(Nissan, "Almea", false);
        Car car5 = new Car(BMW, "X7", true);
        Car car6 = new Car(TOYOTA, "LC250", true);
        Car car7 = new Car(TOYOTA, "LC200", false);
        Car car8 = new Car(TOYOTA, "LC300", false);
        Car car9 = new Car(TOYOTA, "Prius", true);
        Car car10 = new Car(BMW, "X3", false);
        Car car11 = new Car(TOYOTA, "Camri", false);
        Car car12 = new Car(BMW, "X5", true);
        Car car13 = new Car(Nissan, "Altima", false);
        Car car14 = new Car(Nissan, "Almea", false);
        Car car15 = new Car(BMW, "X7", true);
        Car car16 = new Car(TOYOTA, "LC250", true);
        Car car17 = new Car(TOYOTA, "LC200", false);
        Car car18 = new Car(TOYOTA, "LC300", false);
        Car car19 = new Car(TOYOTA, "Prius", true);
        Car car20 = new Car(BMW, "X3", false);
        Car car21 = new Car(BMW, "X5", true);
        Car car22 = new Car(Nissan, "Altima", false);
        Car car23 = new Car(Nissan, "Altima", false);
        Car car24 = new Car(Nissan, "Almea", false);
        Car car25 = new Car(BMW, "X7", true);
        Car car26 = new Car(TOYOTA, "LC250", true);
        Car car27 = new Car(TOYOTA, "LC200", false);
        Car car28 = new Car(TOYOTA, "LC300", false);
        Car car29 = new Car(TOYOTA, "Prius", true);
        Car car30 = new Car(BMW, "X3", false);
        List<Car> carList = new ArrayList<>();
        carList.add(car1);
        carList.add(car2);
        carList.add(car3);
        carList.add(car4);
        carList.add(car5);
        carList.add(car6);
        carList.add(car7);
        carList.add(car8);
        carList.add(car9);
        carList.add(car10);
        carList.add(car11);
        carList.add(car12);
        carList.add(car13);
        carList.add(car14);
        carList.add(car15);
        carList.add(car16);
        carList.add(car17);
        carList.add(car18);
        carList.add(car19);
        carList.add(car20);
        carList.add(car21);
        carList.add(car22);
        carList.add(car23);
        carList.add(car24);
        carList.add(car25);
        carList.add(car26);
        carList.add(car27);
        carList.add(car28);
        carList.add(car29);
        carList.add(car30);

 Set<Car> carSet = new TreeSet<>(new CarComparator().reversed());
    carSet.addAll(carList);
        for (Car car : carSet) {
            System.out.println(car.getName());
        }
    }

}
