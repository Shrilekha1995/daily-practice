package com.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;


@Entity
public class Account {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int accId;
	
	private String accNumber;
	
	@OneToOne(mappedBy="account")
	private Employee  emp;

	public int getAccId() {
		return accId;
	}

	public void setAccId(int accId) {
		this.accId = accId;
	}

	public String getAccNumber() {
		return accNumber;
	}

	public void setAccNumber(String accNumber) {
		this.accNumber = accNumber;
	}

	public Employee getEmp() {
		return emp;
	}

	public void setEmp(Employee emp) {
		this.emp = emp;
	}

	@Override
	public String toString() {
		return "Account [accId=" + accId + ", accNumber=" + accNumber + "]";
	}

	public Account(int accId, String accNumber, Employee emp) {
		super();
		this.accId = accId;
		this.accNumber = accNumber;
		this.emp = emp;
	}
	
	public Account(){
		System.out.println("default constructor");
	}
	
	

}
