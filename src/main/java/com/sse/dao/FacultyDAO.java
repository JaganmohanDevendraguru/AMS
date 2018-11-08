package com.sse.dao;

import java.util.List;

import com.sse.model.Faculty;

public interface FacultyDAO {
	public List<Faculty> findAll();
	public Faculty facultyById(String id);
	public int createFaculty(Faculty fac);
	public int deleteFacById(String id);
	public int updateFac(Faculty fac);
}
