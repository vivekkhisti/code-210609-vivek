package com.vivek.code.dto;

import java.util.List;

import com.vivek.code.entity.Person;

public class PersonDto {
	
	int OverWeightCount;
	List<Person> person;
	public int getOverWeightCount() {
		return OverWeightCount;
	}
	public void setOverWeightCount(int overWeightCount) {
		OverWeightCount = overWeightCount;
	}
	public List<Person> getPerson() {
		return person;
	}
	public void setPerson(List<Person> person) {
		this.person = person;
	}
}
