import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class StreamApi3 {

	public static void main(String[] args) {

		//list of name
		List<String> names = List.of("John", "Sam", "Sandy", "Rajn", "Mike", "Sara", "Tome", "Tim");

		// Let's get the list of names starting with "S"
		Stream<String> nameWithS = names.stream();
		List<String> filtered = nameWithS.filter(n -> n.startsWith("S")).toList();
		System.out.println(filtered);

		// Using optional Type
		// if we don't use Optional type here, it may show RunTimeException
		// because the filtered data might not meet the condition, and we want to apply
		// the operation on that.
		Optional<String> name1 = names.stream()
				.filter(name -> name.startsWith("S")).findFirst();
		System.out.println(name1.orElse("Dummy").length());

		//Or if you still want to use String type,
		String name2 = names.stream().filter(name -> name.startsWith("Z")).findFirst().orElse("Oops!");
		System.out.println(name2.length());

		// Let's print all the names using Enhanced loop
		for (var lst : names) {
			System.out.print(lst + ", ");
		}
		System.out.println("\n");

		Consumer<String> consumer = s -> System.out.print(s + ", ");

		// Let's print all the names using forEach loop
		names.forEach(consumer);
		System.out.println("\n");


		// => OR  Let's print all the names using forEach loop
		names.forEach(n -> System.out.print(n + ", "));
	}
}
