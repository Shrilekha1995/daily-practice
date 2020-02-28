package forEachMethod;

import java.util.stream.Stream;

public class Example2 {

	public static void main(String[] args) {

		Stream<String> str = Stream.of("A", "B", "C");
		str.forEach(x -> System.out.println(x));

		// str.parallel().forEachOrdered(p->System.out.println(p));

	}

}
