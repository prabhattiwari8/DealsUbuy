package com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="dub_user")
public class DealerInfo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "USERID", unique = true, nullable = false)
	private Integer id;
	
	@Column(name = "EMAIL", unique = true, nullable = false, length = 50)
	private String email;
	@Column(name = "PASSWORD", nullable = false, length = 8)
	private String password;
	@Column(name = "FIRST_NAME", nullable = false, length = 50)
	private String firstname;
	@Column(name = "LAST_NAME", nullable = false, length = 50)
	private String lastname;
	@Column(name = "COUNTRYCODE_PHONE_NUMBER", nullable = true, length = 3)
	private Integer countryCode;
	@Column(name = "STDCODE_PHONENUMBER", nullable = true, length = 3)
	private Integer stdCode;
	@Column(name = "PHONENUMBER", nullable = false, length = 10)
	private Integer phone;
	@Column(name = "ADDRESS_1", nullable = false, length = 255)
	private String address1;
	@Column(name = "ADDRESS_2", nullable = true, length = 255)
	private String address2;
	@Column(name = "PIN", nullable = false, length = 8)
	private Integer pin;
	@Column(name = "CITY_ID", nullable = false, length = 5)
	private Integer cityId;
	@Column(name = "STATE_ID", nullable = false, length = 2)
	private Integer stateId;
	@Column(name = "COUNTRY_ID", nullable = false, length = 3)
	private Integer countryId;

	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	public String getAddress1() {
		return address1;
	}
	public void setAddress1(String address1) {
		this.address1 = address1;
	}
	public String getAddress2() {
		return address2;
	}
	public void setAddress2(String address2) {
		this.address2 = address2;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}



	public int getCityId() {
		return cityId;
	}
	public void setCityId(int cityId) {
		this.cityId = cityId;
	}
	public int getStateId() {
		return stateId;
	}
	public void setStateId(int stateId) {
		this.stateId = stateId;
	}
	public int getCountryId() {
		return countryId;
	}
	public void setCountryId(int countryId) {
		this.countryId = countryId;
	}


}
