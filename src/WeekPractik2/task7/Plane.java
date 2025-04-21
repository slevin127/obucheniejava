package WeekPractik2.task7;

public class Plane extends Transport {

    public Plane(int fuel, int speed) {
        super(fuel, speed);
    }

    @Override
    public boolean canMove(int n) {
        if (getFuel() >= n) {
            reduceFuel(n);
            return true;
        }
        return false;

    }

    @Override
    public void giveFuel(int n) {
        addFuel(n);
    }
    public void fillFuel(int n) {
        addFuel(n);
    }

    public int getFuelLevel() {
        return getFuel();


    }
}
