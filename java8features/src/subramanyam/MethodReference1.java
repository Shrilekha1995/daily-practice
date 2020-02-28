package subramanyam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MethodReference1 {

	public static void main(String[] args) {
		
		String str="hey";
		final List<String> l1=new ArrayList<>();
		l1.add("shri");
		l1.add("neha");
		l1.add("divya");
		l1.stream().map(String::toUpperCase).forEach(System.out::println);
		//l1.stream().filter(String::startsWith("N")).forEach(System.out::println);
		
	

	}

}
