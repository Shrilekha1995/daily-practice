package generics;

import java.util.Arrays;
import java.util.List;

public class TestClass {
	
	public static void display(List<? super Manager> l1 )
	{
		System.out.println(l1);
	}
	

	public static void main(String[] args) {
		
		
		
	/*	List<Integer> l2=Arrays.asList(1,2,3,4,5);
		display(l2);
		List<Number> l3=Arrays.asList(100,200,300,400,500);
		display(l3);
		List<Object> l4=Arrays.asList(10,20,30,40,50);
		display(l4);*/
		
		
		display(Arrays.asList(new HRManager(),new Manager()));
		
	/*	List<Manager> e2=Arrays.asList(new Manager());
		display(e2);
		List<HRManager> l1=Arrays.asList(new HRManager());
	    //display(l1);
	List<Employee> l2=Arrays.asList(new Employee());
	display(l2);
*/
	}

}
class Employee {
	
}

class Manager extends Employee{
	
}
class HRManager extends Manager{
	
}