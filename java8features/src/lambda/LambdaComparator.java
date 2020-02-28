package lambda;


import java.util.Collections;
import java.util.List;
import listUtils.ListMembers;

import model.Person;

public class LambdaComparator {

	public static void main(String[] args) {
		
		
		List<Person> personList =ListMembers.getListOfPersons();
		
		
		Collections.sort(personList,(p1,p2)->{return p1.getFirstName().compareTo(p2.getFirstName());});
		
		
		
		for(Person person:personList)
		{
			System.out.println(person.getFirstName());
		}
		
		
		

	}

}
