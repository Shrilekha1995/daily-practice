package com.service;

import java.util.List;

import com.model.*;

public class ClientService {

	public static String getName(int id) {
		
		List<Client> p=ClientDetails.getClientDetails();
	    Client c=p.get(id);
		return c.getName();
	}
	

}
