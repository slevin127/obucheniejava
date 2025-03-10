package OOP.exercis6_2_2;

public class Animal {

    private boolean vegetarian;
    private String eats;

    public Animal(){
        System.out.println("Creature was created as Animal!");
    }

    public Animal(boolean veg, String food){
        this.vegetarian = veg;
        this.eats = food;

    }

    public void sound(){
    }
    public void walk(){

    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public String getEats() {
        return eats;
    }
}

