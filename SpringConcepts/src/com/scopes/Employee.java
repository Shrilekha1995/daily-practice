package com.scopes;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
//omponent
public class Employee {
	
	int id;
	String name;
	
	public Employee(){
		
	}

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

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}

	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	
	
   /* @PostConstruct*/
	public void doMyStartUpStuff(){
		System.out.println("init-method");
	}
	
	
/*	@PreDestroy*/
	public void cleanUpStuff(){
		System.out.println("destroy method");
	}
	

}
