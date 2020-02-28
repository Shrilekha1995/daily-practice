package functionalInterface;

import java.util.function.Predicate;

//Predicate is functional interface
//use to check whether condition is satisfied or not

public class PredicateInterfaceExample {

	public static boolean checkAge(int age) {
		if (age > 18)
			return true;
		
		else
			return false;

	}

	public static void main(String[] args) {

		Predicate<Integer> pr = a -> a > 18;
		System.out.println(pr.test(25));

		Predicate<String> str = a -> a.length() > 4;
		System.out.println(str.test("shri"));

		Predicate<Integer> prAge = PredicateInterfaceExample::checkAge;
		System.out.println(prAge.test(20));

	}

}
