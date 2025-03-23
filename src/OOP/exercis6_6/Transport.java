package OOP.exercis6_6;

import java.util.Arrays;

public abstract class Transport {
    //String name;
    private String color;
    private String type;
    private float speed;
    private int weight;
    private byte[] coordinates;
public Transport() {}
    public Transport(String color, String type, float speed, int weight, byte[] coordinates) {
        this.color = color;
        this.type = type;
        this.speed = speed;
        this.weight = weight;
        this.coordinates = coordinates;
        System.out.println("New object");

    }

    public Transport(String color, String type, float speed, int weight) {
        this.color = color;
        this.type = type;
        this.speed = speed;
        this.weight = weight;
        System.out.println("New object");
    }

    public void print() {
        System.out.println("Характеристики т/с: " + type + " " + color + " "
                + speed + " " + weight + " " + Arrays.toString(coordinates));
    }

public abstract void moveObject(float speed);


    public void setColor(String color) {
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public void setType() {
        this.type = type;
        System.out.println("Грузовой");
    }

    public float getSpeed() {
        return speed;
    }

    public void setSpeed(float speed) {
        this.speed = speed;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public byte[] getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(byte[] coordinates) {
        this.coordinates = coordinates;

    }


}

