package com.sse.dao;

import java.util.List;

import com.sse.model.AssignmentType;

public interface AssignmentypeDAO {
	public List<AssignmentType> findAll();
	public AssignmentType findAssTypeById(String id);
	public int createAssType(AssignmentType assType);
	public int deleteAssTypeById(String id);
	public int updateAssType(AssignmentType assType);
}
