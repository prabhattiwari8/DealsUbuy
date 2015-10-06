package com.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.ModelMap;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.model.Country;
import com.service.CountryService;

@org.springframework.stereotype.Controller
public class CountryController {

	final static Logger logger = LoggerFactory.getLogger(CountryController.class);

	@Autowired
	private CountryService CountryService;
	
  /* @RequestMapping(value="/")
	    public ModelAndView Register() {
	        List<Country> listUsers = CountryService.getAllCountries();
	        ModelAndView model = new ModelAndView("Register");
	        model.addObject("userList", listUsers);
	        return model;
	    }*/
	
	 @RequestMapping(value = { "/", "/list" }, method = RequestMethod.GET)
	    public String listUsers(ModelMap model) {
		 logger.info("Entered in listUsers");
	     List<Country> listUsers = CountryService.getAllCountries();
	        model.addAttribute("userList", listUsers);
	        logger.info("exit in listUsers");
	        return "Register";
	    } 
	 
   @RequestMapping(value="/greeting",produces="application/json")
   public  ResponseEntity<List<Country>> greeting()  {
	   List<Country> listUsers = CountryService.getAllCountries();
       return new ResponseEntity<List<Country>>(listUsers, HttpStatus.OK);
   }
}
