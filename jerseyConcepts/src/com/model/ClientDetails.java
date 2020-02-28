package com.model;

import java.util.ArrayList;
import java.util.List;

public class ClientDetails {
	
	public static  	List <Client> getClientDetails(){
		
		List <Client> cl=new ArrayList<>();
		cl.add(new Client(1,"abc"));
		cl.add(new Client(2,"pqr"));
		return cl;
		
		
	}

}
