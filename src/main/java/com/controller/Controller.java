package com.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.model.City;
import com.model.Country;
import com.model.State;
import com.service.CityService;
import com.service.CountryService;
import com.service.StateService;

@RestController
public class Controller {

	final static Logger logger = LoggerFactory.getLogger(Controller.class);

	@Autowired
	private CountryService CountryService;
	
	@Autowired
	private StateService stateService;
	
	@Autowired
	private CityService cityService;
	 
	  @RequestMapping(value="/countryList", method = RequestMethod.GET, produces = "application/json")
	   public  List<Country> countryList()  {
		   List<Country> listCountries = CountryService.getAllCountries();
	       return listCountries;
	   }
	  
	  @RequestMapping(value="/stateList", method = RequestMethod.GET, produces = "application/json")
	   public  List<State> stateList()  {
		   List<State> listStates = stateService.getAllStates();
	       return listStates;
	   }
	  
	  @RequestMapping(value="/cityList", method = RequestMethod.GET, produces = "application/json")
	   public  List<City> cityList()  {
		   List<City> listCities = cityService.getAllCities();
	       return listCities;
	   }
 
}
