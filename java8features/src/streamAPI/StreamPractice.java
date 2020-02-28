package streamAPI;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamPractice {

	public static void main(String[] args) {
		Stream<Integer> stm= Stream.of(1,2,3,4,5);
		//stm.forEach(p->System.out.println(p));
		Stream<Integer> stm22= Stream.of(1,2,3,4,5);
		Stream<String>str2=Stream.of("abc","xyz","pqr");
		stm.parallel().forEach(System.out::println);
		System.out.println("----------------");
		//stm2.parallel().forEachOrdered(System.out::println);
		
		HashMap<Integer,Integer> sl=(HashMap<Integer,Integer>) stm22.collect(Collectors.toMap(x->x, x->x+1));
		
		
		
	}
}
