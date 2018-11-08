package com.sse.dao;

import java.util.List;

import com.sse.model.StdPermission;

public interface StdPermissionDAO {
	public List<StdPermission> findAll();
	public StdPermission findById(String id);
	public int create(StdPermission sp);
	public int deleteById(String id);
	public int update(StdPermission sp);
}
