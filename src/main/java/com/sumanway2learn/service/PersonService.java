/**
 * 
 */
package com.sumanway2learn.service;

import com.sumanway2learn.dtos.Person;

/**
 * @author sahaasum
 *
 */
public class PersonService {

	/**
	 * 
	 */
	public PersonService() {
		// TODO Auto-generated constructor stub
	}

	public String greetPerson(Person person) {
		return "Hello " + person.getName() + "! Welcome to our world!";
	}

}
