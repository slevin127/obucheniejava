package lesson4_2;

 class Tank {
    int x, y, dir, fuel, number;

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
        this.number = number;

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
        System.out.println("The Tank Т34-" + number + " is at " + x + ", " + y + " now.");
    }

     public int getX() {
         return x;
     }

     public void setX(int x) {
         this.x = x;
     }

     public int getY() {
         return y;
     }

     public void setY(int y) {
         this.y = y;
     }

     public int getDir() {
         return dir;
     }

     public void setDir(int dir) {
         this.dir = dir;
     }

     public int getFuel() {
         return fuel;
     }

     public void setFuel(int fuel) {
         this.fuel = fuel;
     }

     public int getNumber() {
         return number;
     }

     public void setNumber(int number) {
         this.number = number;
     }
 }
