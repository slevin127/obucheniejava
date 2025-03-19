package OOP.exercis6_4_5;

import java.util.Random;

public interface Fighter {
    void attack(Entity entity);

    default void run(Entity[] entities) {
        Random random = new Random();
        int destroyed = 0;

        while (destroyed != entities.length - 1) {
            Entity fighter = entities[random.nextInt(entities.length)];
            Entity victim = entities[random.nextInt(entities.length)];
            while (fighter == null || victim == null || !(fighter instanceof Fighter) || fighter == victim) {
                victim = entities[random.nextInt(entities.length)];
                fighter = entities[random.nextInt(entities.length)];
            }
            ((Fighter) fighter).attack(victim);
            if (victim.isDestroyed()) {
                destroyed++;
            }
        }

        System.out.println("The Great Battle is finished");

    }

    default void start(Entity[] entities) {
        run(entities);
    }

    void attack(Monster monster);
}
