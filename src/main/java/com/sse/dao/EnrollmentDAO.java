package com.sse.dao;

import java.util.List;

import com.sse.model.Enrollment;

public interface EnrollmentDAO {
	public List<Enrollment> findAll();
	public Enrollment findById(String id);
	public int create(Enrollment enrol);
	public int deleteById(String id);
	public int update(Enrollment enrol);
}
