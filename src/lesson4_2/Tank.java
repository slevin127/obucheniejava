package lesson4_2;

 class Tank {
    int x, y, dir, fuel;

    public Tank() {
        this(0, 0, 100);
    }

    public Tank(int x, int y) {
        this(x, y, 100);
    }

    public Tank(int x, int y, int fuel) {
        this.x = x;
        this.y = y;
        this.fuel = fuel;
        this.dir = 0;
    }

    public void goForward(int i) {
        int distance = Math.min(i, fuel);
        if (dir == 0) x += distance;
        else if (dir == 1) y += distance;
        else if (dir == 2) x -= distance;
        else y -= distance;
        fuel -= distance;
    }

    public void goBackward(int i) {
        goForward(-i);
    }

    public void printPosition() {
        System.out.println("The Tank is at " + x + ", " + y + " now. Fuel: " + fuel);
    }
}
