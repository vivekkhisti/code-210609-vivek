package com.vivek.code;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.vivek.code.dto.PersonDto;
import com.vivek.code.entity.Person;
import com.vivek.code.service.CodeService;

@SpringBootTest
class Code210608VivekApplicationTests {

	@Test
	void contextLoads() {
	}
	
	@Autowired
	CodeService codeService;
	
	@Test
	void bmi() {
		
			Person person = new Person();
			person.setGender("Male");
			person.setHeightCm(171);
			person.setWeightKg(96);
			
			Person person1 = new Person();
			person1.setGender("Male");
			person1.setHeightCm(161);
			person1.setWeightKg(85);
			
			Person person2 = new Person();
			person2.setGender("Male");
			person2.setHeightCm(180);
			person2.setWeightKg(77);
			
			Person person3 = new Person();
			person3.setGender("Female");
			person3.setHeightCm(166);
			person3.setWeightKg(62);
			
			Person person4 = new Person();
			person4.setGender("Female");
			person4.setHeightCm(150);
			person4.setWeightKg(70);
			
			Person person5 = new Person();
			person5.setGender("Female");
			person5.setHeightCm(167);
			person5.setWeightKg(82);
			
		
		List<Person> personList = new ArrayList<>();
		personList.add(person);
		personList.add(person1);
		personList.add(person2);
		personList.add(person3);
		personList.add(person4);
		personList.add(person5);
		PersonDto dto = codeService.getBMI(personList);
		
		Assertions.assertNotNull(dto, "The saved widget should not be null");
		Assertions.assertEquals(6, dto.getOverWeightCount(), "Error");
		Assertions.assertEquals(56.140350877192986, dto.getPerson().get(0).getBMI(), "Error");
		Assertions.assertEquals(52.795031055900616, dto.getPerson().get(1).getBMI(), "Error");
		Assertions.assertEquals(42.77777777777778, dto.getPerson().get(2).getBMI(), "Error");
		Assertions.assertEquals(37.34939759036145, dto.getPerson().get(3).getBMI(), "Error");
		Assertions.assertEquals(46.666666666666664, dto.getPerson().get(4).getBMI(), "Error");
		Assertions.assertEquals(49.10179640718563, dto.getPerson().get(5).getBMI(), "Error");
		
	}

}
