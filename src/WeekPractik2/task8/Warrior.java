package WeekPractik2.task8;

public class Warrior extends Player{
    private String armor;

    public Warrior(int hp, int level, String type, String weapon, String armor) {
        super(hp, level, type, weapon);
        this.armor = armor;
    }

    @Override
    public String getFullInfo() {
        return hp + " " + level + " " + type + " " + weapon + " " + armor;
    }

    @Override
    public void levelUp() {
        super.level++;
          }

    @Override
    public boolean doDamage() {
        return true;
    }
}
