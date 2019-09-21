package com.naver.eng.appserver.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.naver.eng.appserver.business.NickName;


@Controller
public class ContentController 
{
	@Autowired
	NickName nicknameBusiness;
	
	@Autowired
	JdbcTemplate datasource;
	
	@RequestMapping("/input")
    public Object input(Map<String, Object> model) throws Exception {

		
		
		List<Map<String, Object>> queryForList = datasource.queryForList("SELECT * FROM sample.user where id = 'id1'");
		String name1 = nicknameBusiness.getNickName("ff");
		
		
		model.put("nick", queryForList.get(0).get("name"));
		model.put("nick1", name1);
		model.put("img","https://s.pstatic.net/static/www/mobile/edit/2016/0705/mobile_212852414260.png");
		
		return "input";
    }

	@RequestMapping("/list")
    public Object list(Map<String, Object> model) throws Exception {
		// 입력된 정보의 리스트 노출.
		return "index";
    }

	@RequestMapping("/view")
    public Object view(Map<String, Object> model) throws Exception {
		// 입력된 컨텐츠의 상세 화면.
		return "index";
    }
}
