package com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "dub_city")
public class City {
	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.AUTO) //for Auto generation
	private int city_Id;
	
	@Column
	private String city_Name;
	
	@Column
	private int state_Id;
	
	public City(int cityId, String cityName, int stateId ) {
		super();
		this.city_Id = cityId;
		this.city_Name = cityName;
		this.state_Id=stateId;
	}
	public City( ) {
		
	}
	

	
	public int getCityId() {
		return city_Id;
	}
	public void setCityId(int cityId) {
		this.city_Id = cityId;
	}
	public String getCityName() {
		return city_Name;
	}
	public void setCityName(String cityName) {
		this.city_Name = cityName;
	}
	public int getStateId() {
		return state_Id;
	}
	public void setStateId(int stateId) {
		this.state_Id = stateId;
	}
	
	
	
	
	
}
