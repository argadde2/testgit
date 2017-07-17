package com.example.demo.controllers;

import javax.ws.rs.Produces;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.model.Person;
import com.example.demo.repository.PersonRepository;

@Controller
public class PersonController {
	@Autowired
PersonRepository personrepository;
	
	@RequestMapping(value = "/Form", method = RequestMethod.GET)
@Produces("application/json")
    public String Form(Model model) {
		model.addAttribute("person" , new Person());
        return "Form";
    }
	@RequestMapping(value = "/Form", method = RequestMethod.POST)
	@Produces("application/json")
    public String add(Model model,@ModelAttribute Person person) {
		Person p = new Person(person.getFirstName(),person.getLastName());
     personrepository.insertPerson(person);
   model.addAttribute("personlist",personrepository.logAllPersons());
        return "result";
    }
}