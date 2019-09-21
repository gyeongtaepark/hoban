package com.naver.eng.appserver.business;

import org.springframework.stereotype.Service;

@Service
public class NicknameBusiness implements NickName {
	public String getNickName(String id) {
		return "자바에서 전달된 닉네임";
	}

}

/*
interface 이름 {
	String getNickname(String id);
	
}
*/