package OOP.exercis6_4_5;
public class Main {
public static void main(String[] args) {

//    Battle battle = new Battle();
//    battle.add(new Zombie("Alice"));
//    battle.add(new Human("Vasiliy"));
//    battle.add(new GiantSnake("Kaa"));
//    battle.add(new Tower("Big Ben"));
    Player player = new Player("Tourist");
    Player.Backpack pb = player.backpack;
    System.out.println(pb);
    player.take("rope");
    System.out.println(pb);
    player.take("bottle");
    player.take("flower");
    System.out.println(pb);
//    battle.start();


}

}
