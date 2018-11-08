package com.sse.dao;

import java.util.List;

import com.sse.model.DegreeLevel;

public interface DegreeLevelDAO {
	public List<DegreeLevel> findAll();
	public DegreeLevel findById(String id);
	public int create(DegreeLevel dl);
	public int deleteById(String id);
	public int update(DegreeLevel dl);
}
