package com.naver.eng.appserver.controller;

import java.util.Map;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.naver.eng.appserver.business.NicknameBusiness;
import com.naver.eng.appserver.model.Param;
import com.naver.eng.appserver.service.MainService;


@Controller
public class MainController 
{
	@Autowired
	NicknameBusiness nbo;
	@Autowired
	private MainService mainService;
	
	
	@RequestMapping("/search")
    Object index(Map<String, Object> model) throws Exception {
		Param param = new Param("aaa");
		return "index";
//		return mainService.getMessageList(param);
    }
}
