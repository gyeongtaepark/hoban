package com.naver.eng.appserver.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.naver.eng.appserver.business.NickName;
import com.naver.eng.appserver.exception.SqlException;
import com.naver.eng.appserver.repository.ProductDAO;


@Controller
public class ContentController 
{
	@Autowired
	NickName nicknameBusiness;
	
	@Autowired
	JdbcTemplate datasource;
	
	@Autowired
	ProductDAO productDAO;

	@RequestMapping("/join")
    public Object join(Map<String, Object> model) {
		return "join";
	}

	@RequestMapping("/save")
    public Object save(Map<String, Object> model,
    		@RequestParam(value = "title", required = false) String title,
    		@RequestParam(value = "name", required = false) String name
        	) throws Exception {
		
		System.out.println("화면에서 전달받은 title===" + title);
		System.out.println("화면에서 전달받은 name===" + name);

		model.put("title", title);
		model.put("name", name);
		return "save";
	}

	
	
	
	@RequestMapping("/input")
    public Object input(Map<String, Object> model,
    		@RequestParam(value = "title", required = false, defaultValue = "") String title,
    		@RequestParam(value = "name", required = false, defaultValue = "") String name
        	) throws Exception {

		
		
		System.out.println("data===" + name);
		System.out.println("title===" + title);
		
		List<Map<String, Object>> queryForList = productDAO.selectProduct("id1");
		
		model.put("nick", queryForList.get(0).get("name"));
		
		try {
			productDAO.insertProduct("333", "aa1a","QQQQa");
			
			System.out.println("DB에서 가져온 데이터 :" +productDAO.selectProduct("333"));
		}catch (SqlException e) {
			model.put("nick", "저장을 실패하였습니다.");
		}
		productDAO.deleteProdectName("aa1a");
		productDAO.updateProductName("id1","ooo0");
		
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
