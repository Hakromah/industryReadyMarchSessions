import java.sql.SQLOutput;
import java.util.Iterator;
import java.util.List;

class Product {
	private String name;
	private double price;
	private int quantity;


	Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	Product(String name, double price) {
		this.name= name;
		this.price = price;
	}

	Product(String name, int quantity) {
		this.name = name;
		this.quantity = quantity;
	}

	Product(int quantity) {
		this.quantity = quantity;
	}

	Product(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Product{" + "name='" + name + '\'' + ", price= " +"$"+ price + ", quantity= " + quantity +" kg"+ '}';
	}

}

public class MultiConstructors {
	public static void main(String[] args) {
		Product p1 = new Product("CASSAVA", 10.0, 20);
		Product p2 = new Product("PEANUT", 5.0);
		Product p3 = new Product("PINEAPPLE", 50);
		Product p4 = new Product("ORANGE");
		Product p5 = new Product(10);

		List<Product> products = List.of(p1, p2, p3, p4, p5);
		Iterator<Product> pd = products.iterator();
		while (pd.hasNext()) {
			System.out.println(pd.next());
		}

//		for (Product product : products) {
//			System.out.println(product);
//		}
	}
}
