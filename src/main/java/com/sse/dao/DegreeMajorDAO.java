package com.sse.dao;

import java.util.List;

import com.sse.model.DegreeMajor;

public interface DegreeMajorDAO {
	public List<DegreeMajor> findAll();
	public DegreeMajor findById(String id);
	public int create(DegreeMajor dm);
	public int deleteById(String id);
	public int update(DegreeMajor dm);
}
