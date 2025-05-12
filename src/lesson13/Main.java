package lesson13;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StockAccount stockAccount = new StockAccount("ferst",0);
        stockAccount.start();
        long profit = 0;
        Scanner in = new Scanner(System.in);
        String command = "";
while (!command.equals("exit")) {
    command = in.next();
    switch (command) {
        case "check":
            System.out.println(stockAccount.money);
            break;
        case "fix":
            profit += (long) stockAccount.money - 1000;
            System.out.println("Profit: " + profit);
            stockAccount.money = 1000;
    }
}
    }
}
