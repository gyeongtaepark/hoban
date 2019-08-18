package com.naver.eng.appserver.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class ProfileController 
{
	
	@RequestMapping("/input")
    public Object input(Map<String, Object> model) throws Exception {
		// 정보를 입력 받는 화면.
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
