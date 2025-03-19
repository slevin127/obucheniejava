package OOP.exercis6_4_5;

public abstract class Monster extends Entity {
    private int force;

    public Monster(String name, int force) {
        super(name);
        this.force = force;
        System.out.println("Monster " + name + " was created");
    }

    protected int getForce() {
        return force;
    }

    @Override
    public void attack(Entity entity) {
        if (entity instanceof Fighter) {
            System.out.println(getName() + " атакует " + entity.getName() + " с силой " + force);
            boolean isDead = entity.damage(force);
            if (isDead) {
                System.out.println(entity.getName() + " был уничтожен!");
            } else {
                System.out.println(entity.getName() + " получил урон, но ещё жив!");
            }
        } else {
            System.out.println(getName() + " не может атаковать " + entity.getName());
        }
    }
}