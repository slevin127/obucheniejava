package OOP.exercis6_6;

public class Car extends Transport {


    public Car(String color, String type, float speed, int weight, byte[] coordinates) {
        super(color, type, speed, weight, coordinates);
        this.setSpeed(230);
    }


}