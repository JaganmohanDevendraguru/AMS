package com.sse.model;

public class Employee {
	private String empId;
	private String firstName;
	private String lastName;
	private String userName;
	private String password;
	private String deptId;
	private String empProfile;
	private String empType;
	private String email;
	private int phone;
	private String street;
	private String address;
	private String city;
	private String state;
	private int zip;
	private String country;
	
	public Employee() {
		super();
	}
	public Employee(String firstName, String lastName, String userName, String password, String deptId,
			String empProfile, String empType, String email, int phone, String street, String address, String city,
			String state, int zip, String country) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.userName = userName;
		this.password = password;
		this.deptId = deptId;
		this.empProfile = empProfile;
		this.empType = empType;
		this.email = email;
		this.phone = phone;
		this.street = street;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.country = country;
	}
	
	public Employee(String empId, String firstName, String lastName, String userName, String password, String deptId,
			String empProfile, String empType, String email, int phone, String street, String address, String city,
			String state, int zip, String country) {
		super();
		this.empId = empId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.userName = userName;
		this.password = password;
		this.deptId = deptId;
		this.empProfile = empProfile;
		this.empType = empType;
		this.email = email;
		this.phone = phone;
		this.street = street;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.country = country;
	}
	
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
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
	public String getEmpProfile() {
		return empProfile;
	}
	public void setEmpProfile(String empProfile) {
		this.empProfile = empProfile;
	}
	public String getEmpType() {
		return empType;
	}
	public void setEmpType(String empType) {
		this.empType = empType;
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
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", firstName=" + firstName + ", lastName=" + lastName + ", userName="
				+ userName + ", password=" + password + ", deptId=" + deptId + ", empProfile=" + empProfile
				+ ", empType=" + empType + ", email=" + email + ", phone=" + phone + ", street=" + street + ", address="
				+ address + ", city=" + city + ", state=" + state + ", zip=" + zip + ", country=" + country + "]";
	}
	
}
