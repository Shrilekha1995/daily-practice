package collector;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectingandThenMethod {

	public static void main(String[] args) {
		Stream<String> myStream = Stream.of("a", "b", "c", "d");
		List<String> synchronisedList = myStream
				.collect(Collectors.collectingAndThen(Collectors.toList(), Collections::synchronizedList));
		System.out.println(synchronisedList);

	}

}
