package listUtils;

import java.util.ArrayList;
import java.util.List;

import model.Person;

public class ListMembers {
	public static List<Person> getListOfPersons() {

		List<Person> personList = new ArrayList<>();
		personList.add(new Person(1, "shri", "pawar",9000000));
		personList.add(new Person(2, "shreya", "jain",8000000 ));
		personList.add(new Person(3, "swati", "more",40000000));
		personList.add(new Person(3, "sneha", "more",40000000));

		return personList;

	}
}