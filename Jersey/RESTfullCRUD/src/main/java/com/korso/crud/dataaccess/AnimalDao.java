package com.korso.crud.dataaccess;

import java.util.HashMap;
import java.util.Map;

import com.korso.crud.core.Animal;

public enum AnimalDao {
	
	instance;
	
	private Map<String, Animal> animals = new HashMap<String, Animal>();

	private AnimalDao(){
		
		//pumping-in some default data
		Animal animal = new Animal("1", "Lion", "Wild");
		animals.put("1", animal);
		
		animal = new Animal("2", "Crocodile", "Wild");
		animals.put("2", animal);
		
		animal = new Animal("3", "Cat", "Domestic");
		animals.put("3", animal);
		
		
	}

	public Map<String, Animal> getAnimals() {
		return animals;
	}
	
/*
	public void setAnimals(Map<String, Animal> animals) {
		this.animals = animals;
	}
*/
	

}
