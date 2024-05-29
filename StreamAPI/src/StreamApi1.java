import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamApi1 {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(8, 5, 7, 6, 5, 2, 9);

		//Stream<Integer> stream2 = stream1.filter(n -> n % 2 != 0);
//		System.out.println(stream2.toList());

		//System.out.println(stream1.toList());// it will show error bcz stream cannot
		//be re-used.

//		Integer stm = list.stream().filter(n -> n % 2 != 0)// will pick the odd numbers
//				.map(n -> n * 2)// will change them by doubling them
//				.reduce(0, Integer::sum);// will sum them
//		System.out.println(stm);

		// HOW FILTER WORKS ON STREAM
		//Filter returns Stream and take Predicate object,
		// Predicate is an interface so, we can not instantiate it to create object
		// we should use anonymous function which is lambda expression

		/*Predicate to apply filter for finding odd number*/
//		Predicate<Integer> predicate1 = (n) -> {
//			if (n % 2 != 0) return true;
//			else return false;
//		};

		/*Let's use functional interface as map to double the filtered values*/
//		Function<Integer, Integer> funcV = new Function<Integer, Integer>() {
//			@Override
//			public Integer apply(Integer n) {
//				return n * 2;
//			}
//		};

		//*BinaryOperator to reduce the mapped integers to sum*/
//		BinaryOperator<Integer> bio = new BinaryOperator<Integer>() {
//			@Override
//			public Integer apply(Integer n1, Integer n2) {
//				return n1 + n2;
//			}
//		};

		// OR
		Predicate<Integer> predicate1 = (n) -> n % 2 != 0;
		Function<Integer, Integer> fucMap = (n -> n * 2);
		BinaryOperator<Integer> reduce = ((a, b) -> a + b);


		Stream<Integer> stream1 = list.stream();
		Stream<Integer> stream2 = stream1.filter(predicate1);//intermediate
		Stream<Integer> ma = stream2.map(fucMap);//intermediate
		int result = ma.reduce(0, reduce);// terminal

		System.out.println("Result: " + result);
		System.out.println("List: "+list);


	}
}
