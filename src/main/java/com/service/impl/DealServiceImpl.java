package com.service.impl;

import java.util.LinkedHashMap;

import org.springframework.beans.factory.annotation.Autowired;

import com.dao.DealInfoDAO;
import com.service.DealService;

public class DealServiceImpl implements DealService {


	@Autowired
	DealInfoDAO dealInfoDAO;
	
	@Override
	public boolean storeDealInfo(LinkedHashMap<String, Object> dealInfoMap) {
		// TODO Auto-generated method stub
		return false;
	}

}
