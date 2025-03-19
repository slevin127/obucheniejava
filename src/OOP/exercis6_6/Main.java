package OOP.exercis6_6;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Car bmw = new Car("red", "passenger", 250, 2500, new byte[]{100, 25, 110});
        bmw.setColor("green");
        bmw.print();

        Truck track = new Truck("blue", "cargo", 160, 3700);

        track.setCoordinates(new byte[]{120, 120, 10});
        track.print();
        Truck truck2 = new Truck("red", "cargo", 120, 3500 );
        truck2.setLoader(true);
        truck2.getLoader();
        truck2.print();
        track.setType();
        Car car2 = new Car("green", "cargo", 90, 1200,new byte[] {25, 70, 110});
car2.print();
    }


}
