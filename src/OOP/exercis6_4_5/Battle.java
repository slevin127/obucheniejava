package OOP.exercis6_4_5;

import java.util.Random;

class Battle{

    final static private int MAX = 5;

    private Entity[] entities;
    private int n = 0;

    Battle(){
        entities = new Entity[MAX];
    }

    public void add(Entity entity){
        if (n < MAX) {
            entities[n++] = entity;
        }
        else{
            System.out.println("No more members!");
        }
    }


    public void start() {
    }
}