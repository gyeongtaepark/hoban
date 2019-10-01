package com.naver.eng.appserver.repository;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class UserDao {
	
	@Autowired
	JdbcTemplate jdbcTemplate;

	public List<Map<String, Object>> select(String id) {
		 return jdbcTemplate.queryForList("SELECT * FROM sample.user where userid = '"+id+ "'");
	}
	
	public void insert(String userid, String name, String password, String address, String zipcode, String nickName) {
		String 
		sql = "INSERT INTO user (userid, name, password, address, zipcode, nickname) "
				+ "VALUES (?,?,?,?,?,?)";
		jdbcTemplate.update(sql, userid, name, password,address, zipcode, nickName);
	}

	public void delete(String userid) {
		String sql = "DELETE FROM user WHERE userid = ?";
		
		jdbcTemplate.update(sql, userid);
	}
	
	//수정.

}
