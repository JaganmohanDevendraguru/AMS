package com.sse.dao;

import java.util.List;

import com.sse.model.EmpProfile;

public interface EmpProfileDAO {
	public List<EmpProfile> findAll();
	public EmpProfile findById(String id);
	public int create(EmpProfile ep);
	public int deleteById(String id);
	public int update(EmpProfile ep);
}
