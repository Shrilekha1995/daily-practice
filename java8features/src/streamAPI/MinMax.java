package streamAPI;

import java.util.ArrayList;
import java.util.List;

import model.Person;

public class MinMax {

	public static void main(String[] args) {

		List<Person> personList = new ArrayList<>();
		personList.add(new Person(1, "abc", "ABC", 100000));
		personList.add(new Person(2, "xyz", "XYZ", 20000));
		personList.add(new Person(3, "pqr", "PQR", 900000));

		Person person1 = personList.stream().min((p1, p2) -> p1.getIncome() > p2.getIncome() ? 1 : -1).get();// min
		System.out.println("min " + person1.getIncome());

		Person person2 = personList.stream().max((p1, p2) -> p1.getIncome() > p2.getIncome() ? 1 : -1).get();// max

		System.out.println("max " + person2.getIncome());

	}

}
