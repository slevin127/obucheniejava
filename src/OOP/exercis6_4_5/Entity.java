package OOP.exercis6_4_5;

abstract class Entity {
    private String name;
    private int hp = 15;
    private boolean destroyed = false;

    public Entity(String name) {
        this.name = name;
        this.hp = hp;
    }
    public boolean damage(int dhp) {
        hp -= dhp;
        if (hp <= 0) {
            destroyed = true;
        }
        return destroyed;
    }

    public boolean isDestroyed() {
        return destroyed;
    }

    public String getName() {
        return name;
    }

    public abstract void attack(Entity entity);
}