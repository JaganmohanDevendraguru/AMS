package com.sse.dao;

import java.util.List;

import com.sse.model.CourseAssignment;


public interface CourseAssignmentDAO {
	public List<CourseAssignment> findAll();
	public CourseAssignment findCoAssById(String id);
	public int createCoAss(CourseAssignment uni);
	public int deleteCoAssById(String id);
	public int updateCoAss(CourseAssignment uni);
}
