package lesson10.Task_1;

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {

        String result0 = Receipt0.getReceipt();
        System.out.println(result0);

        Receipt1 receipt1 = new Receipt1();
        String result1 = receipt1.getReceipt();
        System.out.println(result1);

        Receipt2 counter = new Receipt2();
        int result = counter.countWords("test.txt");
        System.out.println("Количество слов: " + result);


        System.out.println(Receipt3.getMul());
    }


}