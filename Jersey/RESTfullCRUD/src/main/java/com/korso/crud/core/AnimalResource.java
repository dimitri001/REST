package com.korso.crud.core;


import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Request;
import javax.ws.rs.core.UriInfo;

import com.korso.crud.dataaccess.AnimalService;

public class AnimalResource {
	
	UriInfo uriInfo;
	
	Request request;
	String id;
	
	AnimalService animalService;
	
	public AnimalResource(UriInfo uriInfo, Request request, String id){
		this.uriInfo = uriInfo;
		this.request = request;
		this.id = id;
		animalService = new AnimalService();
	}

	@GET
	@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
	public Animal getAnimal(){
		Animal animal = animalService.getAnimal();
		return animal;
	}
	
	@GET
	@Produces(MediaType.TEXT_HTML)
	public Animal getAnimalAsHtml(){
		Animal animal = animalService.getAnimal();
		return animal;
	}
	
}
