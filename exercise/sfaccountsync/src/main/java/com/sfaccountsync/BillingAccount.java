package com.sfaccountsync;

import java.util.Date;

public class BillingAccount {
	private String id;
	private String name;
	private String street;
	private String state;
	private String city;
	private String country;
	private String postalCode;
	private String phone;
	private Date lastSyncedTime;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public Date getLastSyncedTime() {
		return lastSyncedTime;
	}
	public void setLastSyncedTime(Date lastSyncedTime) {
		this.lastSyncedTime = lastSyncedTime;
	}
	
}
