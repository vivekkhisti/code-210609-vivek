package com.vivek.code.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.vivek.code.dto.PersonDto;
import com.vivek.code.entity.Person;
import com.vivek.code.service.CodeService;

@Service
public class ServiceImpl implements CodeService {

	@Override
	public PersonDto getBMI(List<Person> personList) {
		int count = 0;
		PersonDto dto = new PersonDto();
		List<Person> returnList = new ArrayList<>();
		for (Person person : personList) {
			person.setBMI(person.getWeightKg() / (person.getHeightCm() / 100.0));
			person = BMICategory(person);
			if (person.getBMICategory().equalsIgnoreCase("Moderately obese")
					|| person.getBMICategory().equalsIgnoreCase("Severely obese")
					|| person.getBMICategory().equalsIgnoreCase("Very severely obese")) {
				count++;
			}
			returnList.add(person);
		}
		dto.setOverWeightCount(count);
		dto.setPerson(returnList);
		return dto;
	}

	private Person BMICategory(Person person) {
		if (person.getBMI() <= 18.4) {
			person.setBMICategory("Underweight");
			person.setHealthRisk("Malnutrition risk");
		} else if (person.getBMI() > 18.4 && person.getBMI() <= 24.9) {
			person.setBMICategory("Normal weight");
			person.setHealthRisk("Low risk");
		} else if (person.getBMI() > 24.9 && person.getBMI() <= 29.9) {
			person.setBMICategory("Overweight");
			person.setHealthRisk("Enhanced risk");
		} else if (person.getBMI() > 29.9 && person.getBMI() <= 34.9) {
			person.setBMICategory("Moderately obese");
			person.setHealthRisk("Medium risk");
		} else if (person.getBMI() > 34.9 && person.getBMI() <= 39.9) {
			person.setBMICategory("Severely obese");
			person.setHealthRisk("High risk");
		} else if (person.getBMI() > 34.9) {
			person.setBMICategory("Very severely obese");
			person.setHealthRisk("Very high risk");
		}
		return person;
	}

}
