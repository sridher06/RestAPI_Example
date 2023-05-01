package com.sri.tech;

import java.util.Date;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;



@Path("/api")
public class HelloWorld {
	
		 	    
		    @GET
		    @Path("/hello")
		    @Produces(MediaType.APPLICATION_JSON)
		    public String sayHello() {
		    	Date dt= new Date();
		        return "Hellow world  RESTful Web Services SE Bootstrap"+dt;
		    }
		    
		   
}
