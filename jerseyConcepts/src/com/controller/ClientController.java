package com.controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

import com.exceptionHandling.CustomerDataNotFoundException;
import com.model.Client;
import com.service.ClientService;

@Path("client")
public class ClientController {

	@GET
	@Path("/{id}")
	public Response getClient(@PathParam("id") int id){
		
		if(id>1){
			throw new CustomerDataNotFoundException("customer data not found with id:"+id);
		}
		String msg=ClientService.getName(id);
		return Response.status(200).entity(msg).build();
		
	}

}
