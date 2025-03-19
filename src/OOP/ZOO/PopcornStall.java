package OOP.ZOO;

public class PopcornStall implements Soundable {
    public void print(){
        System.out.println(this);
    }
public void sound(){
        System.out.println("Hey! Do you have a popcorn?");
}
    @Override
    public String toString() {
        return "It's a PopcornStall";
    }

}


