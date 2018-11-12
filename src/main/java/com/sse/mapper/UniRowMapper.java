package com.sse.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.sse.model.University;

public class UniRowMapper implements RowMapper<University>{
	
		@Override
		public University mapRow(ResultSet rs, int rowNum) throws SQLException {
			University uni = new University();
			uni.setUni_code(rs.getString("uni_code"));
			uni.setUni_name(rs.getString("uni_name"));
			uni.setPresident(rs.getString("president"));
			uni.setEmail(rs.getString("email"));
			uni.setPhone(rs.getString("phone"));
			uni.setStreet(rs.getString("street"));
			uni.setAddress(rs.getString("address"));
			uni.setCity(rs.getString("city"));
			uni.setState(rs.getString("state"));
			uni.setCountry(rs.getString("country"));
			uni.setZip(rs.getInt("zip"));
			return uni;
		}
	}
