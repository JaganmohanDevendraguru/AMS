package com.sse.dao;

import java.util.List;

import com.sse.model.CourseSchedule;

public interface CourseScheduleDAO {
	public List<CourseSchedule> findAll();
	public CourseSchedule findById(String id);
	public int create(CourseSchedule cs);
	public int deleteById(String id);
	public int update(CourseSchedule cs);
}
