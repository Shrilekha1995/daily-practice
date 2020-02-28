package methodReference;

import java.util.Arrays;
import java.util.List;

public class BasicExample {

	public static void main(String[] args) {
		List<Integer> na = Arrays.asList(23, 3, 4);
		
        System.out.println("Using method reference");
		na.forEach(System.out::println);
		
		System.out.println("Using lambda expression");
		na.forEach(x -> System.out.println(x));
		
		System.out.println("Using for each loop");
		for (int n : na) {
			System.out.println(n);
		}
		
		System.out.println("using for each method unordered output");
		na.stream().parallel().forEach(System.out::println);
		
		System.out.println("using for each method ordered output");
		na.stream().parallel().forEachOrdered(System.out::println);

	}

}
