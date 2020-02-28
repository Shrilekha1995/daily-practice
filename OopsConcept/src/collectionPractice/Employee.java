package collectionPractice;

public class Employee {
	

	int id;
	public Employee(int id){
		this.id=id;
	}	
	
	@Override
	public int hashCode() {
		return 1;
}

	@Override
	public boolean equals(Object obj) {
		Employee e=(Employee)obj;
	if(e.id==this.id)
		return true;
	else 
		return false;
	
	}
	

}
