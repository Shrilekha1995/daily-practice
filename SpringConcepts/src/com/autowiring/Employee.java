package com.autowiring;

public class Employee {

	
	int id;
	String name;
	Department depart;
	/*public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}*/
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Department getDepart() {
		return depart;
	}

	public void setDepart(Department depart) {
		System.out.println("in department setter");
		this.depart = depart;
	}

	/*public Employee(Department depart)
	{
		this.depart=depart;
	}
	*/
	public Employee(){
		
		System.out.println("default constructor");
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", department=" + depart + "]";
	}


	
	
	
	
	
}
