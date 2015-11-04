package com.korso.crud.dataaccess;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.korso.crud.core.Animal;

public class AnimalService {
	
	AnimalDao animalDao;
	
	public AnimalService(){
		
		animalDao = animalDao.instance;
	}
	
	public void createAnimal (Animal animal){
		
		animalDao.getAnimals().put(animal.getId(), animal);
		
	}
	
	public Animal getAnimal(String id){
		return animalDao.getAnimals().get(id);
	}
	
	public Map<String, Animal> getAnimals(){
		return animalDao.getAnimals();
	}

	public List<Animal> getAnimalAsList(){
		List<Animal> animalList = new ArrayList<Animal>();
		animalList.addAll(animalDao.getAnimals().values());
		return animalList;
	}
	
	public int getAnimalsCount(){
		return animalDao.getAnimals().size();
	}

	public void deleteAnimal(String id){
		animalDao.getAnimals().remove(id);
	}
}
