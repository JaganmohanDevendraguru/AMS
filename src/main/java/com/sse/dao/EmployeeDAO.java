package com.sse.dao;

import java.util.List;

import com.sse.model.Employee;

public interface EmployeeDAO {
	public List<Employee> findAll();
	public Employee findById(int id);
	public int create(Employee e);
	public int deleteById(int id);
	public int update(Employee e);
}
