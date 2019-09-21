package com.naver.eng.appserver.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.naver.eng.appserver.business.NickName;
import com.naver.eng.appserver.business.NicknameBusiness;


@Controller
public class ContentController 
{
	@Autowired
//	NicknameBusiness nbo;
//	NickName nickName2;
	NickName nicknameBusiness;
	
	// Bean을 통해 설정한 jdbc templete을 자동으로 연결
	@Autowired
	JdbcTemplate jdbctemplete;
	
	
	@RequestMapping("/input")
    public Object input(Map<String, Object> model) throws Exception {
		// 정보를 입력 받는 화면.
		
		List<Map<String, Object>> queryForList = jdbctemplete.queryForList("SELECT * FROM user  WHERE id = '1234'");

		// new 로 만든 클래스		
		NicknameBusiness nicknameBusiness = new NicknameBusiness();
		String name = nicknameBusiness.getNickName("ff");   // 클래스형 인스턴스 생성
		
		//spring에서 온 클래스로 만든 클래스
//		String name1 = nbo.getNickName("ff");
//		String name1 = nickName2.getNickName("ff");
		String name1 = nicknameBusiness.getNickName("ff");
		
		model.put("nick", queryForList.get(0).get("name"));
//		model.put("nick", name);
		model.put("nick1", name1);
		
		model.put("img", "http 이미지 주소");
		
				
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
