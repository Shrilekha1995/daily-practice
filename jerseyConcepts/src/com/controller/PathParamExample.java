package com.controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

@Path("/hello")
public class PathParamExample {
	
	@GET
	@Path("/{msg}")
	public Response getMasg(@PathParam("msg") String msg)
	{
		return Response.status(200).entity(msg).build();
	}

}
