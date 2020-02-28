package com.autowiring;

public class Department {

	int depId;
	public Department()
	{
		System.out.println("default constructor");
	}
	public Department(int depId) {
		super();
		this.depId = depId;
	}
	public int getDepId() {
		return depId;
	}
	public void setDepId(int depId) {
		this.depId = depId;
	}
	@Override
	public String toString() {
		return "Department [depId=" + depId + "]";
	}
	
	
	
	
}
