package WeekPractik2.task7;

public abstract class Transport {
    private int fuel;
    private int speed;

    public Transport(int fuel, int speed) {
        this.fuel = fuel;
        this.speed = speed;
    }
    public abstract boolean canMove(int n);
    public abstract void giveFuel(int n);

    public int getFuel() {
        return fuel;
    }

    public int getSpeed() {
        return speed;
    }
    protected void reduceFuel(int n) {
        fuel -= n;
    }

    protected void addFuel(int n) {
        fuel += n;
    }
}
