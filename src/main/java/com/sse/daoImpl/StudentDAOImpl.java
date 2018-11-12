package com.sse.daoImpl;

import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.sse.dao.StudentDAO;
import com.sse.mapper.StuRowMapper;
import com.sse.model.Student;

@Repository
public class StudentDAOImpl implements StudentDAO {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	private static final String SELECTALL = "select * from student";
	private static final String FINDONE = "select * from student where studentId=?";
	private static final String DELETEONE = "";
	private static final String UPDATEONE = "";
	
	public boolean loginValidate(String userName, String pass) {
		return true;
	}

	@Override
	public List<Student> findAll() {
		return jdbcTemplate.query(SELECTALL, new StuRowMapper());
	}

	@Override
	public Student findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public Student findByEmail(String email) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int create(Student cs) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteById(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(Student cs) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Student findByToken(String token) {
		// TODO Auto-generated method stub
		return null;
	}
}
