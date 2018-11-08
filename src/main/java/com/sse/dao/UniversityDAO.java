package com.sse.dao;

import java.util.List;

import com.sse.model.University;

public interface UniversityDAO {
	public List<University> findAll();
	public University findUniById(String id);
	public int createUniversity(University uni);
	public int deleteUniById(String id);
	public int updateUni(University uni);
}
