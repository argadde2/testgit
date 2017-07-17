package com.example.demo.repository;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Person;

@Repository
public class PersonRepository{
	
	@Autowired
	  MongoTemplate mongoTemplate;
	
	
	
	public Collection<Person> logAllPersons() {
		// TODO Auto-generated method stub
		List<Person> plist = mongoTemplate.findAll(Person.class);
		return plist;
	}
	public void insertPerson(Person o) {
		Person p = new Person();
	    mongoTemplate.insert(p);
		
	}
}


