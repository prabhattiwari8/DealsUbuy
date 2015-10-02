package com.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dao.CountryDAO;
import com.model.Country;
import com.service.CountryService;

@Service
public class CountryServiceImpl implements CountryService {

	@Autowired
	private CountryDAO countryDAO;
	
	@Transactional
	public List<Country> getAllCountries() {
		
		return countryDAO.getAllCountries();
		
	}

}
