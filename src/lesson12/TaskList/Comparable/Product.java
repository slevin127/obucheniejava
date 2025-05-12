package lesson12.TaskList.Comparable;

import java.time.LocalDateTime;
import java.util.Comparator;

public class Product implements Comparable<Product> {
    private final String name;
    private final String brand;
    private final long serialNumber;
    private final LocalDateTime creationDate;

    public Product(String name, String brand, long serialNumber, LocalDateTime creationDate) {
        if (name == null || brand == null || serialNumber == 0 || creationDate == null) {
            throw new IllegalArgumentException();
        }
        this.name = name;
        this.brand = brand;
        this.serialNumber = serialNumber;
        this.creationDate = creationDate;
    }

    public String getName() {
        return name;
    }

    public String getBrand() {
        return brand;
    }

    public long getSerialNumber() {
        return serialNumber;
    }

    public LocalDateTime getCreationDate() {
        return creationDate;
    }


    @Override
    public int compareTo(Product o) {
        return brand.compareTo(o.getBrand());
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", serialNumber=" + serialNumber +
                ", creationDate=" + creationDate +
                '}';
    }
}
 class NameComparator implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
class SerialNumberComparator implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        return Long.compare(o1.getSerialNumber(), o2.getSerialNumber());
    }
}