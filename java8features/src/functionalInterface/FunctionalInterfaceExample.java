package functionalInterface;

import java.util.function.Function;

public class FunctionalInterfaceExample {

	public static void main(String[] args) {
		
		
		Function<String,Integer> strLength=str->str.length();
		System.out.println(strLength.apply("hello"));
		

	}

}
