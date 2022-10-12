package com.firstserviceweb.rest;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("/client")

public class RestClient {

	
	
	public static List<client> cls=new ArrayList<>();
	
	static {
		cls.add(new client(1, "aa", "bb"));
		cls.add(new client(2, "zz", "oo"));
		cls.add(new client(3, "dd", "uu"));
		cls.add(new client(4, "ss", "mm"));
	}
	
	@GET
	@Path("/message1")
	@Produces(MediaType.APPLICATION_XML)
	public List<client> getMessage1() {
	return cls;
	}
	
	
	
	@GET
	@Path("/message2")
	@Produces(MediaType.APPLICATION_JSON)
	public String  getMessage2() {
	return "hello world";
	}

	@GET
	@Path("/message3")
	@Produces(MediaType.APPLICATION_JSON)
	public client  getMessage3(@QueryParam("id") int id) {
		
		for(client c: cls)
			if(c.getId() ==id)
				return c;
	return null;
	}
	
	@GET
	@Path("/message4/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public client  getMessage4(@PathParam("id") int id) {
		
		for(client c: cls)
			if(c.getId() ==id)
				return c;
	return null;
	}

}
