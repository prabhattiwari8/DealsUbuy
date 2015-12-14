package com.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import com.dao.StateDAO;

import com.model.State;
import com.service.StateService;

@Service("stateService")
public class StateServiceImpl implements StateService {

	@Autowired
	private StateDAO stateDAO;
	
	
	@Transactional
	public List<State> getAllStates() {
		// TODO Auto-generated method stub
		return stateDAO.getAllStates();
	}

}
