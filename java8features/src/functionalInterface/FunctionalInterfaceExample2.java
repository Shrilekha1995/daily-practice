package functionalInterface;

import java.util.Arrays;
import java.util.function.Function;

public class FunctionalInterfaceExample2 {

	public static void main(String[] args) {
		
		
		Function<String,Integer>parseInteger=Integer::parseInt;
		Function<Integer,Integer>absInt=Math::abs;
		Function<String,Integer>parseandAbs=parseInteger.andThen(absInt);
		Arrays.stream("1,-2,3".split(",")).map(parseandAbs).forEach(System.out::println);
	
		
		
		

	}

}
