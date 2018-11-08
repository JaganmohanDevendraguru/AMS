package com.sse.dao;

import java.util.List;

import com.sse.model.Course;

public interface CourseDAO {
	public List<Course> findAll();
	public Course findCourseById(String id);
	public int createCourse(Course course);
	public int deleteCourseById(String id);
	public int updateCourse(Course course);
}
