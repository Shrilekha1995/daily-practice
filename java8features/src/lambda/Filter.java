package lambda;



import java.util.Arrays;
import java.util.List;

import listUtils.ListMembers;
import model.Person;

public class Filter {

	public static void main(String[] args) {
		
		
		List<Person> personList=ListMembers.getListOfPersons();
		
		List<Integer> intList=Arrays.asList(1,2,6,3,9,8);

		System.out.println(personList.stream().filter(p->p.getIncome()>20000).findFirst());
		
		
		

	}

}
