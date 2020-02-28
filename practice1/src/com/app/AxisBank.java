package com.app;

public class AxisBank implements BankInterface {
	
	int AccNumber;
	String name;
	double balance;
	
	public AxisBank(){
		
	}
	

	public AxisBank(int accNumber, String name, double balance) {
		super();
		AccNumber = accNumber;
		this.name = name;
		this.balance = balance;
	}




	@Override
	public void getBalance() {
		// TODO Auto-generated method stub
		
	}

}
