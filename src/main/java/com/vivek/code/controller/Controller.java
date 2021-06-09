package com.vivek.code.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.vivek.code.dto.PersonDto;
import com.vivek.code.entity.Person;
import com.vivek.code.service.CodeService;



@RestController
public class Controller {
	
	@Autowired
	CodeService codeService;
	
	private static final Logger logger = LoggerFactory.getLogger(Controller.class);
	
	@RequestMapping(value = "/BMI", method = RequestMethod.POST)
	PersonDto getBMI(@RequestBody List<Person> personList) {
		logger.info("Inside BMI method");
		return codeService.getBMI(personList);
		
	}

}
