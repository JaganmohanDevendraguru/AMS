package com.sse.dao;

import java.util.List;

import com.sse.model.Department;

public interface DepartmentDAO {
	public List<Department> findAll();
	public Department DeptById(String id);
	public int createDept(Department dep);
	public int deleteDepById(String id);
	public int updateDep(Department dep);
}
