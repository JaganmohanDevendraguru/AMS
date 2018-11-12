package com.sse.model;

import java.util.Date;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;

public class Student {
	private String stuId;
	private String firstName;
	private String lastName;
	@Size(min = 5, max = 16, message = "Please enter between {min} and {max} characters.")
	private String userName;
	private String password;
	private String deptId;
	private int ssn;
	private String level;
	private String major;
	@Email
	private String email;
	private int phone;
	private String street;
	private String address;
	private String city;
	private String state;
	private int zip;
	private String country;
	private String stuType;
	private String passport;
	private String authToken;
	private String activeFlag;
	private Date lastUpdateTime;

	public Student() {
		super();
	}
	
	public Student(String firstName, String lastName, String userName, String password, String deptId,
			int ssn, String level, String major, String email, int phone, String street, String address, String city,
			String state, int zip, String country, String stuType, String passport, String authToken, String activeFlag
			,Date lastUpdateTime) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.userName = userName;
		this.password = password;
		this.deptId = deptId;
		this.ssn = ssn;
		this.level = level;
		this.major = major;
		this.email = email;
		this.phone = phone;
		this.street = street;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.country = country;
		this.stuType = stuType;
		this.passport = passport;
		this.authToken = authToken;
		this.activeFlag = activeFlag;
		this.lastUpdateTime = lastUpdateTime;
	}
	
	public Student(String stuId, String firstName, String lastName, String userName, String password, String deptId,
			int ssn, String level, String major, String email, int phone, String street, String address, String city,
			String state, int zip, String country, String stuType, String passport, String authToken,String activeFlag
			,Date lastUpdateTime) {
		super();
		this.stuId = stuId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.userName = userName;
		this.password = password;
		this.deptId = deptId;
		this.ssn = ssn;
		this.level = level;
		this.major = major;
		this.email = email;
		this.phone = phone;
		this.street = street;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.country = country;
		this.stuType = stuType;
		this.passport = passport;
		this.authToken = authToken;
		this.activeFlag = activeFlag;
		this.lastUpdateTime = lastUpdateTime;
	}

	public String getStuId() {
		return stuId;
	}

	public void setStuId(String stuId) {
		this.stuId = stuId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getDeptId() {
		return deptId;
	}

	public void setDeptId(String deptId) {
		this.deptId = deptId;
	}

	public int getSsn() {
		return ssn;
	}

	public void setSsn(int ssn) {
		this.ssn = ssn;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
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

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getStuType() {
		return stuType;
	}

	public void setStuType(String stuType) {
		this.stuType = stuType;
	}

	public String getPassport() {
		return passport;
	}

	public void setPassport(String passport) {
		this.passport = passport;
	}
	
	public String getActiveFlag() {
		return activeFlag;
	}

	public void setActiveFlag(String activeFlag) {
		this.activeFlag = activeFlag;
	}

	public String getAuthToken() {
		return authToken;
	}

	public void setAuthToken(String authToken) {
		this.authToken = authToken;
	}
	
	public Date getLastUpdateTime() {
		return lastUpdateTime;
	}

	public void setLastUpdateTime(Date lastUpdateTime) {
		this.lastUpdateTime = lastUpdateTime;
	}

	@Override
	public String toString() {
		return "Student [stuId=" + stuId + ", firstName=" + firstName + ", lastName=" + lastName + ", userName="
				+ userName + ", password=" + password + ", deptId=" + deptId + ", ssn=" + ssn + ", level=" + level
				+ ", major=" + major + ", email=" + email + ", phone=" + phone + ", street=" + street + ", address="
				+ address + ", city=" + city + ", state=" + state + ", zip=" + zip + ", country=" + country
				+ ", stuType=" + stuType + ", passport=" + passport + ", authToken=" + authToken +""
				+ ",lastUpdateTime" + lastUpdateTime + ", activeFlag" + activeFlag +"]";
	}
	
}
