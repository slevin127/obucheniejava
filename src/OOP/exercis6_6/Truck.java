package OOP.exercis6_6;

public class Truck extends Transport {

    private boolean isLoader;

    public Truck(String color, String type, float speed, int weight) {
        super(color, type, speed, weight);
    }

    public Truck(String color, String type, float speed, int weight, boolean isLoader) {
        super(color, type, speed, weight);
        this.isLoader = isLoader;
    }

    @Override
    public void setType() {
        super.setType();
        System.out.println("Грузопассажирский");
    }

//    @Override
//    public float getSpeed() {
//        return super.getSpeed();
//    }

    public void setLoader(boolean loader) {
        isLoader = loader;
    }

    public void getLoader() {
        if (isLoader == true)
            System.out.println("Грузовик загружен");
        else
            System.out.println("Грузовик пустой");
    }
}

