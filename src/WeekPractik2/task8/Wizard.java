package WeekPractik2.task8;

public class Wizard extends Player {
    private int manaLevel;
    private String element;

    public Wizard(int hp, int level, String type, String weapon, int manaLevel, String element) {
        super(hp, level, type, weapon);
        this.manaLevel = manaLevel;
        this.element = element;
    }

    @Override
    public String getFullInfo() {

        return hp + " " + level + " " + type + " " + weapon + " " + manaLevel + " " + element;
    }


    @Override
    public void levelUp() {
        super.level++;

    }


    @Override
    public boolean doDamage() {
        if (manaLevel >= 10) {
            manaLevel -= 10;
            return true;
        }
        return false;
    }

}