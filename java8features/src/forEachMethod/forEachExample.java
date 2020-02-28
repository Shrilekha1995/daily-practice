package forEachMethod;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/*
 * java 8 introuces forEach method in iterable and stream interfaces.
 * this methos is default method in iterable interface
 * this method takes functional interface as argument. so we need to provide lambda expression as its 
 * parameter
 */
public class forEachExample {

	public static void main(String[] args) {

	/*	List<String> l1 = new ArrayList<>();
		l1.add("shri");
		l1.add("neha");
		l1.add("divya");
		l1.add("shreya");
		l1.forEach(x -> System.out.println(x));
	
		System.out.println("-------------");
		 l1.stream().filter((x)->x.startsWith("s")).forEach(System.out::println);

		 //l1.stream().filter(String::startsWith("s")).forEach(System.out::println);

		 l1.stream().map(String::toUpperCase).forEach(System.out::println);
//		 String s3="rrr";
//		l1.stream().f
		 l1.stream().map(x->x.toUpperCase()).forEach(System.out::println);
//		 String s3="rrr";
		 */
		
		Stream.of("A","B","C").forEachOrdered(x->System.out.println(x));
	}

}
