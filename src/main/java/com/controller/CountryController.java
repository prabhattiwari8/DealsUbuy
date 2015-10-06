package com.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.model.Country;
import com.service.CountryService;

@RestController
public class CountryController {

	final static Logger logger = LoggerFactory.getLogger(CountryController.class);

	@Autowired
	private CountryService CountryService;
	

	
	 @RequestMapping(value="/countryList", method = RequestMethod.GET, produces = "application/json")
	   public  List<Country> greeting()  {
		   List<Country> listUsers = CountryService.getAllCountries();
	       return listUsers;
	   }
 
}
