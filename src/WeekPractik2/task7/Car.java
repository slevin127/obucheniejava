package WeekPractik2.task7;

public class Car extends Transport {
    private int maxPassengers;


    public Car(int fuel, int speed, int maxPassengers) {
        super(fuel, speed);
        this.maxPassengers = maxPassengers;
    }
    @Override
    public boolean canMove(int n) {
if(getFuel() >= n){
    reduceFuel(n);
    return true;
}
return false;
    }
   @Override
    public void giveFuel(int n) {
addFuel(n);
    }
public int getMaxPassengers() {
    return maxPassengers;
    }
}
