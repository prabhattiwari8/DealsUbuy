package com.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dao.CityDAO;
import com.model.City;
import com.service.CityService;

@Service("cityService")
public class CityServiceImpl implements CityService {

	@Autowired
	CityDAO cityDAO;
	
	@Transactional
	public List<City> getAllCities() {
		return cityDAO.getAllCities();
	}

}
