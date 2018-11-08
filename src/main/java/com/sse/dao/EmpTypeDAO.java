package com.sse.dao;

import java.util.List;

import com.sse.model.EmpType;

public interface EmpTypeDAO {
	public List<EmpType> findAll();
	public EmpType findById(String id);
	public int create(EmpType et);
	public int deleteById(String id);
	public int update(EmpType et);
}
