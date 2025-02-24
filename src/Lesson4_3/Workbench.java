package Lesson4_3;

public class Workbench {
    private int oil;
    private boolean isOff;
    private final String name;

    void makeDetails(int amount) {
        if (oil >= amount) {
            oil -= amount;
            System.out.println(name + ": Work is done!");
        } else if (oil < amount) {
            System.out.println(name + ": Oil is need!");
            isOff = true;
        }
    }

    void refuel(int refOil) {
        oil += refOil;
        System.out.println(name + ": Is ready to work!");
        isOff = false;
    }

    void start() {
        this.isOff = false;
    }

    public Workbench(int oil, String name) {
        this.oil = oil;
        this.name = name;
    }

    public static void main(String[] args) {
        Workbench workbench = new Workbench(100, "S001");

        workbench.start();
        workbench.makeDetails(50);
        workbench.makeDetails(100);
        workbench.refuel(50);
        workbench.makeDetails(100);
    }
}