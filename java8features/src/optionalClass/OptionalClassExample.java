package optionalClass;

import java.util.Optional;

/*
 * it is public final class and used to deal with null pointer exceptions
 * java.util package
 * this class provides method to check presence of value or variable
 * it minimizes complex code
 */

public class OptionalClassExample {

	public static void main(String[] args) {

		String[] str = new String[10];

		Optional<String> checkNull = Optional.ofNullable(str[5]);
		checkNull.ifPresent(System.out::println);
		// System.out.println(checkNull.get());//throws no such element exception
		System.out.println("hi");
		
		Optional<String> check = Optional.empty().of("pranaw");
		
		check.ifPresent(System.out::println);
		
		if(check.isPresent())
		{
			System.out.println(check.get());
		}

	}

}
