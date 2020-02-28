package oopsConcept;

public class Manager extends Employee{
	
	public int bonus;
	
	 
	 protected void getSalary(int sal){
	    	
	    	salary=sal;
	    	System.out.println(sal);
	    }
	 public Manager(){
		 
	 }
	 

  
public Manager(String name, int salary, int bonus) {
	
		super(name, salary);
		System.out.println("parameter constructor");
		this.bonus = bonus;
	}

public static void main(String[] args)
{
	
	
	Manager mg=new Manager("abc",5000,9000);
	//Manager mc=(Manager)emp;
	

}
}
