package com.naver.eng.appserver.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class MainController 
{
	
	@RequestMapping("/search")
    public Object index(Map<String, Object> model, @RequestParam(value = "name", required = false, defaultValue = "") String name) throws Exception {
		
		model.put("name", name+ " aaaa");
		return "index";
//		return mainService.getMessageList(param);
    }

	@RequestMapping("/search2")
    public Object index2(Map<String, Object> model) throws Exception {
		System.out.println("yyyyyyyyyy11111");
		
		
		return "index1";
//		return mainService.getMessageList(param);
    }

}
