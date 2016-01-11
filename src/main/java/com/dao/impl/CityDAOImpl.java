package com.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.dao.CityDAO;
import com.model.City;


@Repository("cityDAO")
public class CityDAOImpl implements CityDAO {

	@Autowired
	private SessionFactory session;
	
	@Override
	public List<City> getAllCities() {
		List<City> cityList= session.getCurrentSession().createQuery("from City").list();
		System.out.println("cityList"+cityList);
		return cityList;
	}

}
