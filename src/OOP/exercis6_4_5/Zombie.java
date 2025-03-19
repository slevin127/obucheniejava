package OOP.exercis6_4_5;

public class Zombie extends Monster {
    public Zombie(String name) {
        super(name + " the Zombie", 5);
    }

    public void growl() {
        System.out.println("Raaaauuughhhh");
    }

    @Override
    public void attack(Entity entity) {
        if (entity == this) {
            System.out.println(getName() + " не может атаковать сам себя!");
            return;
        }
        super.attack(entity);
        growl();
    }
}


