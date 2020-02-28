package com.exceptionHandling;

public class CustomerDataNotFoundException extends RuntimeException {

	
	public CustomerDataNotFoundException(String msg){
		super(msg);
	}
}
