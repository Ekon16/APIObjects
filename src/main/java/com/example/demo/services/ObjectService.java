package com.example.demo.services;

import java.util.*;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.ObjectModel;
import com.example.demo.repositories.ObjectRepository;

@Service
public class ObjectService {

	@Autowired
	ObjectRepository objectRepository;

	public ArrayList<ObjectModel> getAllObjects() {
		return (ArrayList) objectRepository.findAll();
	}

	public ObjectModel getObjectById(long id) {
		return objectRepository.findById(id).get();
	}

	public ObjectModel saveObject(ObjectModel object) {
		return objectRepository.save(object);
	}

	public void deleteObjectbyId(long id) {
		objectRepository.deleteById(id);
	}
	
	public void deleteAllObjects() {
		objectRepository.deleteAll();
	}
	

}
