package collector;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectorClassDifferentMethods {

	public static void main(String[] args) {

		Stream<String> myStream = Stream.of("a", "b","s");
		String str = myStream.collect(Collectors.joining());
		System.out.println("concatenated string is :"+ str);
		Stream<Integer> intStream=Stream.of(1,2,3,4,5);
		long count=intStream.collect(Collectors.counting());
		System.out.println("Number of elements are:"+ count);
		
		Stream<Integer> integerStream=Stream.of(2,4,5,8,9,1);
		Optional<Integer> maxValue=integerStream.collect(Collectors.maxBy(Comparator.naturalOrder()));
		int max=maxValue.get();
		System.out.println("Max value is : "+max);
		
		Stream<String> fruits=Stream.of("Apple","banana","Apricot","Orange");
		Map<Boolean,Long>fruitMap=fruits.collect(Collectors.groupingBy(x->x.startsWith("A"),Collectors.counting()));
		System.out.println("fruits starting with A are : "+fruitMap.get(true));
		
		Stream<String> name=Stream.of("Swati","Shrilekha","Reshma","Pooja");
		Map<Boolean,List<String>> nameMap=name.collect(Collectors.partitioningBy(x->x.length()>5));
		System.out.println("Names with length greater than 5 are : "+nameMap.get(true));
		
		Stream<Integer> numbers=Stream.of(1,6,2,9,10);
	    numbers.filter(x-> x>5).forEach(System.out::println);
	     
	    
	    String str5="hey how are you";
	    String [] sarr=str5.split(" ");
	    
	   // System.out.println(Arrays.toString(sarr));
	    
	     String reverse="";
	     for(int i=0;i<sarr.length;i++)
	     {
	    	 reverse=reverse+sarr[sarr.length-1-i]+" ";
	     }
		System.out.println(reverse);
		
		
		
		
		

	}

}
