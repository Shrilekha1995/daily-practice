package streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*

Java provides a new additional package in Java 8 called java.util.stream.

Stream provides following features:

Stream does not store elements
. It simply conveys elements from a source such as a data structure, an array, or an I/O channel, through a pipeline 
of computational operations.
Stream is functional in nature. Operations performed on a stream does not modify it's source. 
For example, filtering a Stream obtained from a collection produces a new Stream without the filtered elements, 
rather than removing elements from the source collection.
Stream is lazy and evaluates code only when required.
The elements of a stream are only visited once during the life of a stream. Like an Iterator, 
a new stream must be generated to revisit the same elements of the source.
You can use stream to filter, collect, print, and convert from one data structure to other etc.
 */

public class streamAPIExample {

	public static void main(String[] args) {

		Stream.iterate(1, x -> x + 1).filter(x -> x % 5 == 0).limit(5).forEach(System.out::println);

		List<Integer> intList = Arrays.asList(1, 4, 5, 6, 7, 8, 9);
		System.out.println("sorted elements are as follow");
		List<Integer> sortedList = intList.stream().sorted().collect(Collectors.toList());
		System.out.println(sortedList);
	}

}
