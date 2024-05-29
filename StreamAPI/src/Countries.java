import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class Countries {

	public static void main(String[] args) {

		List<String> countries= Arrays.asList(
				"USA","UK","India","Canada","Australia","China",
				"Japan","Russia","France","Germany"
		);

		// print the names where length > 5
		countries.stream()
				.filter(coutry-> coutry.length() >5 )
				.forEach(s -> System.out.println(s));

		//Stream Assignment

		// Product class -> prodId, prodName, price, category;
		// create 10 objects ->
		// print only electronic products
		// print only products with price more than 1000

	}
}
