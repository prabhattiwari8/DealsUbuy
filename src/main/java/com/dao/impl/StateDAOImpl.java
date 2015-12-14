package com.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.dao.StateDAO;

import com.model.State;

@Repository("stateDAO")
public class StateDAOImpl implements StateDAO {
	
	@Autowired
	private SessionFactory session;

	@Override
	public List<State> getAllStates() {
		List<State> stateList= session.getCurrentSession().createQuery("from State").list();
		return stateList;
	}

}
