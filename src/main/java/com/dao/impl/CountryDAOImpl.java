package com.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.dao.CountryDAO;
import com.model.Country;

@Repository("countryDAO")
public class CountryDAOImpl implements CountryDAO {
	
	@Autowired
	private SessionFactory session;

	@Override
	
	public List<Country> getAllCountries() {
		List<Country> countryList= session.getCurrentSession().createQuery("from Country").list();
		return countryList;
	}

}
