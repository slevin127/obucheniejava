package WeekPractik;

import java.util.Scanner;

public class Product {
    String name;
    int price;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public void Print() {
        System.out.println("Список продуктов: " + name + " " + price + "р.");
    }
}

class ProductList {
    public static void main(String[] args) {
//            int quantity = 0;
//            for (quantity = 0; quantity <=10; quantity++) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter new product:");
        String productName = scanner.nextLine();
        System.out.println("Please enter price:");
        int productPrice = Integer.parseInt(scanner.nextLine());

        Product n0001 = new Product(productName, productPrice);

        n0001.Print();
        scanner.close();
    }
}


