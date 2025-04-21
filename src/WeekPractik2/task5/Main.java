package WeekPractik2.task5;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        StartDo cat = new Cat();
        StartDo Guitar = new Guitar();
        StartDo Transport = new Transport();
        Date date = new Date();
        System.out.println(date);
        cat.start();
        Guitar.start();
        Transport.start();
    }
}
