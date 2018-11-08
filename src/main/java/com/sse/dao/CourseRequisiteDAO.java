package com.sse.dao;

import java.util.List;

import com.sse.model.CourseRequisite;

public interface CourseRequisiteDAO {
	public List<CourseRequisite> findAll();
	public CourseRequisite findById(String id);
	public int create(CourseRequisite cr);
	public int deleteById(String id);
	public int update(CourseRequisite cr);
}
