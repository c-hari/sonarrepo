package com.example.demo.controller;

import static org.hamcrest.CoreMatchers.anything;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.example.demo.model.Country;


@SpringBootTest
public class CountryControllerTest {
	
	@InjectMocks
	CountryController countrycontroller;
	
	@Mock
	Country country;
	@Mock
	ResponseEntity< Country> res;
	@Mock
	HttpHeaders htphead;
	
	@BeforeEach
	public void init()
	{
		MockitoAnnotations.initMocks(this);
		country=new Country();
		country.setCountryName("india");
		country.setPopulation(9089);
		htphead=new HttpHeaders();
		htphead.add("responed", "success");
		
		res=new ResponseEntity<Country>(country, htphead,HttpStatus.ACCEPTED);
	}
	@AfterEach
	public void tearDown()
	{
		
	}
	@Test
	public void getCountryTest()
	{
		
		//Mockito.when(countrycontroller.getCountry()).thenReturn(res);
		countrycontroller.getCountry();
		
	}
}

