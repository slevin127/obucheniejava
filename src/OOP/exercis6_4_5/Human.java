package OOP.exercis6_4_5;

public class Human extends Entity implements Fighter{

    public Human(String name) {
        super(name + " the Man");
    }

    @Override
    public void attack(Entity m){
        m.damage(1);
    }

    @Override
    public void attack(Monster monster) {

    }

}