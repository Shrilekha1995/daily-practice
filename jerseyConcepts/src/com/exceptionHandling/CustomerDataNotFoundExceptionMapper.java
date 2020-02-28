package com.exceptionHandling;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import com.model.ErrorProps;

@Provider
public class CustomerDataNotFoundExceptionMapper implements ExceptionMapper<CustomerDataNotFoundException>{

	@Override
	public Response toResponse(CustomerDataNotFoundException ex) {
		
		//return Response.status(404).entity(new ErrorProps("404", ex.getMessage())).build();
		return Response.status(404).type(MediaType.TEXT_HTML).entity(ex.getMessage()).build();
	}

}
