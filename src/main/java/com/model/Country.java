package com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "dub_country")
public class Country {

	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.AUTO) //for Auto generation
	private int country_Id;

	@Column
	private String country_Name;
	
	public Country(int countryId, String countryName) {
		super();
		this.country_Id = countryId;
		this.country_Name = countryName;
	}

	public Country() {
		// TODO Auto-generated constructor stub
	}

	public int getCountryId() {
		return country_Id;
	}

	public void setCountryId(int countryId) {
		this.country_Id = countryId;
	}

	public String getCountryName() {
		return country_Name;
	}

	public void setCountryName(String countryName) {
		this.country_Name = countryName;
	}
	
	
}
