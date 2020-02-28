package oopsConcept;

public class Employee {
	
	public String name;
	public Employee(String name, int salary) {
		System.out.println("Employee parameter constructor");
		this.name = name;
		this.salary = salary;
	}


	public static  int salary;
	
	
	
	public Employee()
	{
		System.out.println("Employee()");
	}
	
	
      public final   Employee getSalary(){
    	System.out.println(salary);
    	
    	return new Employee();
    	
    }

	

}
