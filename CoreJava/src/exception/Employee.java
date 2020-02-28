package exception;

public class Employee {
	
	int id;
	

	public Employee(int id) {
		super();
		this.id = id;
	}
  public void  finalize(){
	  
	  System.out.println(this.hashCode());
  }
   
	public static void main(String[] args) {
		
		
		Employee e=new Employee(5);
		System.out.println(e.hashCode());
		e=null;
      System.gc();
	}

}
