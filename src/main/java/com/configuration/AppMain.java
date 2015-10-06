package com.configuration;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.ui.ModelMap;

import com.model.Country;
import com.service.CountryService;
import org.springframework.ui.ModelMap;
public class AppMain {
	
	 public static String listUsers(CountryService service) {
		 ModelMap model = new ModelMap();
	      List<Country> listUsers = service.getAllCountries();
	        model.addAttribute("userslist", listUsers);
	        return "Register";
	    }
	public static void main(String[] args) {
		  AbstractApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		  CountryService service = (CountryService) context.getBean("countryService");
		  List<Country> listCountry = service.getAllCountries();
		  for(Country country:listCountry){
			  System.out.println(country.getCountryName());
		  }
		  listUsers( service);
	}
}
