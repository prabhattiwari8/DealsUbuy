package com.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.model.Country;
import com.service.CountryService;

@Controller
public class CountryController {

	@Autowired
	private CountryService CountryService;
	
   @RequestMapping(value="/")
	    public ModelAndView Register() {
	        List<Country> listUsers = CountryService.getAllCountries();
	        ModelAndView model = new ModelAndView("Register");
	        model.addObject("userList", listUsers);
	        return model;
	    }
}
