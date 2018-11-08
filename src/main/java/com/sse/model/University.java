package com.sse.model;

import org.springframework.stereotype.Component;

@Component
public class University {
	private String uni_code;
	private String uni_name;
	private String president;
	private String email;
	private String phone;
	private String street;
	private String address;
	private String city;
	private String state;
	private int zip;
	private String country;
	
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	
	public University() {
		super();
	}

	public University(String uni_code, String uni_name, String president, String email, String phone, String street,
			String address, String city, String state, int zip, String country) {
		super();
		this.uni_code = uni_code;
		this.uni_name = uni_name;
		this.president = president;
		this.email = email;
		this.phone = phone;
		this.street = street;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.country = country;
	}
	
	public University(String uni_name, String president, String email, String phone, String street, String address,
			String city, String state, int zip, String country) {
		super();
		this.uni_name = uni_name;
		this.president = president;
		this.email = email;
		this.phone = phone;
		this.street = street;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.country = country;
	}

	@Override
	public String toString() {
		return "University [uni_code=" + uni_code + ", uni_name=" + uni_name + ", president=" + president + ", email="
				+ email + ", phone=" + phone + ", street=" + street + ", address=" + address + ", city=" + city
				+ ", state=" + state + ", zip=" + zip + ", country=" + country + "]";
	}

	public String getUni_code() {
		return uni_code;
	}
	public void setUni_code(String uni_code) {
		this.uni_code = uni_code;
	}
	public String getUni_name() {
		return uni_name;
	}
	public void setUni_name(String uni_name) {
		this.uni_name = uni_name;
	}
	public String getPresident() {
		return president;
	}
	public void setPresident(String president) {
		this.president = president;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getZip() {
		return zip;
	}
	public void setZip(int zip) {
		this.zip = zip;
	}
	
}
