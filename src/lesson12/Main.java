package lesson12;

import java.util.*;

public class Main {
//    public static void main(String[] args) {
//        char[] chars = new char[7];
//        chars[0] = 'a';
//        chars[1] = '.';
//        chars[2] = 'k';
//        chars[3] = 'm';
//        chars[4] = 'h';
//        chars[5] = 's';
//        chars[6] = 'g';
//    Arrays.sort(chars);
//    Arrays.fill(chars, 'S');
//        System.out.println(Arrays.toString(chars));
//        System.out.println(chars);
//    }
//public static void main(String[] args) {
//    ArrayDeque<String> greetings = new ArrayDeque<>();
//    greetings.push("hello");
//    greetings.push("hi");
//    greetings.push("ola");
//    greetings.pop();
//    greetings.peek();
//    while (greetings.peek() != null) {
//        System.out.print(greetings.pop());
//    }
//}
//public static void main(String[] args) {
//    Map<Integer, Integer> map = new HashMap<>(); // строка 1
//    for (int i = 1; i <= 10; i++) {
//        map.put(i, i * i); // строка 2
//    }
//    System.out.println(map.get(4)); // строка 3
//}

    public void main(String... args) {
        Sorted s1 = new Sorted(88, "a");
        Sorted s2 = new Sorted(55, "b");
        TreeSet<Sorted> t1 = new TreeSet<>();
        t1.add(s1);
        t1.add(s2);
        TreeSet<Sorted> t2 = new TreeSet<>(s1);
        t2.add(s1);
        t2.add(s2);
        System.out.println(t1 + " " + t2);
    }

}

