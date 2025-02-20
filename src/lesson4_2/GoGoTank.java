package lesson4_2;

class Main {
    public static void main(String[] args) {

        Tank justTank = new Tank();
        Tank anywareTank = new Tank(10, 10);
        Tank customTank = new Tank(20, 30, 200);
        //Tank tank = new Tank();
        //tank.x = 1000;
        //tank.y = 2000;
        //tank.printPosition();
        justTank.goForward(200);
        justTank.number = 1;
        justTank.printPosition();

        anywareTank.goBackward(-200);
        anywareTank.number = 2;
        anywareTank.printPosition();

        customTank.goForward(201);
        customTank.number = 3;
        customTank.printPosition();
    }
}
