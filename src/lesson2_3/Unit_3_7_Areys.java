package lesson2_3;

import java.util.Scanner;

public class Unit_3_7_Areys {
    static void main(String[] args) {
        int[] numbers = {5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15}; // Объявление массива

        for (int num : numbers) {
            System.out.println(num);
        }
    }
}

class Main {
    static void main(String[] args) {
        int[] nums = {13, 32, 39, 4, 55, 36, 7, 82, 99, 10};
        int[] copy = nums;
        // nums[1] = 50;


        for (int i = 0; i < copy.length; i++) {
            copy[i] = copy[i] * 2;
            System.out.println(copy[9]);
        }
    }
}

class Main1 {
    public static void main(String[] args) {
        String newName = "Привет мир";
        int count = newName.replace(" ", "").length();
        System.out.println("Количество символов без пробелов: " + count);
    }
}

class Main2 {
    public static void main(String[] args) {
        calculateFloors();
    }

    public static void calculateFloors() {
        final int MULTIPLIER = 2;
        final int BASE_VALUE = 8;
        final int DIFFERENCE = 12;

        int floorPetia = MULTIPLIER * BASE_VALUE; // Петя живёт на 16 этаже
        int floorIvan = floorPetia - DIFFERENCE; // Иван живёт на 4 этаже

        System.out.printf("Иван живет на %d этаже\n", floorIvan);
        System.out.printf("Петр живет на %d этаже\n", floorPetia);
    }
}

class Main3 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Привет");//1595428806
        sb.append(" мир");//1595428806
        sb.append(" !");//1595428806
        System.out.println(sb.toString());
        System.out.println(sb.hashCode());
    }
}

class Main4 {
    public static void main(String[] args) {
        String name = "Gala";
        int age = 18;
        String status = "Student";

        //String result = String.format("Poznakom'tes', eto %s, ei %d, ona %s.", status, age, name);
        System.out.printf("Познакомитесь это %s ей %d лет, зовут ее %s ", status, age, name);
    }
}



