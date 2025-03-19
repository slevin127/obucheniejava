package OOP.exercis6_4_5;
public class Main {
public static void main(String[] args) {
/*

You have to overload class Zombie

*/


    Battle battle = new Battle();
    battle.add(new Zombie("Alice"));
    battle.add(new Human("Vasiliy"));
    battle.add(new GiantSnake("Kaa"));
    battle.add(new Tower("Big Ben"));

    battle.start();


/*

                       ...and The Battle starts!

*/
}

}
