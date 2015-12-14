package com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "dub_state")
public class State {
	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.AUTO) //for Auto generation
	private int state_Id;
	
	@Column
	private String state_Name;
	
	@Column
	private int country_Id;
	
	public State(int stateId, String stateName, int countryId ) {
		super();
		this.state_Id = stateId;
		this.state_Name = stateName;
		this.country_Id=countryId;
	}
	public State( ) {
		
	}
	
	public int getStateId() {
		return state_Id;
	}

	public void setStateId(int state_Id) {
		this.state_Id = state_Id;
	}

	public String getStateName() {
		return state_Name;
	}

	public void setStateName(String state_Name) {
		this.state_Name = state_Name;
	}

	public int getCountryId() {
		return country_Id;
	}

	public void setCountryId(int country_Id) {
		this.country_Id = country_Id;
	}
	
	
	
}
