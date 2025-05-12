package lesson12;

import java.util.Comparator;

public class Sorted implements Comparable<Sorted>, Comparator<Sorted> {

    private int num;
    private String text;

    public Sorted(int num, String text) {
        this.num = num;
        this.text = text;
    }

    @Override
    public String toString() {
        return "" + num;
    }

    @Override
    public int compareTo(Sorted o) {
        return text.compareTo(o.text);
    }

    @Override
    public int compare(Sorted o1, Sorted o2) {
        return o1.num - o2.num;
    }
}