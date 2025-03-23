package OOP.exercis6_4_5;

import java.util.ArrayList;
import java.util.List;

public class Player extends Human {

    public Backpack backpack;

    public Player(String name) {
        super(name);
        this.backpack = new Backpack();
    }

    public void take(String item) {
        backpack.addItem(item);
    }

    class Backpack {
        private List<String> items = new ArrayList<>();

        public void addItem(String item) {
            items.add(item);
        }


        @Override
        public String toString() {
            if (items.isEmpty()) {
                return "the backpack is empty";
            }
            return String.join(",", items) + " in the backpack";
        }

    }
}

