package com.sse.dao;

import java.util.List;

import com.sse.model.Student;

public interface StudentDAO {
	public List<Student> findAll();
	public Student findById(int id);
	public int create(Student cs);
	public int deleteById(int id);
	public int update(Student cs);
}
