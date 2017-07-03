/**
 * 
 */
package com.sumanway2learn.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sumanway2learn.dtos.Person;
import com.sumanway2learn.service.PersonService;

/**
 * @author sahaasum
 *
 */
@Controller
public class PersonController {

	@Autowired
	private PersonService personService;

	/**
	 * 
	 */
	public PersonController() {
		super();
	}

	@RequestMapping(value = "/greet", method = RequestMethod.GET)
	public String greet(@ModelAttribute("person") Person person, ModelMap model) {
		String greet = personService.greetPerson(person);
		model.addAttribute("msg", greet);
		return "welcomePage";

	}

	@RequestMapping(value = "/welcome", method = RequestMethod.GET)
	public String welcome(ModelMap model) {

		model.addAttribute("person", personService.greetPerson(new Person("Suman", "Pune")));
		return "welcomePage";

	}
}
