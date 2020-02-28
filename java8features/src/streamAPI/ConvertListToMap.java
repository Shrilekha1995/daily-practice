package streamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import model.Person;

public class ConvertListToMap {

	public static void main(String[] args) {

		List<Person> personList = new ArrayList<>();
		personList.add(new Person(1, "abc", "ABC", 100000));
		personList.add(new Person(2, "xyz", "XYZ", 20000));
		personList.add(new Person(3, "pqr", "PQR", 900000));
		personList.add(new Person(4, "pqr", "PQR", 900000));
		personList.add(new Person(5, "opt", "OPT", 800000));

		Map<Integer, Person> m1 = personList.stream().collect(Collectors.toMap(p -> p.getId(), p -> p));

		System.out.println(m1);

	}

}
