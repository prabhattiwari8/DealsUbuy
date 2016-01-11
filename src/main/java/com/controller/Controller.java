package com.controller;

import java.util.LinkedHashMap;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.model.City;
import com.model.Country;
import com.model.Input;
import com.model.State;
import com.service.CityService;
import com.service.CountryService;
import com.service.DealerService;
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
	
	@Autowired
	private DealerService dealerService;
	 
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
	  
	  @RequestMapping(value="/saveUser", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
	   public  void saveUser(@RequestBody Input dealer)  {
		   System.out.println("in save method");
		   System.out.println(dealer);
		  System.out.println(dealer.getInput());
		  LinkedHashMap<String, Object> dealerInfo = (LinkedHashMap<String, Object>) dealer.getInput();
		  dealerService.storeDealerInfo(dealerInfo);
		  
	   }
	  
	   @RequestMapping(value="/saveDeal", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
	   public  void saveDeal(@RequestBody Input deal)  {
		   System.out.println("in savedeal method");
		   System.out.println(deal);
		   LinkedHashMap<String, Object> dealerInfo = (LinkedHashMap<String, Object>) deal.getInput();
		   dealerService.storeDealerInfo(dealerInfo);
		  
	   }
 
}
