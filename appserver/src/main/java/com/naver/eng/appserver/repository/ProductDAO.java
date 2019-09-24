package com.naver.eng.appserver.repository;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.naver.eng.appserver.exception.SqlException;

@Component
public class ProductDAO {

	@Autowired
	JdbcTemplate jdbcTemplate;

	public List<Map<String, Object>> selectProduct(String id) {
		 return jdbcTemplate.queryForList("SELECT * FROM sample.user where id = '"+id+ "'");
	}
	
	public void insertProduct(String id, String name, String nickname) throws SqlException {
		String 
		sql = "INSERT INTO user (id, name, password, nickname, extra) "
				+ "VALUES (?,?,?,?,?)";
		//SQL
		try {
			jdbcTemplate.update(sql, id, name, nickname, nickname, nickname);
		}catch (Exception e) {
			throw new SqlException();
		}
	}

	public void updateProductName(String id, String name) {
		String sql = "UPDATE user SET name = ? WHERE id = ?";
		
		jdbcTemplate.update(sql, name, id);

	}
	
	
	public void deleteProdect(String id) {
		String sql = "DELETE FROM user WHERE (id = ?)";
		
		jdbcTemplate.update(sql, id);
	}
	
	public void deleteProdectName(String name) {
		String sql = "DELETE FROM user WHERE (name = ?)";
		
		jdbcTemplate.update(sql, name);
	}
	
}
