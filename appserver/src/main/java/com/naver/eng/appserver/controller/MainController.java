package com.naver.eng.appserver.controller;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class MainController 
{
	
	@RequestMapping("/search")
    public Object index(Map<String, Object> model, 
    		@RequestParam(value = "name", required = true) String name, 
    		@RequestParam(value = "age", required = false, defaultValue = "") String age) 
    				throws Exception {
		
		
		model.put("value", name+ " aaaa " + age);
		model.put("nickName", "스파이더맨2");
		return "index";
    }

	@RequestMapping("/search2")
    public Object index2(Map<String, Object> model) throws Exception {
		return "index1";
    }

}
