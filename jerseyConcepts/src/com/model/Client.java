package com.model;

public class Client {
	
	int id;
	String name;

	
	public Client(){	
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
		return "Client [id=" + id + ", name=" + name + "]";
	}

	public Client(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	

}
