package com.app.model;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.JoinColumn;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;


@Entity
public class Account {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int accId;
	
	private String accNumber;
	
	@ManyToMany(fetch = FetchType.EAGER,cascade=CascadeType.ALL)
	private List<Employee>  emp=new ArrayList<Employee>();

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


	public List<Employee> getEmp() {
		return emp;
	}

	public void setEmp(List<Employee> emp) {
		this.emp = emp;
	}

	@Override
	public String toString() {
		return "Account [accId=" + accId + ", accNumber=" + accNumber + "]";
	}

	public Account(int accId, String accNumber) {
		super();
		this.accId = accId;
		this.accNumber = accNumber;
	
	}
	
	public Account(){
		System.out.println("default constructor");
	}
	
	

}
