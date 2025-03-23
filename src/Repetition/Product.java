package Repetition;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import java.math.BigDecimal;
@Getter
@Setter
@Entity
public class Product {
    private String productName;
    private BigDecimal price;

    public void setPrice(BigDecimal price) {
        if (price == null) {
            throw new IllegalArgumentException("Price must be greater than 0.01");
        }
       this.price = price;
        }

    @Override
    public String toString() {
        return "Product [productName=" + productName + ", price=" + price + "]";
    }
}
 class Main1{
    public static void main(String[] args) {
        Product p = new Product();
        p.setPrice(BigDecimal.ONE);
        System.out.println(p);
    }
}
