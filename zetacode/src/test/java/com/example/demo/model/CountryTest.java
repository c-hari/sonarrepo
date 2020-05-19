package com.example.demo.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CountryTest {
	@Test
	public void countryTest()
	{
		Country country=new Country();
		country.setCountryName("india");
		country.setPopulation(9000);
		
		String cname=country.getCountryName();
		Assertions.assertEquals("india", cname);
		int pop=country.getPopulation();
		Assertions.assertEquals(9000, pop);
	}
}
