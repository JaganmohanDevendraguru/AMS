package com.sse.daoImpl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.sse.dao.UniversityDAO;
import com.sse.model.University;

@Repository
public class UniversityDAOImpl implements UniversityDAO {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	private static final String SELECTALL = "SELECT * FROM university";
	private static final String INSERT = "INSERT INTO `university` (`uni_code`, `uni_name`, `email`, `phone`, `street`, `address`, `city`, `state`, `zip`, `country`, `president`) VALUES "
										+ "('?', '?', '?', '?', '?', '?', '?', '?', '?', '?','?');";
	private static final String SELECTONE = "SELECT * FROM university where uni_code=?";
	private static final String DELETE = "DELETE FROM university where uni_code=?";
	private static final String UPDATE = "UPDATE university SET uni_name=?, president=?, email=?, phone=?,"
										+ " street=?, address=?, city=?, state=?, country=?, zip=? where uni_code=?";
	
	
    public List<University> findAll() {
        List<University> result = jdbcTemplate.query(
                SELECTALL,new UniRowMapper()
        );
        return result;
    }
    
/*    public List<University> getAllUnis() {
    	   String sql = "SELECT * FROM university";
    	   List<University> result = jdbcTemplate.query(sql, new BeanPropertyRowMapper<University>(University.class));
    	   return result;
    	}*/

    public int createUniversity(University uni) {
    	String code = uni.getUni_code();
    	String name = uni.getUni_name();
    	String phone = uni.getPhone();
    	String email = uni.getEmail();
    	String pres = uni.getPresident();
    	String st = uni.getStreet();
    	String address = uni.getAddress();
    	String city = uni.getCity();
    	String state = uni.getState();
    	int zip = uni.getZip();
    	String country = uni.getCountry();
        return jdbcTemplate.update(INSERT, new Object[] {
                code, name, email, phone, st, address, city, state, zip, country, pres
        });
    }
    
    public University findUniById(String id) {
    	return jdbcTemplate.queryForObject(SELECTONE, new Object[] {id}, new UniRowMapper());
   
    }
    
	public int deleteUniById(String id) {
		return jdbcTemplate.update(DELETE, new Object[] {id});
	}
	
	public int updateUni(University uni) {
		String code = uni.getUni_code();
    	String name = uni.getUni_name();
    	String phone = uni.getPhone();
    	String email = uni.getEmail();	
    	String pres = uni.getPresident();
    	String st = uni.getStreet();
    	String address = uni.getAddress();
    	String city = uni.getCity();
    	String state = uni.getState();
    	int zip = uni.getZip();
    	String country = uni.getCountry();
		return jdbcTemplate.update(UPDATE, new Object[] {
                name, pres, email, phone, st, address, city, state, country,zip, code
        });
	}

}

class UniRowMapper implements RowMapper<University> {
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
