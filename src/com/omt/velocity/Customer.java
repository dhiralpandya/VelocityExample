package com.omt.velocity;

public class Customer {

	public Customer() {

	}

	private String name;
	private String company;

	public String getNameCompany() {
		return name + "|" + company;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

}
