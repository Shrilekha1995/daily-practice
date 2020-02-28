package collector;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import listUtils.ListMembers;
import model.Person;

/*Collector is final class extends object class
 * It provides reduction operation
 * accumulating elements into collection
 * summarizing elements according to various criteria
 * It is mostly used on stream to convert it into required Collections type(List, Set, Map) and also it contains methods, 
 * which are used in various operations like grouping, joining stream objects as a string etc.
 */

public class StreamConverter {

	public static void main(String[] args) {

		List<Integer> integerList = Arrays.asList(1, 3, 4, 5, 1, 2, 3);

		List<Integer> evenList = integerList.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
		System.out.println("even number list");
		System.out.println(evenList);

		Set<Integer> intSet = integerList.stream().collect(Collectors.toSet());
		System.out.println("Set elements are as follow");
		System.out.println(intSet);

		List<Person> personList = ListMembers.getListOfPersons();
		Map<Integer, Person> personMap = personList.stream()
				.collect(Collectors.toMap(p -> p.getId(), p -> p, (p1, p2) -> p1));
		System.out.println("Map elements are as follow");
		System.out.println(personMap);

	}

}
