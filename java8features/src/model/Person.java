package model;

public class Person {
	
	int Id;
	String firstName;
	String LastName;
	float income;
	public Person()
	{
		
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	
	public float getIncome() {
		return income;
	}
	public void setIncome(float income) {
		this.income = income;
	}
	@Override
	public String toString() {
		return "Person [Id=" + Id + ", firstName=" + firstName + ", LastName=" + LastName + ", income=" + income + "]";
	}
	public Person(int id, String firstName, String lastName, float income) {
		super();
		Id = id;
		this.firstName = firstName;
		LastName = lastName;
		this.income = income;
	}
	public Person(int id, String firstName, String lastName) {
		super();
		Id = id;
		this.firstName = firstName;
		LastName = lastName;
		
	}


	

}
