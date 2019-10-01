package com.naver.eng.appserver.dao;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import com.naver.eng.appserver.exception.SqlException;
import com.naver.eng.appserver.repository.ProductDAO;

import junit.framework.Assert;

public class TestMySql {

	@Autowired
	ProductDAO productDAO;
	
	//@Test
	public void testInsert() throws SqlException {
		productDAO.insertProduct("333", "aa1a","QQQQa");
		List<Map<String, Object>> queryForList = productDAO.selectProduct("333");
		Assert.assertEquals("aa1a",queryForList.get(0).get("name"));
		Assert.assertEquals("QQQQa",queryForList.get(0).get("nickname"));

		productDAO.deleteProdect("333");
		
		
	}
	
	public void testDelte() throws SqlException {
		productDAO.deleteProdectName("aa1a");

		
	}
	
}
