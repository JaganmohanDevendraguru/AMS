package com.sse.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.sse.model.Student;

public class StuRowMapper implements RowMapper<Student> {

	@Override
	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		Student stu = new Student();
		stu.setStuId(rs.getString("uni_code"));
		stu.setDeptId(rs.getString("uni_name"));
		stu.setSsn(rs.getInt("president"));
		stu.setMajor(rs.getString("email"));
		stu.setLevel(rs.getString("phone"));
		stu.setFirstName(rs.getString("uni_name"));
		stu.setLastName(rs.getString("president"));
		stu.setUserName(rs.getString("email"));
		stu.setPassword(rs.getString("phone"));
		stu.setEmail(rs.getString("email"));
		stu.setPhone(rs.getInt("phone"));
		stu.setStreet(rs.getString("street"));
		stu.setAddress(rs.getString("address"));
		stu.setCity(rs.getString("city"));
		stu.setState(rs.getString("state"));
		stu.setCountry(rs.getString("country"));
		stu.setZip(rs.getInt("zip"));
		stu.setStuType(rs.getString("state"));
		stu.setAuthToken(rs.getString("country"));
		stu.setPassport(rs.getString("country"));
		stu.setActiveFlag(rs.getString("country"));
		return stu;
	}

}
