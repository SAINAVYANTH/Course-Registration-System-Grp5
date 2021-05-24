package com.flipkart.bean;

public class PersonalDetails {
	private String name;
	private String id;
	private String dob;
	private String email;
	private String address;
	private UserLogin loginDetails;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public UserLogin getLoginDetails() {
		return loginDetails;
	}
	public void setLoginDetails(UserLogin loginDetails) {
		this.loginDetails = loginDetails;
	}
}
