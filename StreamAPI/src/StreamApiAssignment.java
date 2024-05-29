import java.util.ArrayList;
import java.util.List;

enum Category {ELECTRONIC, DRESS, RESIDENCE}

class Product {
    private int prodId;
    private String prodName;
    private double price;
    private Category category;

    public Product(int prodId, String prodName, double price, Category category) {
        this.prodId = prodId;
        this.prodName = prodName;
        this.price = price;
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public Category getCategory() {
        return category;
    }

    @Override
    public String toString() {
        return "Product{" +
                "prodId=" + prodId +
                ", prodName='" + prodName + '\'' +
                ", price=" + price +
                ", category='" + category + '\'' +
                '}';
    }
}

public class StreamApiAssignment {
    public static void main(String[] args) {

        // Let's create 10 objects from Product class
        List<Product> products = new ArrayList<>();

        products.add(new Product(1, "Iphone", 1500, Category.ELECTRONIC));
        products.add(new Product(2, "Car", 15000, Category.ELECTRONIC));
        products.add(new Product(3, "Apartment", 1500, Category.RESIDENCE));
        products.add(new Product(4, "Television", 400, Category.ELECTRONIC));
        products.add(new Product(5, "Earphone", 50, Category.ELECTRONIC));
        products.add(new Product(6, "Jeans", 20, Category.DRESS));
        products.add(new Product(7, "Table", 70, Category.RESIDENCE));
        products.add(new Product(8, "Computer", 1500, Category.ELECTRONIC));
        products.add(new Product(9, "Bed", 300, Category.RESIDENCE));
        products.add(new Product(10, "T-Shirt", 1500, Category.DRESS));

        System.out.println(" \n" + "1 ==> Print only Electronic products:" + " \n");
        products.stream()
                .filter(product -> product.getCategory() == Category.ELECTRONIC)
                .forEach(elc -> System.out.println(elc));
        System.out.println("*".repeat(75) + " \n");

        System.out.println("2 ==> Print only products with price more than 1000:" + " \n");
        products.stream()
                .filter(pf -> pf.getPrice() > 1000)
                .forEach(pp -> System.out.println(pp));

    }
}
