package com.sse.dao;

import java.util.List;

import com.sse.model.Semester;

public interface SemesterDAO {
	public List<Semester> findAll();
	public Semester findById(String sem);
	public int create(Semester sem);
	public int deleteById(String id);
	public int update(Semester sem);
}
