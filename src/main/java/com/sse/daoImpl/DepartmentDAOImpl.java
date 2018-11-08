package com.sse.daoImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import com.sse.dao.DepartmentDAO;
import com.sse.model.Department;

public class DepartmentDAOImpl implements DepartmentDAO {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	private static final String COUNT = "SELECT count(*) FROM department WHERE dept_id = ?";
	
	public boolean deptExists(String deptId) {
		int count = jdbcTemplate.queryForObject(COUNT, Integer.class, deptId);
		if(count == 0) {
    		        return false;
		} else {
			return true;
		}
	}

	@Override
	public List<Department> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Department DeptById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int createDept(Department dep) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteDepById(String id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateDep(Department dep) {
		// TODO Auto-generated method stub
		return 0;
	}
}
