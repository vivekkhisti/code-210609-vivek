package com.vivek.code.service;

import java.util.List;

import com.vivek.code.dto.PersonDto;
import com.vivek.code.entity.Person;

public interface CodeService {
	
	PersonDto getBMI(List<Person> personList);

}
