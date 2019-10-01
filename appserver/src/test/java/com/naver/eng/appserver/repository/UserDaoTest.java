package com.naver.eng.appserver.repository;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.naver.eng.appserver.exception.SqlException;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserDaoTest {

	@Autowired
	UserDao userDao;

	@Test
	public void selectTest() {
		userDao.delete("kingssnow");
		
		userDao.insert("kingssnow", "aaa", "1234","우리집", "00000", "박촐뉨.");
		
		List<Map<String, Object>> select = userDao.select("kingssnow");
		
		Assert.assertEquals(select.get(0).get("name"), "aaa");
		Assert.assertEquals(select.get(0).get("password"), "1234");
	}
	
	@Test
	public void insertTest() throws SqlException {
		String name = "박경태";
		
		userDao.delete("kingssnow");
		userDao.insert("kingssnow", name, "1234","우리집", "00000", "박촐뉨.");
		userDao.insert("kingssnow2", name, "12345","우리집2층", "00000", "박촐뉨.");
		
		List<Map<String, Object>> select = userDao.select("kingssnow");
		
		Assert.assertTrue(select.size() == 1);
		
		Assert.assertEquals(select.get(0).get("name"), name);
		userDao.delete("kingssnow");
		userDao.delete("kingssnow2");
	
	}
	
	@Test
	public void deleteTest() throws SqlException {
		String name = "박경태";
		
		userDao.delete("kingssnow");
		userDao.insert("kingssnow", name, "1234","우리집", "00000", "박촐뉨.");
		
		List<Map<String, Object>> before = userDao.select("kingssnow");
		Assert.assertTrue(before.size() == 1);
		

		userDao.delete("kingssnow");
		
		List<Map<String, Object>> after = userDao.select("kingssnow");
		
		Assert.assertTrue(after.size() == 0);
		
	
	}

}
