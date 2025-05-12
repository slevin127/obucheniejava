package lesson12.TaskList.Comparable;

import java.time.LocalDateTime;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Set<Product> products = new TreeSet<>();
        products.add(new Product("Колбаса", "Мясово",
                31351513L,
                LocalDateTime.now()));
        products.add(new Product("Сыр", "Мясово",
                31221513L,
                LocalDateTime.now()));
        products.add(new Product("Сыр", "Milk Day",
                31221003L,
                LocalDateTime.now()));
        for (Product product : products){
            System.out.println(product.getBrand());
                    }

        Set<Product> products2 = new TreeSet<>(new NameComparator());
        products2.add(new Product("СуперБренд", "Колбаса", 1L, LocalDateTime.now()));
        products2.add(new Product("ЛучшийБренд", "Сыр", 2L, LocalDateTime.now()));

        for (Product product : products2) {
            System.out.println(product.getBrand());
        }

        Set<Product> products3 = new TreeSet<>(new SerialNumberComparator().reversed());
        products3.add(new Product("СуперБренд", "Колбаса", 1L, LocalDateTime.now()));
        products3.add(new Product("ЛучшийБренд", "Сыр", 2L, LocalDateTime.now()));

        for (Product product : products3) {
            System.out.println(product.getSerialNumber());
        }

    }
}
